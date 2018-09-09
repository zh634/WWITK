/*import java.util.*;
public class sushulxi {

	public static void main(String[] args) {
		int m,n;
		{ 	
		     Scanner input =new Scanner(System.in);
		     System.out.println("请输入两个数：");
		      n=input.nextInt();
		      m=input.nextInt();
		}
		
		for(int j=n;j<m;j++)
		{
		
		boolean flag=true; 
		q:for(int i=2;i<j;i++) 
		  if(j%i==0)
		  {
			flag=false;
			//break; 
			continue q;
		  }
		 
		if(flag==true)
		System.out.print(j+" "); 
		}
		
	
	}
}*/
import java.util.*;
public class sushulxi {

	public static void main(String[] args) {
		int m,n;
		{ 	
		     Scanner input =new Scanner(System.in);
		     System.out.println("请输入两个数：");
		      n=input.nextInt();
		      m=input.nextInt();
		}
		
		q:for(int j=n;j<m;j++)
		{
		for(int i=2;i<j;i++) 
		  if(j%i==0)
		 continue q;
		System.out.print(j+" "); 
		}
		
	
	}
}


