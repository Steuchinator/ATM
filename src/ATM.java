import java.util.*;
public class ATM {
	HashMap bankAccounts = new HashMap<Integer,Double>();
	public ATM () {
		
	}
	
	public void openAccount (int number) {
		bankAccounts.put(number, 0.0);
	}
	public void openAccount (int number, double value) {
		
		bankAccounts.put(number, value);
	}
	
	public void closeAccount (int number) {
		if (checkBalance(number)<=0)
			bankAccounts.remove(number);
	}
	
	public double checkBalance(int number) {
		if(!bankAccounts.containsKey(number))
			return 0.0;
		return (double)bankAccounts.get(number);
	}
	
	public boolean depositMoney(int number, double amount) {
		if(!bankAccounts.containsKey(number))
			return false;
		amount = (double)bankAccounts.get(number)+amount;
		amount = amount *100;
		amount = Math.round(amount);
		amount = amount/100;
		bankAccounts.put(number,amount);
		return true;
	}
	
	public boolean withdrawMoney(int number, double amount) {
		if(!bankAccounts.containsKey(number))
			return false;
		if((double)bankAccounts.get(number)<amount)
			return false;
		amount = (double)bankAccounts.get(number)-amount;
		amount = amount *100;
		amount = Math.round(amount);
		amount = amount/100;
		bankAccounts.put(number,amount);
			return true;
	}
	
	public void printInfo(int number) {
		System.out.println("Account number: " +number+"\nAccount Balance: "+checkBalance(number));
	}
}
