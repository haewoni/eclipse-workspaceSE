package practice;

public class AccountConstructor {
	/*
	 * 멤버필드
	 */
	private int no, balance;
	private String name;
	double interest;

	/*
	 * 생성자
	 */
	public AccountConstructor() {

	}

	public AccountConstructor(String name, int no, int balance, double interest) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.interest = interest;
	}

	/*
	 * 멤버메쏘드
	 */
	/*
	 *
	 * 입금
	 */
	public void deposit(int a) {
		this.balance = this.balance + a;
	}

	/*
	 * 출금
	 */
	public void withdraw(int b) {
		this.balance = this.balance + b;
	}

	/*
	 * 계좌정보출력
	 */
	public void headerPrint() {
		System.out.println("------------------------------------------------");
		System.out.printf("%s %s %s %s %n", "이름", "계좌번호", "잔고", "이율");
		System.out.println("------------------------------------------------");
	}

	public void print() {
		System.out.printf("%s %d %d %f %n", this.name, this.no, this.balance, this.interest);
	}

	/*
	 * 계좌데이타를 set
	 */
	public void setAccountData(int no, int balance, String name, double interest) {
		  this.no = no;
		  this.balance = balance;
		  this.name = name;
		  this.interest = interest;
	}
		  

	/******getter,setter메쏘드******/
	public int getNo() {
		  return no;
	 
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

}
