/*interface aera
{  double PI=3.14;
   double get();
}
interface draw1
{ void draw();
}
class circle implements aera,draw1,Cloneable//标志接口
{     
	  double rad;
	  circle(){}
      circle(double a){rad=a;}
     @Override
	 public double get()
	 {  double area;
	     area= PI*rad*rad;
		 return area;
	 }
	 public void draw()
	 {
		System.out.println("circle");
	 }
	 public Object clone() throws CloneNotSupportedException
	 {
		 return super.clone();
	 }

}

public class jiekou2{

	public static void main(String[] args) {
	circle p=new circle(2.45);
	System.out.print(p.get()+" ");
	p.draw();
	circle p2=(circle)p.clone();
	System.out.print(p2.get()+" ");
	
	}

}*/

/*interface aera                              
{  double PI=3.14;
   double get();
}
interface draw1
{ void draw();
}
interface jisuan extends aera,draw1{};        //定义一个总接口
class circle implements jisuan,Cloneable
{     
	  double rad;
	  circle(){}
      circle(double a){rad=a;}
     @Override
	 public double get()
	 {  double area;
	     area= PI*rad*rad;
		 return area;
	 }
	 public void draw()
	 {
		System.out.println("circle");
	 }
	 public Object clone() throws CloneNotSupportedException
	 {
		 return super.clone();
	 }

}

public class jiekou2{

	public static void main(String[] args) {
	circle p=new circle(2.45);
	System.out.print(p.get()+" ");
	p.draw();
	
	try {
		circle p2 = (circle)p.clone();
	 } catch (CloneNotSupportedException e) {
	
	 e.printStackTrace();
	}
	  
	
	

	}

}*/

















