import static java.lang.System.*;
abstract class c
{
abstract void call();
void met()
{
out.println("非抽象方法");
}

}
class D extends c
{
 void call()
 {
	out.println("实例化"); 
 }

}


public class abstrlei {

	public static void main(String[] args) {
	
     c C=new D();
     D d=new D();
     C.met();
     d.met();
     C.call();
		
	}

}
