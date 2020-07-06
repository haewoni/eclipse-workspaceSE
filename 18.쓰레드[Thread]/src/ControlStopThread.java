
public class ControlStopThread extends Thread {
	private int count;
	private boolean isPlay;

	public ControlStopThread() {
		count = 0;
		isPlay = true;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isPlay() {
		return isPlay;
	}

	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}

	@Override
	public void run() {
		while (isPlay) {
				count++;
				if(count==1000) {
					isPlay = false;
				}
				System.out.print("A");
				System.out.print("B");
				System.out.print("C");
				System.out.print("D");
				System.out.print("E");
				System.out.print("F");
				System.out.print("G");
				System.out.print("H");
				System.out.print("I");
				System.out.print("J");
				System.out.print("K");
				System.out.print("L");
				System.out.print("M");
				System.out.print("N");
				System.out.print("O");
				System.out.print("P");
				System.out.print("Q");
				System.out.print("R");
				System.out.print("X");
				System.out.print("Y");
				System.out.print("Z");
				
		}
		return;
				
			
	
	
	}

}
