
public class Account {
	private int account;
	private double balance;
	private String name;
	private String email;
	private int phoneNumber;
	
	public Account(int account, double balance, String name, String email, String phone) {
		
		this.account = account;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNumber= phoneNumber;
		
		
	}

	
	public double deposit(double Addmoney) {
		return this.balance=Addmoney+this.balance;
	}
	
	public void withdraw(int money) {
		if(this.balance -money<0 ) {
			System.out.println("Only "+this.balance+" available.Withdrawal no processed");
		}else {
		 this.balance-=money;
		 System.out.println("Withdrawal of "+ money + " processed.Remaining balance=" +this.balance);
		}
		 
	}
	
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
