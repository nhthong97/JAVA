import java.io.IOException;
import java.net.Socket;



public class Vidu1 {
	
	public static void main(String[] args) {
		try {
			Socket soc = new Socket("ntu.edu.vn",8000);
			System.out.print("Connected!");
			
		}catch(IOException e) {
			System.out.print("Not connected!");
		}
	}
}
