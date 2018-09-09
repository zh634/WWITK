import java.util.*;

public class lie1 {

	public static void main(String[] args) {
	//Queue p=new LinkedList();
	  Queue p=new PriorityQueue();
	p.add("12");
	p.add("34");
	p.add("56");
	/*for(Object a:p)
	{
		System.out.println(a);
	}*/
	//Iterator<Srting>a=p.element();
	while(!p.isEmpty())
	{
		System.out.println(p.poll());
	 
	}
	//System.out.println(p.element());
    /*Iterator<String> a=p.iterator();
    while(a.hasNext())
    {System.out.println(a.next());}*/
	}

}
