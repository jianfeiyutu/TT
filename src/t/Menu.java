package t;

import java.util.List;

public class Menu implements TreeEntity<Menu>{
	 public String id;  
	    public String name;  
	    public String parentId;  
	    public List<Menu> childList;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getParentId() {
			return parentId;
		}
		public void setParentId(String parentId) {
			this.parentId = parentId;
		}
		public List<Menu> getChildList() {
			return childList;
		}
		public void setChildList(List<Menu> childList) {
			this.childList = childList;
		}
		@Override
		public String toString() {
			return "Menu [id=" + id + ", name=" + name + ", parentId=" + parentId + ", childList=" + childList + "]";
		}  
	    
}
