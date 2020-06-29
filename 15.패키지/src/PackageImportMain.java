
import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
/*
 * import com.itwill.shop.member.*;
 *   - com.itwill.shop.member package 에 있는 모든 클래스 import 한다
 *   - com.itwill.shop.member package의 하위 패키지에 있는 클래스를 import하지 않는다
 */
/* 
  * import com.itwill.ship.admin.Member;
 *줄인 클래스의 이름이 동일한 클래스는 import문에2개에 동시에 기술 할 수 없다
 */
import com.itwill.shop.member.MemberService;
import com.itwill.shop.order.Order;
/*
 * << import 단축키 >>
 *   ctrl+shifft+o
 */

public class PackageImportMain {

	public static void main(String[] args) {
		Member m1 = new Member();
		System.out.println(m1);
		MemberService memberService= new MemberService();
		System.out.println(memberService);
		
		com.itwill.shop.admin.Member am1= 
				new com.itwill.shop.admin.Member();
		System.out.println(am1);
		Order order=new Order();
		System.out.println(order);
		ShopService shopService=new ShopService();
	}

}
