package TH6;


import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
public class Server {
public static void main(String[] args) {
		
		try {
			// mở cổng và bắt đầu nghe
			var socketServer = new ServerSocket(9999);
			System.out.println("I'm listening on 9999 port . . .");
			// luôn luôn lắng nghe
			while (true) 
			{
				// khi có 1 yêu cầu tới , thì Accept
				// mở một Socket để làm việc với client đó
				Socket socketClient = socketServer.accept();
				// Gửi trả câu "xin chào"
				// b1 . lấy về luồng xuất,nhập
				OutputStream osToClient = socketClient.getOutputStream();
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				BufferedWriter buffWrite = new BufferedWriter(write2Client);
				//gửi
				InputStream in = socketClient.getInputStream();
				InputStreamReader inReader = new  InputStreamReader(in);
				BufferedReader buffRead = new BufferedReader(inReader);
				// Giao tiếp theo giao thức thiết kế
				
				while (true) {
					//nhận dữ liệu	
				String chuoinhan = buffRead.readLine();
				 // inra nếu thích
				// gửi trả
				String chuoigui = chuoinhan;
				 if (chuoinhan.equals("0\n"))
						 { System.out.print("Oh");
				 if(chuoinhan.equals("1\n"))
				 System.out.print("One");
				 if(chuoinhan.equals("2\n"))
					 System.out.print("Wto");
				 if(chuoinhan.equals("3\n"))
					 System.out.print("Three");
				 if(chuoinhan.equals("4\n"))
					 System.out.print("Four");
				 if(chuoinhan.equals("5\n"))
					 System.out.print("Five");
				 if(chuoinhan.equals("6\n"))
					 System.out.print("Six");
				 if(chuoinhan.equals("7\n"))
					 System.out.print("Seven");
				 if(chuoinhan.equals("8\n"))
					 System.out.print("Eight");
				 if(chuoinhan.equals("9\n"))
					 System.out.print("Nine");
				
						 }
				 
				buffWrite.write(chuoigui+"\n");
				buffWrite.flush();
				if (chuoigui.equals("10")) break;
				}
				socketClient.close();
			}
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
}
