/*import java.lang.Thread;                //ͨ���̳�ʵ�ֵ�һ�߳�
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

class mythread                           //�������������thread�ഫ�ݲ���,�����߳�
{   
	public static void main(String[] args) {
	xiech p1=new xiech(100 );
	Thread  p=new Thread (p1);	
     p.start();
}
}

public class xiech implements Runnable //ͨ���̳�ʵ�ֵ�һ�߳�
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















