
public class FinalClassMain {

	public static void main(String[] args) {
		FinalClass fc1=new FinalClass();
		/*
		<<The final field FinalClass.INCENTIVE_RATE cannot be assigned >>
		fc1.INCENTIVE_RATE=15;
		fc1.PORT_NUMBER=8080;
		*/
		System.out.println(fc1.INCENTIVE_RATE);
		System.out.println(fc1.PORT_NUMBER);
		
		FinalClass fc2= new FinalClass();
		System.out.println(fc2.INCENTIVE_RATE);
		System.out.println(fc2.PORT_NUMBER);
		System.out.println(FinalClass.EAST);
		System.out.println(FinalClass.WEST);
		System.out.println(FinalClass.NORTH);
		System.out.println(FinalClass.SOUTH);
		fc1.move(FinalClass.NORTH);
		fc1.move(FinalClass.SOUTH);
		fc1.move(FinalClass.EAST);
		fc1.move(FinalClass.WEST);
		System.out.println("----------FinalClssChild-------------");
		FinalClassChild fcc1= new FinalClassChild();
		fcc1.method1();
		fcc1.method2(); //재정의x  상속o
		/*
		fcc1.INCENTIVE_RATE=90;
		fcc1.PORT_NUMBER=80;
		*/
		System.out.println(fcc1.INCENTIVE_RATE);
		System.out.println(fcc1.PORT_NUMBER);
		System.out.println("----------------Parent static member-------------------");
		System.out.println(FinalClass.EAST);
		System.out.println(FinalClass.WEST);
		System.out.println(FinalClass.NORTH);
		System.out.println(FinalClass.SOUTH);
		System.out.println("----------------Child static member-------------------");
		/*
		System.out.println(FinalClassChild.EAST);
		System.out.println(FinalClassChild.WEST);
		System.out.println(FinalClassChild.NORTH);
		System.out.println(FinalClassChild.SOUTH);
		*/
	}

}
