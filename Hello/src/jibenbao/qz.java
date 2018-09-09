/**package jibenbao;

import java.util.Scanner;

public class qz {
	  int sum=0;int a,b;
	   {
		   System.out.println("请输入两个整数:");
		   Scanner input =new Scanner(System.in);
		   if(input.hasNext())
		   {
			   a=input.nextInt();
			   b=input.nextInt();
		   }
	   }
	   void pq()
	   {
		   q:for(int j=a;j<b;j++)
		   {
			   for(int i=2;i<j;i++)
			   {
				   if(j%i==0)
					   continue q;
			   }
			   System.out.println(j);
			   
		   }
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		qz p =new qz();
		p.pq();

	}
}*/
package jibenbao;

/**import java.util.Scanner;
public class qz {
	  int sum=0;int a,b;
	   {
		   System.out.println("请输入两个整数:");
		   Scanner input =new Scanner(System.in);
		   if(input.hasNext())
		   {
			   a=input.nextInt();
			   b=input.nextInt();
		   }
	   }
	   boolean flag;
	   void pq()
	   {      
		   for(int j=a;j<b;j++)
		   {   
			   for(int i=2;i<j;i++)
			   { flag=true;
				   if(j%i==0)
				   {
				   flag=false;
				   break;
				  
				   }
			   }
			   if(flag==true)
			   System.out.println(j+" ");
			   
		   }
		   
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		qz p =new qz();
		p.pq();

	}
}*/

import java.util.Scanner;
public class qz {
	  int sum=0;int a,b;
	private boolean flase;
	   {
		   System.out.println("请输入两个整数:");
		   Scanner input =new Scanner(System.in);
		   if(input.hasNext())
		   {
			   a=input.nextInt();
			   b=input.nextInt();
		   }
	   }
	   boolean flag=flase;
	   void pq()
	   {      
		   for(int j=a;j<b;j++)
		   {
			   for(int i=2;i<j;i++)
			   { 
				   if(j%i==0)
				   break;
			   }
			   
			   if(flag==true)
			   System.out.println(j+" ");
			   
		   }
		   
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		qz p =new qz();
		p.pq();

	}
}













