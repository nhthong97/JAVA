

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class TCP_Client {
	public static void main(String[] args) {

		Socket soc;

		try {

			soc = new Socket("localhost",9999);

			System.out.print("Connected!\n");

		

			InputStream in = soc.getInputStream();

			InputStreamReader inReader = new  InputStreamReader(in);

			BufferedReader buffRead = new BufferedReader(inReader);

			

			OutputStream osToClient = soc.getOutputStream();

			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);

			BufferedWriter buffWrite = new BufferedWriter(write2Client);

			

			Scanner banphim = new Scanner(System.in);

			while(true) {

			System.out.println("\nClient:");

			String chuoigui = banphim.nextLine();

			buffWrite.write(chuoigui+"\n");

			buffWrite.flush();

			String chuoinhan = buffRead.readLine();

			System.out.print("Server:" + chuoinhan);

			if (chuoinhan.equals("10")) break;

	
			}soc.close();

		}catch(IOException e)

		{

			e.printStackTrace();

		}

	}

}
