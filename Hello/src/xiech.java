/*import java.lang.Thread;                //通过继承实现单一线程
public class xiech extends Thread

{   public void run()
	{
	  for(int i=0;i<100;i++)
		  System.out.println(" "+i);
	
	}

	public static void main(String[] args) {
		 xiech p=new  xiech();
		 p.start();

	}

}*/
import java.lang.Thread;               

class mythread                           //定义的其他类向thread类传递参数,调用线程
{   
	public static void main(String[] args) {
	xiech p1=new xiech(100 );
	Thread  p=new Thread (p1);	
     p.start();
}
}

public class xiech implements Runnable //通过继承实现单一线程
{    int n;
   xiech(int n){this.n=n;}
    
	public void run()
	{
	  for(int i=0;i<n;i++)
	  System.out.println(" "+i);
	 try {
		 Thread.sleep(500);
	 }catch(InterruptedException e) {}
	  
	  
	  
	}
	public static void main(String[] args) {}
}















