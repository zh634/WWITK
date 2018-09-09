/*interface std{void input();}
abstract class stu
{
	
 void output()
{System.out.println("姓名:");
}
abstract void display(); 
}*/

/*public class leilxi extends stu
{
   void output()
   {System.out.println("姓名:"+"年龄:");
	   
   }
	public static void main(String[] args) {
		leilxi s=new leilxi();
		
	}
}*/

/*public class leilxi extends stu implements std
{
	void display()
	{
		System.out.println("这是一个测试");
	}
	
   public void output()
   {System.out.println("姓名:"+"年龄:");
	   
   }
	
	public void input()
	{System.out.println("这是一个测试");
		
	}
	public static void main(String[] args) {
		leilxi s=new leilxi();
		s.output();
		s.input();
		s.display();
	}
}*/

interface std{void input();}
class stu
{ String name;
   String num;
	 stu(String name,String num)
	{ this.name=name;
	  this.num=num;
	}
void output()
{System.out.println("姓名:"+name+','+"学号"+num);
}

}


public class leilxi extends stu implements std
{
	 int age;
	 leilxi(String name,String num,int age)
	 {    super(name,num); //父类的构造函数必须放在基类之前
		  this.age=age;
		
			
	 }
	 
	void display()
	{
		System.out.println("这是一个测试");
	}
	public void input()
	{
		
	}
   
	public static void main(String[] args) {
		leilxi s=new leilxi("张三","2012891",20);
		s.output();
		s.input();
		s.display();
	}
}





















