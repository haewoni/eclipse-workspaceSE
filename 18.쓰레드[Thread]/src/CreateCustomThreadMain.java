
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main");
		// 3. thread 객체 생성
		CreateCustomThread cct = new CreateCustomThread();
		System.out.println("2.main");
		// 4. thread 객체 통해 thread 시작시킨다
		cct.setName("myThread");
		cct.start();
		/*
		 * << Thread >> 
		 * Causes this thread to begin execution; 
		 * the Java Virtual Machine calls the run method of this thread.
		 * 
		 * The result is that two threads are running concurrently: the current thread
		 * (which returns from the call to the start method) and the other thread (which
		 * executes its run method).
		 * 
		 */
		while(true) {
			System.out.println("3.main");
		}
	
	}

}
