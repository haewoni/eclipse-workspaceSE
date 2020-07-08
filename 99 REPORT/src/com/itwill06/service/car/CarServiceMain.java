package com.itwill06.service.car;
public class CarServiceMain {
	public static void main(String[] args) {
		
		CarService carService=new CarService(10);
		
		System.out.println("0.CarService객체야 차객체 인자로 줄께 입차시켜줘");
		boolean isSuccess = carService.ipChar(new Car("2344",3 ));
		if(!isSuccess) {
			System.out.println("만차..");
		}else {
			System.out.println("입차성공");
		}
		isSuccess = carService.ipChar(new Car("4566",4 ));
		if(!isSuccess) {
			System.out.println("만차..");
		}else {
			System.out.println("입차성공");
		}
		System.out.println();
		
		
		System.out.println("1.CarService객체야 전체차량출력해줘");
		carService.printCar();
		System.out.println();
		
		
		System.out.println("2.CarService객체야 전체주차구획수반환해줘");
		int tp = carService.totPark();
		System.out.println(tp);
		System.out.println();		
		
		
		System.out.println("3.CarService객체야 주차가능주차구획수반환해줘");
		int ap = carService.availablePark();
		System.out.println(ap);
		System.out.println();
		
		System.out.println("5.CarService객체야 차량번호(4567번) 인자로줄께  차객체한대 참조변수반환해줘");
		Car fc = carService.findCar("4567");
		if(fc==null) {
			System.out.println("해당 차량이 없습니다");		
		} else {
			Car.headerPrint();
			fc.print();			
		}
		System.out.println();
	
		
		System.out.println("6.CarService객체야 입차시간(8시이후) 인자로줄께 차객체배열 참조변수반환해줘");
		Car[] fcs = carService.findCars(8);
		for (int i = 0; i < fcs.length; i++) {
			if(fcs[i]!=null) {
				Car.headerPrint();
				fcs[i].print();
				break;
			}else {
				System.out.println("해당 차량이 없습니다");
	    	}
		}
		
		System.out.println("7.CarService객체야 차량번호(7891번) 출차시간(12시)인자로줄께 출차시켜줘");
		carService.chulcha("7891",12);
	}

}
