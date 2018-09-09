import java.lang.Thread;
public class duoxianch {

	public static void main(String[] args) throws InterruptedException {
		xianch a=new xianch();
		/*xianch a1=new xianch();
		xianch a2=new xianch();*/
		Thread p=new  Thread(a);
		Thread p1=new Thread(a);
		Thread p2=new Thread(a);
		p2.yield();
		Thread p3=new Thread(a);
		
		 p.start();
		 p1.start();
		 p2.start();
		 p3.sleep(100);
		 p3.start();
		 
		
	}
}
class xianch implements Runnable
{
	static int n=10;
	public void run()
	{
		System.out.println("ÂòÆ±"+n--);
		
		
	}
}
