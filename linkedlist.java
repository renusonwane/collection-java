import java.util.*;  
public class linkedlist {  
public static void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
al.add("Ritika");  
al.add("shrikant");  
al.add("Ritesh");  
al.add("Ajay");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}