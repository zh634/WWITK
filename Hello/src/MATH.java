import static java.lang.System.*;

import java.util.Random;
public class MATH {

	public static void main(String[] args) {
	  out.print(Math.PI);
	  out.println(" ");
	  out.print(Math.pow(3,5));
	  out.println(Math.IEEEremainder(1.40,4.04));
	  out.println(" ");
	  out.print(Math.min(7, 0));
	 //���������
	   for(int i=0;i<10;i++)
	   { Random ran=new Random();
		    out.print(ran.nextInt(90)+1+" 10 ");//10��ʾ������Сȡֵ
		   
	   }
	   out.print(Math.random());
		out.print(Math.abs(-3.738));
		out.print(Math.sin(90.0));
		
		
	}

}
