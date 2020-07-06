
public class ControlPriorityUpperLowerMain {

	public static void main(String[] args) {
		System.out.println("1.main");
		ControlPriorityUpperThread ut = new ControlPriorityUpperThread();
		ControlPriorityLowerThread lt = new ControlPriorityLowerThread();
		/*
		 * Priority 설정
		 * - CPU 의 점유권을 얻을 수 있는 우선 순위
		 */
		ut.setPriority(8);
		lt.setPriority(2);
		
		ut.start();
		lt.start();
		System.out.println("99.main return");
		
	}

}
