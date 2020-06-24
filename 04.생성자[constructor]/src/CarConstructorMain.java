
public class CarConstructorMain {

	
	public static void main(String[] args) {
		Car car1=new Car();
		car1.ipCha("1111", 12);
		
		Car car2=new Car("2222", 12);
		
		Car car3=new Car("3333", 12, 0, 0);
		
		
		car1.setOutTime(14);
		car1.calculateFee();
		
		car2.setOutTime(14);
		car2.calculateFee();
		
		car3.setOutTime(14);
		car3.calculateFee();
		
		car1.headerPrint();
		car1.print();
		car2.print();
		car3.print();
		
	}

}
