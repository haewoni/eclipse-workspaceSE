
public class CarEncapsulationMethod {

	public static void main(String[] args) {
		//입차
		Car car1=new Car();
		car1.ipCha("1234", 12);
		
		Car car2=new Car();
		car2.ipCha("5678", 13);
		
		
		
		/*
		 * 출차
		 * - outTime set
		 * - 요금계산
		*/
		/*
		car1.outTime=14;
		car1.fee=(car1.outTime=car1.inTime)*1000;
		*/
		car1.setOutTime(14);
		car1.calculateFee();
		
		car2.setOutTime(14);
		car2.calculateFee();
		/*		
		car2.outTime=14;
		car2.fee=(car1.outTime=car1.inTime)*1000;
		*/
		
		
		//영수증출력
		car1.print();

 }
}