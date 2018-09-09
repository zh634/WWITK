import java.util.Scanner;
public class l6 {
	int n;
	
	{
	
	 Scanner input =new Scanner("System.in");
	 n=input.nextInt(n);
	}
	int sum=0;
	void qsum()
	{
	for(int i=0;i<=n;i++)
	{
		sum=sum+i;
		
	}
	System.out.println(sum);
	}
	public static void main(String[] args) {
		l6 p=new l6();
		p.qsum();
		
    
	}

}
