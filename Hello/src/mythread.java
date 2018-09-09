import java.lang.Thread;
class mythread                           //定义的其他类向thread类传递参数,调用线程
{   
	public static void main(String[] args) {
	xiec p1=new xiec(100 );
	Thread  p=new Thread (p1);	
     p.start();
}
}

 class xiec implements Runnable //通过继承实现单一线程
{    int n;
     xiec(int n){this.n=n;}
    
	public void run()
	{
	  for(int i=0;i<n;i++)
	  System.out.println(" "+i);
	 try {
		 Thread.sleep(500);
	      }
	 catch(InterruptedException e) {}
	   
	}
	
}
