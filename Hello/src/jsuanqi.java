
public class jsuanqi {
	int a,b;
	char c;
	static  int restult=0;
	jsuanqi(int a,char c,int b)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	jsuanqi(char c,int b)
	{ this.c=c;
	  this.a=restult;
	  this.b=b;
			
	}
	jsuanqi(char c)
	{ this.a=restult;
	  this.c=c;
			
	}
	void jisun()
	{ switch(c)  
	{
	  case '+':restult=a+b; break;
	  case '-':restult=a-b; break;
	  case '*':restult=a*b; break;
	  case '=': System.out.println("结果为:"+restult); break;
	  default :System.out.println("输入错误");
	}

		
	}
	
		
	public static void main(String[] args) {
		jsuanqi a=new jsuanqi(7,'+',2);
		a.jisun();
		jsuanqi a1=new jsuanqi('*',8);
		a.jisun();
		jsuanqi a2=new jsuanqi('=');
		a2.jisun();
		
		
	}

}
