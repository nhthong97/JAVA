import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BMI {

	public static void main(String[] args) {
		try {
			// Mở cổng và bắt đầu nghe
			ServerSocket socketServer = new ServerSocket(8989);
			System.out.println("I'm listening on 8989 port....");
			// Luôn luôn lắng nghe
			while (true)
			{	//Khí có 1 yêu cầu tới, thì Accept
				// mở một Socket để làm việc với client đó
				Socket socketClient = socketServer.accept();  //
				System.out.print("Client:"+socketClient.getInetAddress().getHostAddress().toString());
				//Lấy về luồng xuất, nhập
				OutputStream osToClient = socketClient.getOutputStream();
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				BufferedWriter buffWrite  = new BufferedWriter(write2Client);
				   
				InputStream in = socketClient.getInputStream();
				InputStreamReader inReader = new InputStreamReader(in);
				BufferedReader buffRead = new BufferedReader(inReader);
				//========= GIAO TIẾP THEO giao thức thiết kế=============    
				 
				//-----------------------
				String chuoiHello_Gui="Hello";
				buffWrite.write(chuoiHello_Gui+ "\n");
				buffWrite.flush();
				
				//- Nhận xin chào, và hỏi tên-------------------------
			    String chuoiXinchao_Nhan = buffRead.readLine();
			    String chuoiHoiTen="Bạn tên gì? \n";
			    buffWrite.write(chuoiHoiTen+ "\n");
			    buffWrite.flush();
				//-- Nhận trả lời tên, và hỏi chiều cao	
			    String chuoiTen_Nhan = buffRead.readLine();
			    String chuoiHoiChieuCao="Bạn cao bao nhieu cm? \n";
			    buffWrite.write(chuoiHoiChieuCao+ "\n");
			    buffWrite.flush();	
				//-- Nhận trả lời chiều cao, và hỏi cân nặng
			    String chuoiChieuCao = buffRead.readLine();
			    String chuoiHoiCanNang="Bạn nặng bao nhieu kg? \n";
			    buffWrite.write(chuoiHoiCanNang+ "\n");
			    buffWrite.flush();
			    // === nhận về cân nặng, gủi tôi đang tính
			    String chuoiCanNang = buffRead.readLine();
			    String chuoiNoiToiDangTinh ="Tôi đang tính toán ...";
			    buffWrite.write(chuoiNoiToiDangTinh+ "\n");
			    buffWrite.flush();
			    
			    // Tính toán BMI ở đây
			      // các lệnh ở đây
			      // đổi mấy tham số từ chuỗi sang số mới tính được
			    String chuoiKQ_Gui = "Bạn béo phì độ X";
			    //
			    buffWrite.write(chuoiKQ_Gui+ "\n");
			    buffWrite.flush();			    
				
			    
//			    socketClient.close();
			}
			//socketServer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}