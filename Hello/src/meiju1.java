//����ö�ٱ������Ԫ��
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
	
	
	Iterator<Integer> p=a.iterator();           //����һ��ָ�������ĵ���������������������Ҫʹ�õķ���
	while(p.hasNext())
	{
		System.out.println(p.next());
	}
			
	}
}
