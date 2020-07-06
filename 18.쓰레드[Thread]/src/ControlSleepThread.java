import java.util.Date;

public class ControlSleepThread extends Thread {
	@Override
	public void run() {
		while (true) {
			try {
				//System.out.println("가." + Thread.currentThread().getName() + " ");
				/*
				 * 현재 실행 스레드를 1000ms 동안 sleep 시킨다
				 */
				Date now = new Date();
				String nowTimeStr = now.toLocaleString();				
				System.out.println(nowTimeStr);
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
