//利用枚举变量输出元素
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public abstract class meiju1 {

	public static void main(String[] args) {
	Vector a=new Vector();
	for(int i=0;i<5;i++)
		a.add(new Integer(i));
	Enumeration<Integer> t = a.elements();
    while(t.hasMoreElements())
	System.out.println(t.nextElement());
	
	
	Iterator<Integer> p=a.iterator();           //定义一个指向容器的迭代器，对于向量这是主要使用的方法
	while(p.hasNext())
	{
		System.out.println(p.next());
	}
			
	}
}
