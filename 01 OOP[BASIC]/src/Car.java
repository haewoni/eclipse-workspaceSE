
/*
 * 주차장에서 차 객체(instance)를 생성하기 위한 클래스(class)
 */
public class Car {
	/*<<속성>>
	 * 멤버 필드 (변수)
	 * 인스턴스 변수 ---- 객체가 생성될때
	 */
	
	//차량번호 
	private String no;
	//입차시간
	private int inTime;
	//출차시간
	private int outTime;
	//주차요금
	private int fee;
	
	/*<<행위>>
	 * 멤버 메소드 (변수)
	 * 인스턴스 메소드 
	 *
	 */
	//입차
	public void ipCha(String no,int inTIme) {
		this.no=no;
		this.inTime=inTime;
		
	}
	//출차시간set
	public void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	
	
	//주차요금계산
	public void calculateFee() {
		this.fee=(this.outTime-this.inTime)*1000;
		
		
	}
	
	
	//영수증 출력
	public void print() {
		System.out.println("-------------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-------------------------------------");
		System.out.printf("%8s %6d %8d %10d%n",this.no,this.inTime,this.outTime,this.fee);
		
		
	
		
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getOutTime() {
		return outTime;
	}
	
	
	

}
