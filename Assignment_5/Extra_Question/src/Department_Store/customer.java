package Department_Store;

import java.util.Scanner;

public class customer {
	private int Account_no;
	private int Balance;
	private int charges;
	private int credits;
	private int credit_limit;
	
	public customer(){
		
	}
	public customer(int Account_no, int Balance, int charges ,int credits,int credit_limit) {
		setAccount_no(Account_no);
		setBalance(Balance);
		setCharges(charges);
		setCredits(credits);
		setCredit_limit(credit_limit);
	}
	public int getAccount_no() {
		return Account_no;
	}
	public void setAccount_no(int account_no) {
		Account_no = account_no;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(int credit_limit) {
		this.credit_limit = credit_limit;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public int getBalance() {
		return Balance+charges-credits;
	}
	
	
	
	public void acceptRecord() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Account Number:");
		int a=sc.nextInt();
		setAccount_no(a);
		System.out.println("Enter the Balance:");
		int bl=sc.nextInt();
		setBalance(bl);
		System.out.println("Enter the charges:");
		int b=sc.nextInt();
		setCharges(b);
		System.out.println("Enter the credits:");
		int c=sc.nextInt();
		setCredits(c);
		System.out.println("Enter the credit Limit:");
		int cl=sc.nextInt();
		setCredit_limit(cl);
		
	}
	public void printRecord() {
		if(getBalance()<getCredit_limit()) {
		System.out.println("Account No:"+getAccount_no());
		System.out.println("Balance"+getBalance());
		System.out.println("Charges:"+getCharges());
		System.out.println("Credits:"+getCredits());
		System.out.println("Credit_limit:"+getCredit_limit());
		}else {
			System.out.println("Credit limit exceeded");
		}
	}
	
}
