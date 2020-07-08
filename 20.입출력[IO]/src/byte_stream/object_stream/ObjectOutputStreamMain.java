package byte_stream.object_stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import byte_stream.filter_stream.Account;

public class ObjectOutputStreamMain {
	/*
	 * 자바객체의 직렬화를 가능하게 하려면, 
	 * 반드시 java.io.Serializable interface를 implement 해야 한다.
	 */
	public static void main(String[] args) throws Exception{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
		Account account3= new Account(1223,"김수한",34000,3.333);
		Account account4= new Account(3451,"김수한",78000,5.333);
		
		String msg1 = new String("객체스트림");
		Integer wi2 = new Integer(2147483647);
		
		
		System.out.println("String Object write --> objects.ser");
		oos.writeObject(msg1);
		System.out.println("Integer Object write --> objects.ser");
		oos.writeObject(wi2);
		System.out.println("Account Object write --> objects.ser");
		oos.writeObject(account3);
		System.out.println("Account Object write --> objects.ser");
		oos.writeObject(account4);
		
		oos.flush();
		oos.close();
	}

}
