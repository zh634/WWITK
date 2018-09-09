/*import java.util.*;
//import static java.util.System.*;
public class chushihua {
 private String name;
 private int age;
 private static String nal;
 chushihua(String a,int b)
 {
	 name=a;
	 age=b; 
 }
 String getnam() //类的封装性
 {
	 return name;
 }
 int getage()
 {return age;}
 {
	 System.out.println("请输入国籍:");
	 Scanner S=new Scanner(System.in);
	 if(S.hasNext())                   //每定义一个对象就初始化一次
		 //S.next("nal");
		 nal=S.next();
 }
 static String getnal()
 {return nal;}
 
	
	public static void main(String[] args) {
		 chushihua p=new  chushihua("李华",20);
		 System.out.print(p.getage());
		 System.out.print(p.getnal());
		 chushihua p2=new  chushihua("李阳",21);
		 System.out.print(p.getage());
		 System.out.print(p.getnal());
		 
	}
}*/

/*import java.util.*;
//import static java.util.System.*;
public class chushihua {
 private String name;
 private int age;
 private static String nal;
 chushihua(String a,int b)
 {
	 name=a;
	 age=b; 
 }
 String getnam() //类的封装性
 {
	 return name;
 }
 int getage()
 {return age;}
 {
	 System.out.println("请输入国籍:");
	 Scanner S=new Scanner(System.in);
	 if(S.hasNext())                   //每定义一个对象就初始化一次
		 //S.next("nal");
		 nal=S.next();
 }
 static String getnal()
 {return nal;}
 
	
	     static  {
		 chushihua p=new  chushihua("李华",20);
		 System.out.print(p.getage());
		 System.out.print(p.getnal());
		 chushihua p2=new  chushihua("李阳",21);
		 System.out.print(p.getage());
		 System.out.print(p.getnal());
		 
	}
}*/






















