
 /*
		switch 문
		 - 형식
		 
		    switch(변수){
		    	case 값_1:
		    	  stmt1;
		    	  break;
		    	case 값_2:
		    	  stmt2;
		    	  break;  
		        case 값_n:
		          stmt3;
		    	  break;
		        default:
		          stmt4;
		    }
		switch(변수)  변수값은 byte,short,int,char 
		              값이올수있다.(long 은안됨)              
*/

public class SwitchTest {

	public static void main(String[] args) {
		/*
		 * 1~7 사이의 정수
		 */
		int level = 6;
		String msg = "";
		
		switch (level) {
		case 1:
			msg="초보";			
			break;
		case 2:
			msg="중수";			
			break;
		case 3:
			msg="고수";			
			break;
		case 4:
		case 5:	
		case 6:			
		case 7:
			msg="초고수";		
			break;

		default:
			msg="레벨은 1~7 사이의 정수입니다.";
			break;
		}
		System.out.println(level+" --> " +msg);
		

	}

}
