/*import java.io.*;
import java.net.*;
import static java.lang.System.*;
public class net {
	public static final int port=8087;    //��������˿�
	ServerSocket aserver=null;            //�ȴ��ͻ�������
	Socket socket=null;                   //�ͻ��˶������ָ��ip��ַ
	try {
		try {
			aserver=new ServerSocket(port);//���������������׽ӿ�
			out.print("����������"+aserver.getLocalPort());
		   }
		catch(IOException ioe){out.println("���ܼ���"+ioe)}
		}
	try { out.print("�����������������ȴ��ͻ���������");
	      out.print("�ͻ���������"+aserver.getLocalPort());
	      socket=aserver.accept();
     	}
	catch(IOException ioe){out.println("����"+ioe)};

	 BufferedReader areader=new BufferedReader;
	 (new IputStreamReader(socket.getIputStream()));
	 PrintWriter swriter=new  PrintWriter;
	 
	 
	 
            
	

	
	
	
	
	public static void main(String[] args) {
		

	}

}*/
