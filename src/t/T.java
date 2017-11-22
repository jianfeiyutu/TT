package t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public class T {
	public static void main(String[] args) {
		
		System.out.println(UUID.randomUUID().toString());
//		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");  
//		   
//		System.out.println(names);
//		Collections.sort(names, new Comparator<String>() {  
//		    @Override  
//		    public int compare(String a, String b) {  
//		        return a.compareTo(b);  
//		    }  
//		}); 
//		System.out.println(names);
//		Collections.sort(names, (String a, String b) -> {  
//		    return b.compareTo(a);  
//		}); 
//		System.out.println(names);
//		
//	 	Converter<String, Integer> converter = (from) -> Integer.valueOf(from);  
//    	Integer converted = converter.convert("123");  
//    	System.out.println(converted);    // 123  
//    	
//    	
//    	List<String> stringCollection = new ArrayList<>();  
//    	stringCollection.add("ddd2");  
//    	stringCollection.add("aaa2");  
//    	stringCollection.add("bbb1");  
//    	stringCollection.add("aaa1");  
//    	stringCollection.add("bbb3");  
//    	stringCollection.add("ccc");  
//    	stringCollection.add("bbb2");  
//    	stringCollection.add("ddd1"); 
//        stringCollection.stream().filter((s)->s.startsWith("b")).forEach(System.out::println);
//        stringCollection.stream().map(String::toUpperCase)
//        .sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);
//        
//    // "aaa2", "aaa1"  
	}
}
