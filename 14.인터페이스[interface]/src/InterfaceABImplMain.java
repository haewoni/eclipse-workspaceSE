
public class InterfaceABImplMain {

	public static void main(String[] args) {
		System.out.println("----------------InterfaceABIImpl---------------------");
		InterfaceABImpl abImple=new InterfaceABImpl();
		abImple.method1();
		abImple.method2();
		abImple.method3();
		abImple.method4();
		System.out.println("---------------InterfaceA-----------------");
		InterfaceA ia = abImple;
		ia.method1();
		ia.method2();
		System.out.println("---------------InterfaceB-----------------");
		InterfaceB ib=abImple;
		ib.method3();
		ib.method4();
		System.out.println("-----------InterfaceA<--> InterfaceB--------------");
		InterfaceA ia2 = new InterfaceABImpl();
		ia2.method1();
		ia2.method2();
		InterfaceB ib2 = (InterfaceB)ia2;
		ib2.method3();
		ib2.method4();
		
		
	}

}
