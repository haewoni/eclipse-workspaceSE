import java.awt.Frame;
import java.awt.List;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.Connection;

import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.order.Order;
import com.itwill.shop.order.OrderService;

/*
<<생략가능>>
import java.lang.String;
*/
public class JavaPackageImportMain {

	public static void main(String[] args) {
		/*
		 * java.lang package에소속된클래스들은 import 구문 생략가능
		 */
		System.out.println("------------java.lang package-----------");
		java.lang.String str="str1";
		String str2="str2";
		System sys;
	    Math math;
	    System.out.println("-------------java.lang 이외의package-----------");
	    InputStream in;
	    OutputStream out;
	    Frame f;
	    List list;
	    java.util.List li;
	    Socket socket;
	    Connection con;
	    System.out.println("------------업무 package-----------");
	    ShopService shopService;
	    Member member;
	    Order order;
	    OrderService orderService;
	}

}










