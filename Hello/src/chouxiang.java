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
 computer(caozuo p){p=this.p;}  //���캯��
 void set(caozuo p){this.p=p;}
 void write() {p.write();}      //���ݴ��ݵĲ�ͬ�����Բ�ͬ�豸�����ݽ��в���
 void read()  {p.read();}
}

public class chouxiang {
	
	public static void main(String[] args) {
		caozuo p4;
	    p4=new p3();              //��̬���ӿڿ������࣬�����ำֵ������ִ��������Ĳ���
	    computer com=new computer(p4);
	    p4.write();

 
	
	}

}*/
















