import java.util.Scanner;
class yich extends Exception
{yich(){};
 yich(String cuowu){super(cuowu);}	
}

public class zdyiyichlei 
{
	int a,b,c;
	/*{Scanner input=new Scanner("System.in");
	 a=input.nextInt();
	 b=input.nextInt();
	 c=input.nextInt();	
	}*/
	zdyiyichlei(int a1,int b1,int c1){a=a1;b=b1;c=c1;}
	
	boolean sanjiao()
	{  if(a+b<c)     return false;
	  else if (a+c<b)return false;
	  else return true;
		
	}
	public static void main(String[] args)throws yich
	{
		zdyiyichlei s=new zdyiyichlei(1,2,3);
		if(s.sanjiao()==false)
		{
			System.out.println("不能构成三角形");
			throw new yich("不能构成三角形");
		}
		
	}

}
