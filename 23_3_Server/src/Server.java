import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

public static void main(String[] args) throws IOException {
		
		
			// mở cổng và bắt đầu nghe
			ServerSocket server = new ServerSocket(8888);
			System.out.println(" Server da san sang");
			Socket client = server.accept();
			System.out.print("client da ket noi voi server");
			
			DataOutputStream xuat = new DataOutputStream(client.getOutputStream());
			DataInputStream nhap = new DataInputStream(client.getInputStream());
			int a = nhap.readInt();
			int b = nhap.readInt();
}
	
}
