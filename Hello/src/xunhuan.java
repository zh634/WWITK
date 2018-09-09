import java.io.IOException;

public class xunhuan {
    int n;
     {
    	 try {
			n=System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
	public  void main(String[] args) {
		int sum=0;
		
	for(int i=0;i<=n;i++)
	{sum=sum+i;
	}
  System.out.println(sum);
}
}
