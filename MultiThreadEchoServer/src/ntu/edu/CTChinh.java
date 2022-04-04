package ntu.edu;
import java.io.IOException;
import java.net.ServerSocket;

public class CTChinh {
	public static void main(String[] args)throws IOException{
		// mo cong va bat dau nghe
		ServerSocket socketServer = new ServerSocket(9999);
		System.out.print(" i'm listening on 9999 port . . .");
		//
		int id = 0;
		while (true) {
			Socket s = socketServer.accept();
			LuongLamViec luongTask = new 
		}
	}
}
