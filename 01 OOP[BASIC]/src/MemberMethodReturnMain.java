
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr=new MemberMethodReturn();
		System.out.println("main1");
		int recvData1 = mmr.method1();
		System.out.println("recvData1:"+recvData1);
		boolean recvData2=mmr.isMarried();
		System.out.println("recvData1:"+recvData2);
		
		int recvData3 = mmr.add(45564, 34234323);
		System.out.println("recvData3:"+recvData3);
		recvData3 = mmr.add(56456, 3);
		System.out.println("recvData3:"+recvData3);
		recvData3 = mmr.add(-6756, -344);
		System.out.println("recvData3:"+recvData3);
		
		
		
	}

}
