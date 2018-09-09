
/*public class jich {
	String name;
	int age;
	static int x;
	jich(String a,int b)
	{
		name=a;
		age=b;
	}
	jich(int age,String name)
	{
		this.age=age;
	    this.name=name;		
	}
	jich(String n)
	{name=n;
	 age=-1;		
	}
	private jich()
	{
		this("",0);
	}
	void sayh()
	{
	System.out.println("Hello! My name is"+name);	
		
	}
	
	void sayh(jich ano)
	{
	System.out.println("Hello!"+"ano.name"+"My name is"+name);	
		
	}
	boolean isol(int anoage)
	{
		boolean flag;
		if(age>anoage)
			flag=true;
		else
			flag=false;
		return flag;
			
	}
	
	public static void main(String[] args) {
		System.out.println("Hello! World");	
		
	}

}class stu extends jich
{
	String school;
	int sorce;
	
	void sayh()
	{
	System.out.println("Hello!"+"My name is"+name+"My Sxhool is"+school);	
		
	}
	
	void sayh(stu ano)
	{
	    if(school==ano.school)
		System.out.println("同学");
	}
boolean godst()
{
	return sorce>90;
}

void testthissuper()
{ int a;
  a=age;
  a=this.age;
  a=super.age;
	

}
stu(String nam,int ag,String school)
{
	super(nam,ag);
	this.school=school;
}
stu(){}
public static void main(String[] args) 
{ jich p=new jich("基类",10);
 //jich p4=new jich();
   jich p4=new stu("派生类",18,"20129");
  stu p1=new stu("派生类",15,"daxue");
  //p=p1;
  //jich p2=new stu("zhuu",20,"woeio");
   p.sayh();
   p1.sayh();
   p4=p1;
   p4.sayh();
  //p2.sayh();

}
}*/







