import java.lang.Thread;
class mythread                           //�������������thread�ഫ�ݲ���,�����߳�
{   
	public static void main(String[] args) {
	xiec p1=new xiec(100 );
	Thread  p=new Thread (p1);	
     p.start();
}
}

 class xiec implements Runnable //ͨ���̳�ʵ�ֵ�һ�߳�
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
