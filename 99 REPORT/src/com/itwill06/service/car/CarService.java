package com.itwill06.service.car;
public class CarService {
	private Car[] carArray;
	

	public CarService() {
		carArray=new Car[30];  
	}
	
	public CarService(int count) { //주차구획수
		carArray=new Car[count];
		
	}
	/*
	0. 차객체 인자로 받아서 입차 후 성공 실패 여부 반환
	     - 주차장이 만차이면 입차 실패
	     - 차량번호 중복 체크
	*/
	public boolean ipChar(Car inCar) {
		boolean isSuccess=false;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getNo()!=inCar.getNo()) {
				isSuccess = false;
			}
		}
		
		for (int i = 0; i < carArray.length; i++) {
				if(carArray[i]==null ) {  ///왜 중복체크 하면 null pointer
					carArray[i] = inCar;
					isSuccess = true;
					break;
				}	
		    }
		return isSuccess; 		
	}
	
	//1. 전체차량출력
	public void printCar() {
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
			carArray[i].print();
			}
		}
		
	}
	
	//2. 주차구획수반환
	public int totPark() {
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			count++;		
	}
		return count;
	}
	//3. 주차가능주차구획수반환
	public int availablePark() {
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				count++;
			}
		}
		return count;
	}
	//5. 차량번호(4567번) 인자 받아서 차객체한대 참조변수반환
	public Car findCar(String no) {
		Car fc = null;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getNo().equals(no)) {
				fc = carArray[i];
			}
		}
		
		return fc;
	}
	
	
	//6. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환////???????
	public Car[] findCars(int time) {
		Car[] fcs= null;
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getInTime()>=time) {
				count++;
			}
		}
		int index = 0;
		fcs = new Car[count];
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getInTime()>=time) {
				fcs[index] = carArray[i];
				index++;
			}
		}
		
		return fcs;
	}
	
	
	//7. 차량번호(7891번),출차시간(12시)인자로 받아서 출차");
	public void chulcha(String no,int outTime) {
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getNo()==no) {
				carArray[i].chulCha(outTime);
				carArray[i].print();
			}else {
				System.out.println("해당 차량이 없습니다");
				break;
			}
		}
	}
	
	
}
