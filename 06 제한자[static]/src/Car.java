
public class Car {
	
	
	public static int count;   //차량의 총생산대수
	private int no;            //차번호
	private String model;      //차 모델명
	private String color;      //차 색상
	
	
	
	public Car() {
		
	}

	public Car(int no, String model, String color) {
	    this.no = no;
		this.model = model;
		this.color = color;
	}
	
	public void print() {
		System.err.println(no+"\t"+model+"\f"+color);
	}


	///getter,setter
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


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
