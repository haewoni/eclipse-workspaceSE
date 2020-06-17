
public class Account {
	/*
	 * 멤버 필드
	 */
	private int no;        //계좌번호
	private String owner;  //계좌주
	private int balance;   // 잔고
	private double iyul;   // 이율
	
	/*
	 * 멤버 메소드
	 */
	/*
	 * 입금
	 */
	public void deposit(int m ) {
		this.balance=this.balance+m;
	}
	
	/*
	 * 출금
	 */
	public void withdraw(int m) {
		this.balance=this.balance-m;
	}
	/*
	 * 계좌 정보 출력
	 */
	public void print() {
		System.out.printf("%d %s %d %.1f %n,this.no,this.owner,this.balnce,this.iyul");
		
	}
	/*
	 * 계좌 데이터를 set하는 메소드
	 */
	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
		
	}


}
