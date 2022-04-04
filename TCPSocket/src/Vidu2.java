import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Vidu2 {
	public static void main(String[] args) {
	try {
		Socket soc = new Socket("ntu.edu.vn",8000);
		System.out.print("Connected!");
		
		InputStream in = soc.getInputStream();
		InputStreamReader inReader = new InputStreamReader(in);
		BufferedReader buff = new BufferedReader(inReader);
		System.out.print(buff.readLine());
		System.out.print(buff.readLine());
		
	}catch(IOException e) {
		System.out.print("Not connected!");
	}
}
}

