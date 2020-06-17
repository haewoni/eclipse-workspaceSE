
public class AccountEncapsulationMain {

	public static void main(String[] args) {
		Account account1=new Account();
		account1.setAccountData(1111,"KIM",5600,0.5);
		account1.deposit(3000);
		account1.print();
		
		Account account2=new Account();
		account2.setAccountData(2222,"LEE",89000,1);
		account2.withdraw(5600);
		account2.print();
		
		
	}

}
