package generic;

import java.util.Comparator;

public class NameAscComparator implements Comparator<Account> {
	/*
	 * Quiz 이름이 같을때 2차 번호순으로 오름차순
	 * if 문
	 */
	@Override
	public int compare(Account o1, Account o2) {
		if (o1.getOwner().equals(o2.getOwner())) {
			return o1.getNo()-o2.getNo();
		}else {
			return o1.getOwner().compareTo(o2.getOwner());
		}
	}

}
