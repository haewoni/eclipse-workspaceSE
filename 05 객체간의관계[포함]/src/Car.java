
public class Car {
	// 차량번호
	private int no;
	// 차모델
	private String model;
	// 차엔진
	private Engine engine;

	// 생성자
	public Car() {
		// TODO Auto-generated constructor stub

	}

	public Car(int no, String model, Engine engine) {
		super();
		this.no = no;
		this.model = model;
		this.engine = engine;
	}

	// 프린트 메소드
	public void print() {
		System.out.println(this.no + "\t" + this.model+"\t");
		this.engine.print();
	}

	// getter setter


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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
