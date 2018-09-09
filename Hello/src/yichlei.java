/*import java.util.Scanner;
@SuppressWarnings("serial")      //放在所有的包之后，作用范围只是一个类在jdk1.8以下一个类中只允许出现一次
class noswap extends Exception
{ public noswap(){};
 noswap(String ms){
  super(ms);
  }
	
}
@SuppressWarnings("all") 
public class yichlei {
      int a,b;
	void swap() throws noswap{
	 Scanner input=new Scanner(System.in);
	   a=input.nextInt();
	   b=input.nextInt();
	  if(a<b)
		  System.out.println(a+b);
	  else
		  throw new noswap("输入错误");  //此处抛出的是一个异常类的对象
		
	}
	
	
	public static void main(String[] args) throws noswap {
		
		yichlei p=new yichlei();
		p.swap();
	}

}*/
