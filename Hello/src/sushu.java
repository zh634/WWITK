/*import static java.lang.System.*;
import java.util.*;;
public class sushu {
private int a,b;
boolean isprime(int m)
{ for(int j=2;j<m;j++)
   {
    if(m%j==0)
	return false;
   }
   return true;

}
//void getsushu()
{   Scanner input=new Scanner(System.in);
	out.println("请输两个数：");
	int a=input.nextInt();
	int b=input.nextInt();
	if(a>b)
	{ int c;
	   c=a;
	   b=a;
	   a=c;
	}
	for(int i=a;i<b;i++)
	{
		if(i<2) continue;
		if(isprime(i))
		out.println(i);
		else continue;
	}
	
}//
 sushu(int a1,int b1)
{  
	 a=a1;
	 b=b1;
}
void getsushu()
{
	if(a>b)
	{ int c;
	   c=a;
	   b=a;
	   a=c;
	}
	for(int i=a;i<b;i++)
	{
		if(i<2) continue;
		if(isprime(i))
		out.println(i);
		else continue;     //跳出当前循环
	}
	
}

	
	
  public static void main(String[] args) {
		    Scanner input=new Scanner(System.in);
			out.println("请输两个数：");
			 int a1=input.nextInt();
			 int b1=input.nextInt();
		     sushu p=new sushu(a1,b1);
		     p.getsushu();

	}

}*/
import static java.lang.System.*;
import java.util.*;;
public class sushu {
private int a,b;

 sushu(int a1,int b1)
{  
	 a=a1;
	 b=b1;
}
void getsushu()
{  
	if(a>b)
	{ int c;
	   c=a;
	   b=a;
	   a=c;
	}
	for(int i=a;i<b;i++)
	{    boolean flag=true;
		//if(i<2) continue;
		for(int j=2;j<i;j++)
		    if(i%j==0) 
		    {
		    flag=false;
		    continue;
		   
		   }
	
		if(flag==true)	
		out.println(i);

	}
	
}
	
  public static void main(String[] args) {
		    Scanner input=new Scanner(System.in);
			out.println("请输两个数：");
			 int a1=input.nextInt();
			 int b1=input.nextInt();
		     sushu p=new sushu(a1,b1);
		     p.getsushu();

	}

}











