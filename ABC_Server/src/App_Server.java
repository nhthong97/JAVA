import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class App_Server {

	public static void main(String[] args) {
		
		try {
			// mở cổng và bắt đầu nghe
			ServerSocket socketServer = new ServerSocket(8888);
			System.out.println("I'm listening on 8888 port . . .");
			// luôn luôn lắng nghe
			while (true) 
			{
				// khi có 1 yêu cầu tới , thì Accept
				// mở một Socket để làm việc với client đó
				Socket socketClient = socketServer.accept();
				// Gửi trả câu "xin chào"
				// b1 . lấy về luồng xuất
				OutputStream osToClient = socketClient.getOutputStream();
				// để gửi chuỗi cho tiện
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				BufferedWriter buffW	= new BufferedWriter(write2Client);
				//gửi
				buffW.write(" xin chào \n ");
				buffW.flush();
				
				// đóng socket
				socketClient.close();
			}
		}
			catch(IOException e) {
				e.printStackTrace();
			}
		
	
	}
	}
