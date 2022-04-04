import java.io.InputStream;

public class Read1CharByInputStream {
	public static void main(String [] args) {
		InputStream is;
		is = System.in;
		System.out.print("mời ban nhập 1 ký tự :");
		int kt = is.read();
		System.out.printf("ký tự bạn vừa nhập là :"+(char)kt);
		
	}
}
