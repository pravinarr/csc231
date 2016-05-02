/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 11 21:15:26 PDT 2016
 */

package atm.transaction;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.net.Inet4Address;
import java.net.InetAddress;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.Test;
import org.junit.runner.RunWith;

import atm.ATM;
import atm.Session;
import banking.Card;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(useVNET = true)
public class Transfer_ESTest extends Transfer_ESTest_scaffolding {

	@Test
	public void test0() throws Throwable {
		ATM aTM0 = new ATM((-5648), "=)F", "=)F", (InetAddress) null);
		Card card0 = new Card((-5648));
		Transfer transfer0 = new Transfer(aTM0, (Session) null, card0, (-5648));
		// Undeclared exception!
		transfer0.getSpecificsFromCustomer();
		assertNotNull(transfer0);

	}

	@Test
	public void test1() throws Throwable {
		Inet4Address inet4Address0 = (Inet4Address) MockInetAddress.anyLocalAddress();
		ATM aTM0 = new ATM(3017, "2G{Y0", "2G{Y0", (InetAddress) inet4Address0);
		Card card0 = new Card(3017);
		Transfer transfer0 = new Transfer(aTM0, (Session) null, card0, 3017);
		transfer0.getSpecificsFromCustomer();
		// Undeclared exception!
		transfer0.completeTransaction();
		assertNotNull(transfer0);
	}
}
