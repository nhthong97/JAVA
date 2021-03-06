import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class App_EchoClient {

	public static void main(String[] args) {
		Socket soc;
		// tạo 1 kết nối socket đến server
		try {
			soc = new Socket("localhost",9999);
			System.out.print("Connected!\n");
			// lấy luồng nhập / xuất
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new  InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			
			OutputStream osToClient = soc.getOutputStream();
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffWrite = new BufferedWriter(write2Client);
			// đọc trả lời và in ra
			Scanner banphim = new Scanner(System.in);
			while(true) {
			System.out.println("\nClient:");
			String chuoigui = banphim.nextLine();
			// gửi đi , nếu chuỗi là bye thì dừng
			 
			buffWrite.write(chuoigui+"\n");
			buffWrite.flush();
			
			// nhận về
			String chuoinhan = buffRead.readLine();
			//in ra màn hình  client để xem
			System.out.print("Server:" + chuoinhan);
			if (chuoigui.equals("Bye")) break;
			
			}soc.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}


