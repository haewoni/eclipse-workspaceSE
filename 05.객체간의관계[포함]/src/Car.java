
public class Car {
	//차량번호
	private int no;
	//차모델
	private String model;
	//차엔진
	private Engine engine;
	//생성자
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(int no, String model, Engine engine) {
		super();
		this.no = no;
		this.model = model;
		this.engine = engine;
	}
	public void print() {
		System.out.print(this.no+"\t"+this.model+"\t");
		this.engine.print();
	}
	
	//getter,setter
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public Engine getEngine() {
		return this.engine;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	

}
