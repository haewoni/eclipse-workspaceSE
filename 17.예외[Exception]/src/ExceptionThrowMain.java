import java.net.Socket;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionThrowMain {
	/*
	public static void main(String[] args) 
			throws ClassNotFoundException, 
			       SQLException {
		System.out.println("stmt1");
		Class.forName("First");
		System.out.println("stmt2");
		//DriverManager.getConnection("");
		System.out.println("stmt4");
		Socket socket = new Socket("www.daum.net",80);
		System.out.println(socket);
		System.out.println("stmt4");
	}
	*/
	public static void main(String[] args) 
			throws Exception {
		System.out.println("stmt1");
		Class.forName("First");
		System.out.println("stmt2");
		//DriverManager.getConnection("");
		System.out.println("stmt4");
		Socket socket = new Socket("www.daum.net",80);
		System.out.println(socket);
		System.out.println("stmt4");
	}

}
