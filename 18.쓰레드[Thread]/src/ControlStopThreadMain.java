
public class ControlStopThreadMain {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("1.main");
		ControlStopThread cst = new ControlStopThread();
		cst.setName("stop스레드");
		cst.start();
		System.out.println("2.main sleep");
		Thread.sleep(100);
		/*
		 * case1 :  Thread.stop()
		 */
		//cst.stop();
		
		
		/*
		 * case2 :  isPlay 변수-->false로 변경
		 */
		
		cst.setPlay(false);
		
		/*
		 * case3 :  스레드가 할 일을 다하면 스스로 종료
		 */
		
		/*
		 * main 스레드는 cst 스레드가 죽을때까지 대기
		 */
		cst.join();
		System.out.println();
		System.out.println("99.main return");

	}

}
