import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws  IOException {
		
		Socket client = new Socket("localhost",8888);
		
		DataOutputStream xuat = new DataOutputStream(client.getOutputStream());
		DataInputStream nhap = new DataInputStream(client.getInputStream());
		Scanner nhap1 = new Scanner(System.in);
		System.out.print("nhap a:");
		int a = Integer.parseInt(nhap1.nextLine());
		xuat.writeInt(a);
		System.out.print("nhap b:");
		int b = Integer.parseInt(nhap1.nextLine());
		xuat.writeInt(b);
		
	}
}


