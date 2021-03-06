import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class App_EchoServer {

	public static void main(String[] args) {
		
		try {
			// mở cổng và bắt đầu nghe
			ServerSocket socketServer = new ServerSocket(9999);
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
				buffWrite.write(chuoigui+"\n");
				buffWrite.flush();
				if (chuoigui.equals("Bye")) break;
				}
				socketClient.close();
			}
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
}
