import java.util.*;
public class Tester {
	public static void main (String[] args) {
		ATM mikesmoneymachine = new ATM();
		mikesmoneymachine.openAccount(1, 100);
		mikesmoneymachine.depositMoney(1,100);
		mikesmoneymachine.withdrawMoney(1, 100);
		mikesmoneymachine.printInfo(1);
		
	}
}
