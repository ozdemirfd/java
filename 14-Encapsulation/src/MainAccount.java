
public class MainAccount {

	public static void main(String[] args) {
		Account customer=new Account(1234567890, 25.00, "Jhon Smith", "jhon@gmail.com","345678567"); //(1234567890, 2500, "Jhon Smith", "jhon@gmail.com", 345678567);
//		customer.setName("Jhon");
//		customer.setAccount(1234556);
//		customer.setBalance(10000);
//		customer.setEmail("asdf@sdff.com");
//		customer.setPhoneNumber(345345345);
		
		System.out.println(customer.getName()+"'s balance  is after deposit " + customer.deposit(10000));
        customer.withdraw(3000);
        customer.withdraw(200);
		System.out.println(customer.getBalance());

		
	}

}
