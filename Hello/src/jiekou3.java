/*import java.util.Scanner;
interface sw{public void swap();}
public class jiekou3 implements sw
{    static int a,b;
    { Scanner input= new Scanner(System.in);
    	a=input.nextInt();
    	b=input.nextInt();
    }
     public void swap()
     {  int c;
       c=a;
       a=b;
       b=c;
        System.out.print(a+" ");
		System.out.print(b);
     }
	
	public static void main(String[] args) {
		jiekou3 p=new jiekou3();
		p.swap();
		
		

	}

}*/
import java.text.DecimalFormat;
import java.util.Scanner;
interface zhouch{public void zhouch();}
interface mianji extends zhouch{public double area();}
interface zjiek extends mianji,zhouch{}
public class jiekou3 implements mianji 
{    static int a,b;
    { Scanner input= new Scanner(System.in);
    	a=input.nextInt();
    
    }
     public double area()
     { 
    	 double area;
    	 area=Math.PI*Math.pow(a,2);
    	 return area;
     }
	  public void zhouch(){}
	  public static void main(String[] args) {
		jiekou3 p=new jiekou3();
		DecimalFormat p1=new DecimalFormat("0.0");
		System.out.println(p1.format(p.area()));
		
		

	}

}














