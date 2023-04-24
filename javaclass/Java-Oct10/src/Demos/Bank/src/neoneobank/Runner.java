package neoneobank;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Currency {}

interface Transaction {
	String getType();
	Currency getAmount();
}

interface Reciept {}

class DepositReciept implements Reciept{}

interface Account {
	Reciept exec(Transaction t);
}