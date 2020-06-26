public abstract class Employee {
	public static final double INCENTIVE_RATE=0.1;
    private int no;
    private String name;
    private int pay;
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}
    
    

    public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
		
	}
    /*
     * 급여계산 
     *  - 실제 구현 작업 불가능
     *  - 자식객체에서 재정의 해야하는 메소드
     *  - 재정의 강제
     */

    public abstract void calculatePay();
    
    /*
     * 인센티브 계산
     *   -재정의 금지(회장님)
     */
    public final double calculateIncentive() {
    	double incentive=0.0;
    	if(this.pay>=1000000) {
    		incentive = this.pay*Employee.INCENTIVE_RATE;
    	}
    	return incentive;
    }


	public void print(){
		System.out.print(no+"\t"+name+"\t"+pay+"\t");
    }



	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public int getPay() {
		return pay;
	}



	public void setPay(int pay) {
		this.pay = pay;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	


}
