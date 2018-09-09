/*import java.util.Scanner;
import static java.lang.System.*;
 class calculator {
 int a,b;
calculator(){}
calculator(int a1,int b1)
{ a=a1;
  b=b1;
}
{   Scanner input=new Scanner(System.in);
	out.print("请从键盘输入两个整数数");
	a=input.nextInt();
	b=input.nextInt();
}
void add()
{  out.println(a+b);
}
void chu()throws ArithmeticException  //有上层抛出，调用他的函数处理
{  out.println(a/b);
}
	public static void main(String[] args) {
		calculator p=new calculator();
		try
		{ p.add();
		 p.chu();
			
		}catch(ArithmeticException aer){out.println("捕获异常"+aer);}  
		finally {out.println("主函数执行完毕");}
		
	}

}*/

/*import static java.lang.System.*;
import java.util.Scanner;;

public class calculator {
private int a,b;
calculator(){}
calculator(int a1,int b1)
{ a=a1;
  b=b1;
}
{   Scanner input=new Scanner(System.in);
	out.print("请从键盘输入两个整数数");
	a=input.nextInt();
	b=input.nextInt();
}
void add()
{out.println(a+b);
}
void chu()                               //由程序员自己抛出异常
{
try{out.println(a/b);}                   //监控错误

catch(ArithmeticException ae) {throw ae;} //捕捉错误抛出异常
}
	public static void main(String[] args) {
		calculator p=new calculator();
		try
		{ p.add();
		 p.chu();
			
		}catch(ArithmeticException aer){out.println("捕获异常"+aer);}  
		finally {out.println("主函数执行完毕");}
		
	

	}

}*/
import static java.lang.System.*;

import java.io.IOException;
import java.util.Scanner;;

public class calculator {
private int a,b;
calculator(){}
calculator(int a1,int b1)
{ a=a1;
  b=b1;
}
{   Scanner input=new Scanner(System.in);
	out.print("请从键盘输入两个整数数");
	a=input.nextInt();
	b=input.nextInt();
}
void add()
{out.println(a+b);
}
void chu()throws IOException                               //由程序员自己抛出异常
{
out.println(a/b);                  //监控错误
}
/*catch(ArithmeticException ae ) {throw ae;} //捕捉错误抛出异常
}*/
	public static void main(String[] args)throws IOException  {
		char operator;
		operator=(char) System.in.read();
		calculator p=new calculator();
		try
		{  switch(operator)
			{
	
		 case '+':p.add();
		 case '/': p.chu();
			}
			
		}catch(ArithmeticException aer){out.println("捕获异常"+aer);}  
		finally {out.println("主函数执行完毕");}
		
	

	}

}


















