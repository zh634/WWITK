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
	out.print("��Ӽ�����������������");
	a=input.nextInt();
	b=input.nextInt();
}
void add()
{  out.println(a+b);
}
void chu()throws ArithmeticException  //���ϲ��׳����������ĺ�������
{  out.println(a/b);
}
	public static void main(String[] args) {
		calculator p=new calculator();
		try
		{ p.add();
		 p.chu();
			
		}catch(ArithmeticException aer){out.println("�����쳣"+aer);}  
		finally {out.println("������ִ�����");}
		
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
	out.print("��Ӽ�����������������");
	a=input.nextInt();
	b=input.nextInt();
}
void add()
{out.println(a+b);
}
void chu()                               //�ɳ���Ա�Լ��׳��쳣
{
try{out.println(a/b);}                   //��ش���

catch(ArithmeticException ae) {throw ae;} //��׽�����׳��쳣
}
	public static void main(String[] args) {
		calculator p=new calculator();
		try
		{ p.add();
		 p.chu();
			
		}catch(ArithmeticException aer){out.println("�����쳣"+aer);}  
		finally {out.println("������ִ�����");}
		
	

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
	out.print("��Ӽ�����������������");
	a=input.nextInt();
	b=input.nextInt();
}
void add()
{out.println(a+b);
}
void chu()throws IOException                               //�ɳ���Ա�Լ��׳��쳣
{
out.println(a/b);                  //��ش���
}
/*catch(ArithmeticException ae ) {throw ae;} //��׽�����׳��쳣
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
			
		}catch(ArithmeticException aer){out.println("�����쳣"+aer);}  
		finally {out.println("������ִ�����");}
		
	

	}

}


















