package Lab8;
import java.util.Date;
import java.util.Objects;


/* when you implement Comparable, it is possible that a warning
 * is given, which you should ignore for now, until we discuss Generics. 
 */
public abstract class Account implements Comparable {
	protected int accountNo;
	// add the rest of attributes here
	protected double balance;
	protected String fullName;
	protected Date dateOpened;
	protected double maxTransferable;

	/**
	 * This method deposit <code> amount </code> to this account.
	 * @param amount is the amount that is deposited to this account. 
	 */
	// insert your code here
	
	public abstract void deposit(double amount);

	
	/**
	 * This method withdraw <code> amount </code> from this account.
	 * @param amount is the amount that should be withdrawn from this account
	 * @return It returns true if the transaction is done successfully. 
	 * @throws Exception This methods may throw either <code> NotEnoughMoneyException </code> or
	 * <code> TransferNotAllowedException </code>.
	 */
	public abstract boolean withdraw(double amount) throws Exception;

	
	/**
	 * This method transfers money from this account to the given account.
	 * @param to is the destination account, where the money is deposited to.
	 * @param amount is the amount of money that is transfered. 
	 * @return It returns true if the transaction is successful. 
	 * @throws Exception This methods may throw either <code> NotEnoughMoneyException </code> or
	 * <code> TransferNotAllowedException </code>.
	 */
	
	public boolean transferFrom(Account acc, double amount) throws Exception{
		if (amount > this.maxTransferable) {
			throw new TransferNotAllowedException();
		}
		
		if (!this.withdraw(amount)) {
			throw new NotEnoughMoneyException();
		}
		
		acc.deposit(amount);
		return true;
	}
	
	/**
	 * This is the accessor method for <code> accountNo </code>
	 * @return It returns the accountNo of this account.
	 */
	
	public int getAccountNo() {
		return accountNo;
	}

	/**
	 * This is the accessor method for <code> balance </code>
	 * @return It returns the balance of the account.
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * This is the accessor method for <code> fullName </code>
	 * @return It returns the name of the holder of the account.
	 */
	
	public String getFullName() {
		return fullName;
	}

	
	/**
	 * This is the accessor method for <code> dateOpened </code>
	 * @return It returns the date at which the account was opened.
	 */
	
	public Date getDateOpened() {
		return dateOpened;
	}
	
	
	/**
	 * This is the accessor method for <code> maxTransferable </code>
	 * @return It returns the maximum allowed amount that can be withdrawn from this account in one transaction.
	 */
	
	public double getMaxTransferable() {
		return maxTransferable;
	}


	/**
	 * This method compares two accounts. If the two accounts have the same values
	 * for all the instance variables, they are considered, equal and this 
	 * method returns 0. If two objects were not equal, the account whose accountNo is less, 
	 * is the smaller object so this method returns -1. Otherwise it returns 1.
	 * @param object is an object of type account. 
	 * @return<pre> It returns 0, if the two objects are equal. 
	 * It returns -1, if this object is less than the object that is passed as a parameter into the method. 
	 * It returns 1, if this object is greater than the object that is passed as a parameter into the method<pre>. 
	 */
	@Override
	public int compareTo(Object obj) {
		Account other = (Account) obj;
		
		if (this.accountNo == other.accountNo && this.balance == other.balance && this.dateOpened == other.dateOpened 
			&& this.fullName == other.fullName && this.maxTransferable == other.maxTransferable) {
			return 0;
		}
		
		if (this.accountNo > other.accountNo) {
			return 1;
		}
		
		return -1;
	}

}

class Current extends Account{
	
	public Current(int accountNo, double balance, String fullName, Date dateOpened, double maxTransferable) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.fullName = fullName;
		this.dateOpened = dateOpened;
		this.maxTransferable = maxTransferable;
				
	}
	
	public boolean equals(Object obj) {
		Current other = (Current) obj;
		
		return this.accountNo == other.accountNo && Double.compare(this.balance, other.balance) == 0 && this.fullName.equals(other.fullName) 
				&& this.dateOpened.equals(other.dateOpened) && Double.compare(this.maxTransferable, other.maxTransferable) == 0;
		
	}
	
	public int hashCode() {
		int result = Integer.hashCode(accountNo);
		result = 31 * result + Double.hashCode(balance);
		result = 31 * result + fullName.hashCode();
		result = 31 * result + dateOpened.hashCode();
		result = 31 * result + Double.hashCode(maxTransferable);
		
		return result;
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		}
		
	}

	@Override
	public boolean withdraw(double amount) throws Exception {
		if (amount <= 0) {
			throw new TransferNotAllowedException();
		}
		
		if (amount > balance) {
			throw new NotEnoughMoneyException();
		}
		
		if (amount > maxTransferable) {
			throw new TransferNotAllowedException();
		}
		
		balance -= amount;
		return true;
	}

}

/**
 * This class is a user defined Exception used 
 * when transferring money is not allowed.
 *
 */

class TransferNotAllowedException extends Exception{
	public TransferNotAllowedException() {
		super();
	}
	
	public TransferNotAllowedException(String message) {
		super(message);
	}
	
}

/**
 * This is a user defined exception used
 * when a transaction is unsuccessful due to lack
 * of enough money.
 */

class NotEnoughMoneyException extends TransferNotAllowedException{
	public NotEnoughMoneyException() {
		super();
	}
	
	public NotEnoughMoneyException(String message) {
		super(message);
	}
	
}