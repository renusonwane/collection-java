import java.util.*;  
public class hashset{  
public static void main(String args[]){  
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<String>();  
set.add("Ranu");  
set.add("sonu");  
set.add("Riya");  
set.add("maya");  
//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  