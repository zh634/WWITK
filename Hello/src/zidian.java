import java.util.*;
public class zidian {

	public static void main(String[] args) {
     Map a=new Hashtable();
     a.put("one",1);
     a.put("two", 2);
     a.put("three", 3);
     //Enumeration em=a
     System.out.println(a.get("one"));
     /*Set p=a.keySet();         //�ֵ��е�Ԫ�ز��ܱ���,��keySet()�������еļ�
     
     for(Object i:p)
     {
      System.out.println(a.get(i));
    	 
     }*/
     //System.out.println(a.get("one"));
    /* Set p=a.keySet();     //�ֵ��е�Ԫ�ز��ܱ���,��keySet()�������еļ�
     
     for(Object i:p)
     {
      System.out.println("key"+" "+i+"="+" "+a.get(i));
    	 
     }*/
     
    /*Set p=a.keySet();     //�ֵ��е�Ԫ�ز��ܱ���,��keySet()�������еļ�
     
     for(Map.Entry<K, V>:Map.)
     {
      System.out.println("key"+" "+i+"="+" "+a.get(i));
    	 
     }*/
     
    
     
	}

}
