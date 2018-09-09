 /*import static java.lang.System.*;
interface readdat
{ public void read();
}
interface  writedata
{public void write();
}
interface caozuo extends readdat,writedata{}
 class p3 implements caozuo
{
  public void read()
  {  out.println("Mp3");
  }	
  public void write()
  { out.println("writeMp3");
  }
}
class neicun implements caozuo
{
	public void read()
	  {  out.println("ncun");
	  }	
	  public void write()
	  { out.println("nucun");
	  }
}
class computer
{caozuo p;
 void set(caozuo p){p.read();}
 void get(caozuo p) {p.write();}
}

public class chouxiang {

	public static void main(String[] args) {
	computer com=new computer();
	
	p3 a=new p3();
	com.set(a);
	neicun a2=new neicun();
	com.set(a2);
	
	}

}*/
 /*import static java.lang.System.*;
interface readdat
{ public void read();
}
interface  writedata
{public void write();
}
interface caozuo extends readdat,writedata{}
 class p3 implements caozuo
{
  public void read()
  {  out.println("Mp3");
  }	
  public void write()
  { out.println("writeMp3");
  }
}
class neicun implements caozuo
{
	public void read()
	  {  out.println("ncun");
	  }	
	  public void write()
	  { out.println("nucun");
	  }
}
class computer
{ caozuo p;
 computer(caozuo p){p=this.p;}  //构造函数
 void set(caozuo p){this.p=p;}
 void write() {p.write();}      //根据传递的不同参数对不同设备的数据进行操作
 void read()  {p.read();}
}

public class chouxiang {
	
	public static void main(String[] args) {
		caozuo p4;
	    p4=new p3();              //多态将接口看做基类，派生类赋值给基类执行派生类的操作
	    computer com=new computer(p4);
	    p4.write();

 
	
	}

}*/
















