import java.util.*;
public class ATM {
	HashMap fortniteAccounts = new HashMap<Integer,Double>();
	public ATM () {
		
	}
	
	public void openAccount (int defaultSkin) {
		fortniteAccounts.put(defaultSkin, 0.0);
	}
	public void openAccount (int wRizz, double breadedUp) {
		fortniteAccounts.put(wRizz, breadedUp);
	}
	
	public void closeAccount (int accountNumero) {
		if (checkBalance(accountNumero)<=0)
			fortniteAccounts.remove(accountNumero);
	}
	
	public double checkBalance(int numero) {
		if(!fortniteAccounts.containsKey(numero))
			return 0.0;
		return (double)fortniteAccounts.get(numero);
	}
	
	public boolean depositMoney(int numero, double amount) {
		if(!fortniteAccounts.containsKey(numero))
			return false;
		fortniteAccounts.put(numero,(double)fortniteAccounts.get(numero)+amount);
		return true;
	}
	
	public boolean withdrawMoney(int numero, double amount) {
		if(!fortniteAccounts.containsKey(numero))
			return false;
		if((double)fortniteAccounts.get(numero)<amount)
			return false;
		fortniteAccounts.put(numero,(double)fortniteAccounts.get(numero)-amount);
			return true;
	}
	
	public void printInfo(int numero) {
		System.out.println("Account number: " +numero+"\nAccount Balance: "+checkBalance(numero));
	}
}
