import java.util.*;  
class arraylist{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("rmaa");//Adding object in arraylist  
list.add("shivani");  
list.add("sayan");  
list.add("sima");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}