package interfaces;

import atm.transaction.Transaction;

public interface AtmInterface {
	
	/**
	 * Method to swich on the ATM
	 * @param flag
	 */
	public void switchAtm(boolean flag);

	/**
	 * Method to identify whether ATM is switched on
	 * @return boolean
	 */
	public boolean getAtmStatus();

	/**
	 * Method to check whether Atm is switched on and initial cash is set
	 * @return boolen
	 * @throws java.lang.InterruptedException
	 */
	public boolean isATMReadyTOUse() throws java.lang.InterruptedException;

	/**
	 * Method to set the withdrawal amt option
	 * 0- 20$
	 * 1- 40$
	 * 2- 60$
	 * 3- 100$
	 * 4- 200$
	 * @param moneyOption
	 */
	public void setAmount(int moneyOption);

	/**
	 * Method to trigger cad insert
	 * @throws java.lang.InterruptedException
	 */
	public void insertcard() throws java.lang.InterruptedException;

	/**
	 * Method to enter the pin for the ATM
	 * @param pin
	 */
	public void setPin(int pin);

	/**
	 * Method to set the initial cash for the ATM after switching on the ATM
	 * @param noOfBills
	 * @throws java.lang.Exception
	 */
	public void setInitilaCash(int noOfBills) throws java.lang.Exception;

	/**
	 * Method to enter the ATM Card number after inserting the card
	 * @param cardNumber
	 */
	public void setCardNo(int cardNumber);

	/**
	 * Method to set the account type to withdraw from ATM
	 * 0- Checking
	 * 1- Saving
	 * 2- Money Market
	 * @param fromAcc
	 */
	public void setAccType(int fromAcc);

	/**
	 * Method to enter the Transaction type to begin the transaction
	 * 1 - Withdraw
	 * 2 - Deposit
	 * 3 - Transfer
	 * 4 - Inquiry
	 * @param transactionChoice
	 */
	public void setTransactionType(int transactionChoice);
	
	/**
	 * Method to get the ATM state
	 * THis is initiated when the ATM is switched ON
	 * 0- OFF_STATE
	 * 1- IDLE_STATE
	 * 2- SERVING_CUSTOMER_STATE
	 * @return String
	 */
	public String getAtmState();
	
	/**
	 * Method to get session state 
	 * This is initiated when the ATM card is inserted
	 * 1- READING_CARD_STATE
	 * 2- READING_PIN_STATE
	 * 3- CHOOSING_TRANSACTION_STATE
	 * 4- PERFORMING_TRANSACTION_STATE
	 * 5- EJECTING_CARD_STATE
	 * 6- FINAL_STATE 
	 * @return String
	 */
	public String getSessionState();
	
	/**
	 * Method to get the transaction state
	 * This is initiated when transaction type is selected
	 * 1- GETTING_SPECIFICS_STATE
	 * 2- SENDING_TO_BANK_STATE
	 * 3- INVALID_PIN_STATE
	 * 4- COMPLETING_TRANSACTION_STATE
	 * 5- PRINTING_RECEIPT_STATE
	 * 6- ASKING_DO_ANOTHER_STATE
	 * @return String
	 */
	public String getTransactionState();

	public Transaction getTransaction();
	

}
