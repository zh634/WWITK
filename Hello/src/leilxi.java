/*interface std{void input();}
abstract class stu
{
	
 void output()
{System.out.println("����:");
}
abstract void display(); 
}*/

/*public class leilxi extends stu
{
   void output()
   {System.out.println("����:"+"����:");
	   
   }
	public static void main(String[] args) {
		leilxi s=new leilxi();
		
	}
}*/

/*public class leilxi extends stu implements std
{
	void display()
	{
		System.out.println("����һ������");
	}
	
   public void output()
   {System.out.println("����:"+"����:");
	   
   }
	
	public void input()
	{System.out.println("����һ������");
		
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
{System.out.println("����:"+name+','+"ѧ��"+num);
}

}


public class leilxi extends stu implements std
{
	 int age;
	 leilxi(String name,String num,int age)
	 {    super(name,num); //����Ĺ��캯��������ڻ���֮ǰ
		  this.age=age;
		
			
	 }
	 
	void display()
	{
		System.out.println("����һ������");
	}
	public void input()
	{
		
	}
   
	public static void main(String[] args) {
		leilxi s=new leilxi("����","2012891",20);
		s.output();
		s.input();
		s.display();
	}
}





















