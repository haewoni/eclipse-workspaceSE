
public class AccountManyMain {

	public static void main(String[] args) {
		//Account[] accountArray=new Account[5];
		
		AccountMany accountArray=new AccountMany();
		accountArray.acc0=new Account(1111, "KIM", 89000, 0.6);
		accountArray.acc1=new Account(2222, "FIM", 45000, 0.3);
		accountArray.acc2=new Account(3333, "VIM", 71000, 1.6);
		accountArray.acc3=new Account(4444, "SIM", 62000, 0.8);
		accountArray.acc4=new Account(5555, "AIM", 99000, 2.6);
		Account.headerPrint();
		accountArray.acc0.print();
		accountArray.acc1.print();
		accountArray.acc2.print();
		accountArray.acc3.print();
		accountArray.acc4.print();
	}

}
