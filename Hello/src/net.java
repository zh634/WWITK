/*import java.io.*;
import java.net.*;
import static java.lang.System.*;
public class net {
	public static final int port=8087;    //定义监听端口
	ServerSocket aserver=null;            //等待客户端请求
	Socket socket=null;                   //客户端定义对象，指定ip地址
	try {
		try {
			aserver=new ServerSocket(port);//创建服务器监听套接口
			out.print("服务器启动"+aserver.getLocalPort());
		   }
		catch(IOException ioe){out.println("不能监听"+ioe)}
		}
	try { out.print("服务器进程阻塞，等待客户请求链接");
	      out.print("客户链接请求到"+aserver.getLocalPort());
	      socket=aserver.accept();
     	}
	catch(IOException ioe){out.println("错误"+ioe)};

	 BufferedReader areader=new BufferedReader;
	 (new IputStreamReader(socket.getIputStream()));
	 PrintWriter swriter=new  PrintWriter;
	 
	 
	 
            
	

	
	
	
	
	public static void main(String[] args) {
		

	}

}*/
