import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class App_Client {

	public static void main(String[] args) {
	
		// tạo 1 kết nối socket đến server
		try {
			Socket soc = new Socket("localhost",8888);
			System.out.print("Connected!");
			// lấy luồng nhập
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new  InputStreamReader(in);
			BufferedReader buff = new BufferedReader(inReader);
			// đọc trả lời và in ra
			System.out.println(buff.readLine());
			
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
