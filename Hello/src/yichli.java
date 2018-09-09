/*class cuowu extends Exception     //自定义异常类
{    cuowu(String message)
	 {super(message);}
      cuowu(){};
}
public class yichli {

	public static void main(String[] args){
		try{int a=4;
		   int b=5;
		  if(a>0)
		throw new cuowu("imyichlei");             //一定要加关键字new因为抛出的是类对象
		  else System.out.println(a+b);
		  }
		catch(cuowu e) { String string = "errro"; //扑捉错误时候要要注意定义类对象
		System.out.println(string+e);}
		
	     }

}*/
