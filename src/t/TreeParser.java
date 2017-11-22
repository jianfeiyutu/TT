package t;

import java.util.ArrayList;
import java.util.List;

public class TreeParser {
	/** 
     * ������������ 
     * @param topId 
     * @param entityList 
     * @return 
     * @author jianda 
     * @date 2017��5��29�� 
     */  
    public static <E extends TreeEntity<E>> List<E> getTreeList(String topId, List<E> entityList) {  
        List<E> resultList=new ArrayList<>();  
          
        //��ȡ����Ԫ�ؼ���  
        String parentId;  
        for (E entity : entityList) {  
            parentId=entity.getParentId();  
            if(parentId==null||topId.equals(parentId)){  
                resultList.add(entity);  
            }  
        }  
          
        //��ȡÿ������Ԫ�ص������ݼ���  
        for (E entity : resultList) {  
            entity.setChildList(getSubList(entity.getId(),entityList));  
        }  
          
        return resultList;  
    }  
      
    /** 
     * ��ȡ�����ݼ��� 
     * @param id 
     * @param entityList 
     * @return 
     * @author jianda 
     * @date 2017��5��29�� 
     */  
    private  static  <E extends TreeEntity<E>>  List<E> getSubList(String id, List<E> entityList) {  
        List<E> childList=new ArrayList<>();  
        String parentId;  
          
        //�Ӽ���ֱ���Ӷ���  
        for (E entity : entityList) {  
            parentId=entity.getParentId();  
            if(id.equals(parentId)){  
                childList.add(entity);  
            }  
        }  
          
        //�Ӽ��ļ���Ӷ���  
        for (E entity : childList) {  
            entity.setChildList(getSubList(entity.getId(), entityList));  
        }  
          
        //�ݹ��˳�����  
        if(childList.size()==0){  
            return null;  
        }  
          
        return childList;  
    }  
}
