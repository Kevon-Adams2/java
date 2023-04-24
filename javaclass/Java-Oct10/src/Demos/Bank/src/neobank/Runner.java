package neobank;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Transaction {
	private Currency amount;
	
	public String type;  // list of possible
	
//	public Transaction(Currency amount, String type) {
//		this.amount = amount;
//		this.type = type;
//	}
	
}

class Deposit extends Transaction {}

abstract class Reciept {}
class DepositReciept extends Reciept {}

//---
 class FailureReciept extends Reciept {}

interface Account {
	Reciept exec(Transaction t);
}

//--

class ActImpl implements Account {
    private ProcDeposit depositProcessor = null;
	@Override
	public Reciept exec(Transaction t) {
		if (t.type == "Deposit") {
			Reciept r = this.depositProcessor.exec(t);
			return r;
		}
		return null;
	}
	
}

class ProcDeposit {
	public Reciept exec(Transaction t) {
		// bunch of code to process a deposit
		return null;
	}
	
}



