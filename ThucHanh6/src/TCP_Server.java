
import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
public class TCP_Server {
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
				
				String chuoiin = "";
				 switch(chuoinhan) {
				 case "0" -> chuoiin = "zero";
				 case "1" -> chuoiin = "one";
				 case "2" -> chuoiin = "two";
				 case "3" -> chuoiin = "three";
				 case "4" -> chuoiin = "four";
				 case "5" -> chuoiin = "five";
				 case "6" -> chuoiin = "six";
				 case "7" -> chuoiin = "seven";
				 case "8" -> chuoiin = "eight";
				 case "9" -> chuoiin = "nine";
				 }
				 System.out.println("Server:" + chuoiin);
				buffWrite.write(chuoiin+"\n");
				buffWrite.flush();
				if (chuoiin.equals("10")) break;
				}
				socketClient.close();
			}
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
}
