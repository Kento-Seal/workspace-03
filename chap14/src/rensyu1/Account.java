package rensyu1;

public class Account {
	String accountNumber;
	int balance;
	
	public Account(String an, int balance) {
			this.accountNumber = an;
			this.balance = balance;
			}
	
	public String toString() {
		return "\\" + this.balance + "(口座番号:" + this.accountNumber + ")";
	}
	
	public boolean equals(Object o) {
		if(this == o) {return true;}
		if(this.accountNumber.trim() == o) {
			return true;
		} else {return false;}
	}
	
	public static void createAccount() {
		Account a = new Account("4649", 1592);
		System.out.println(a);
	}
	
}
