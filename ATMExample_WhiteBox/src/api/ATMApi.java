package api;

import atm.ATM;
import atm.transaction.Transaction;
import interfaces.AtmInterface;
import simulation.Simulation;

public class ATMApi implements AtmInterface {

	ATM theATM;
	Simulation theSimulation;
	Thread t;

	/**
	 * Constructor Instantiate the atm and simulation
	 * 
	 * Start the ATM thread
	 */
	public ATMApi() {

		theATM = new ATM(42, "Gordon College", "First National Bank of Podunk", null);
		theSimulation = new Simulation(theATM);
		t = new Thread(theATM);
		t.start();
		try {
			// Need this sleep to create the thread and carryout the
			// instatiation of thread
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method to swich on the ATM
	 * 
	 * @param flag
	 */
	@Override
	public void switchAtm(boolean flag) {

		theSimulation.switchChanged(flag);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Method to identify whether the ATM is switched on
	 * 
	 * @return boolean
	 */
	@Override
	public boolean getAtmStatus() {
		return theSimulation.getAtm().isSwitchOn();
	}

	/**
	 * Method to set the initial cash for the ATM after switching on the ATM
	 * 
	 * @param noOfBills
	 * @throws java.lang.Exception
	 */
	@Override
	public void setInitilaCash(int noOfBills) throws Exception {
		theSimulation.getAtm().setInitialCash(noOfBills);
	}

	/**
	 * Method to check whether Atm is switched on and initial cash is set
	 * 
	 * @return boolen
	 * @throws java.lang.InterruptedException
	 */
	@Override
	public boolean isATMReadyTOUse() throws InterruptedException {
		return theSimulation.getAtm().isSwitchOn() && theSimulation.getAtm().isIntialCashSet();
	}

	/**
	 * Method to trigger cad insert
	 * 
	 * @throws java.lang.InterruptedException
	 */
	@Override
	public void insertcard() throws InterruptedException {
		theSimulation.cardInserted();
		Thread.sleep(1000);
	}

	/**
	 * Method to enter the ATM Card number after inserting the card
	 * 
	 * @param cardNumber
	 */
	@Override
	public void setCardNo(int cardNumber) {
		theSimulation.getAtm().setcard(cardNumber);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Method to enter the pin for the ATM
	 * 
	 * @param pin
	 */
	@Override
	public void setPin(int pin) {
		theSimulation.getAtm().setPin(pin);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Method to enter the Transaction type to begin the transaction 1 -
	 * Withdraw 2 - Deposit 3 - Transfer 4 - Inquiry
	 * 
	 * @param transactionChoice
	 */
	@Override
	public void setTransactionType(int transactionChoice) {
		theSimulation.getAtm().setTransactionType(transactionChoice);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Method to set the account type to withdraw from ATM 0- Checking 1- Saving
	 * 2- Money Market
	 * 
	 * @param fromAcc
	 */
	@Override
	public void setAccType(int fromAcc) {
		theSimulation.getAtm().setWithDrawFromAcc(fromAcc);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Method to set the withdrawal amt option 0- 20$ 1- 40$ 2- 60$ 3- 100$ 4-
	 * 200$
	 * 
	 * @param moneyOption
	 */
	@Override
	public void setAmount(int moneyOption) {
		theSimulation.getAtm().setWithDrawAmt(moneyOption);

		// Need time to do the trasaction
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Method to get the ATM state THis is initiated when the ATM is switched ON
	 * 0- OFF_STATE 1- IDLE_STATE 2- SERVING_CUSTOMER_STATE
	 * 
	 * @return String
	 */
	@Override
	public String getAtmState() {
		return "" + theSimulation.getAtm().getState();
	}

	/**
	 * Method to get session state This is initiated when the ATM card is
	 * inserted 1- READING_CARD_STATE 2- READING_PIN_STATE 3-
	 * CHOOSING_TRANSACTION_STATE 4- PERFORMING_TRANSACTION_STATE 5-
	 * EJECTING_CARD_STATE 6- FINAL_STATE
	 * 
	 * @return String
	 */
	@Override
	public String getSessionState() {
		return "" + theSimulation.getAtm().getCurrentSession().getState();
	}

	/**
	 * Method to get the transaction state This is initiated when transaction
	 * type is selected 1- GETTING_SPECIFICS_STATE 2- SENDING_TO_BANK_STATE 3-
	 * INVALID_PIN_STATE 4- COMPLETING_TRANSACTION_STATE 5-
	 * PRINTING_RECEIPT_STATE 6- ASKING_DO_ANOTHER_STATE
	 * 
	 * @return String
	 */
	@Override
	public String getTransactionState() {
		return "" + theSimulation.getAtm().getCurrentSession().getCurrentTransaction().getState();
	}

	/**
	 * Method to get the current transaction.
	 * @return
	 */
	
	@Override
	public Transaction getTransaction() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return theSimulation.getAtm().getTransaction();
	}

}
