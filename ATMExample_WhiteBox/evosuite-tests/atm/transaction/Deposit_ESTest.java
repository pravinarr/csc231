/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 11 19:59:15 PDT 2016
 */

package atm.transaction;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
import banking.Message;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Deposit_ESTest extends Deposit_ESTest_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLoopbackAddress();
      ATM aTM0 = new ATM(2, "", "J,Rk`BA$Rn9V# hfB|W", (InetAddress) inet4Address0);
      Card card0 = new Card(2);
      Deposit deposit0 = new Deposit(aTM0, (Session) null, card0, 2);
      deposit0.setAmountToDeposit(2);
      boolean boolean0 = deposit0.isAmountSet();
      assertEquals(2, deposit0.getAmountToDeposit());
      assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("DEPOSIT TO: ");
      ATM aTM0 = new ATM((-2673), "DEPOSIT TO: ", "DEPOSIT TO: ", (InetAddress) inet4Address0);
      Session session0 = new Session(aTM0);
      Card card0 = new Card((-2673));
      Deposit deposit0 = new Deposit(aTM0, session0, card0, 1006);
      deposit0.setAccType(0);
      boolean boolean0 = deposit0.isAccountSet();
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      Session session0 = new Session((ATM) null);
      Card card0 = new Card(0);
      Deposit deposit0 = new Deposit((ATM) null, session0, card0, 0);
      //  // Unstable assertion: assertEquals(286, deposit0.getSerialNumber());
      
      deposit0.serialNumber = 0;
      Message message0 = deposit0.getSpecificsFromCustomer();
      //  // Unstable assertion: assertEquals(0, message0.getPIN());
  }

  @Test
  public void test03()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLoopbackAddress();
      ATM aTM0 = new ATM((-2270), "", "/gRNWQU5MW", (InetAddress) inet4Address0);
      Session session0 = new Session(aTM0);
      Card card0 = new Card((-1788));
      Deposit deposit0 = new Deposit(aTM0, session0, card0, (-2270));
      //  // Unstable assertion: assertEquals(260, deposit0.getSerialNumber());
      
      deposit0.serialNumber = (-93);
      deposit0.getSpecificsFromCustomer();
      //  // Unstable assertion: assertEquals(0, deposit0.getAmountToDeposit());
  }

  @Test
  public void test04()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLoopbackAddress();
      ATM aTM0 = new ATM((-2270), "", "/gRNWQU5MW", (InetAddress) inet4Address0);
      Session session0 = new Session(aTM0);
      Card card0 = new Card((-1788));
      Deposit deposit0 = new Deposit(aTM0, session0, card0, (-2270));
      Message message0 = deposit0.getSpecificsFromCustomer();
      //  // Unstable assertion: assertEquals(234, message0.getSerialNumber());
  }

  @Test
  public void test05()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("DEPOSIT TO: ");
      ATM aTM0 = new ATM((-2673), "DEPOSIT TO: ", "DEPOSIT TO: ", (InetAddress) inet4Address0);
      Session session0 = new Session(aTM0);
      Card card0 = new Card((-2673));
      Deposit deposit0 = new Deposit(aTM0, session0, card0, 1006);
      deposit0.setAmountToDeposit(2);
      int int0 = deposit0.getAmountToDeposit();
      assertEquals(2, int0);
  }

  @Test
  public void test06()  throws Throwable  {
      ATM aTM0 = new ATM(0, "d`%%", "d`%%", (InetAddress) null);
      Session session0 = new Session(aTM0);
      Card card0 = new Card(0);
      Deposit deposit0 = new Deposit(aTM0, session0, card0, 0);
      deposit0.setAccType(2455);
      int int0 = deposit0.getAccType();
      assertTrue(deposit0.isAccountSet());
      assertEquals(2455, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("DEPOSIT TO: ");
      ATM aTM0 = new ATM((-2673), "DEPOSIT TO: ", "DEPOSIT TO: ", (InetAddress) inet4Address0);
      Session session0 = new Session(aTM0);
      Card card0 = new Card((-2673));
      Deposit deposit0 = new Deposit(aTM0, session0, card0, 1006);
      deposit0.setAccType((-2673));
      int int0 = deposit0.getAccType();
      assertTrue(deposit0.isAccountSet());
      assertEquals((-2673), int0);
  }

  @Test
  public void test08()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLoopbackAddress();
      ATM aTM0 = new ATM(2, "", "J,Rk`BA$Rn9V# hfB|W", (InetAddress) inet4Address0);
      Card card0 = new Card(2);
      Deposit deposit0 = new Deposit(aTM0, (Session) null, card0, 2);
      deposit0.getSpecificsFromCustomer();
      deposit0.completeTransaction();
      //  // Unstable assertion: assertEquals(163, deposit0.getSerialNumber());
  }

  @Test
  public void test09()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("/+8;Sv3 >?Z58f");
      ATM aTM0 = new ATM(1776, "/+8;Sv3 >?Z58f", "/+8;Sv3 >?Z58f", (InetAddress) inet4Address0);
      Session session0 = new Session(aTM0);
      Card card0 = new Card(1776);
      Deposit deposit0 = new Deposit(aTM0, session0, card0, 1776);
      deposit0.setAccType(1776);
      deposit0.getSpecificsFromCustomer();
      // Undeclared exception!
      try { 
        deposit0.completeTransaction();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1776
         //
         assertThrownBy("atm.transaction.Deposit$1", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("DEPOSIT TO: ");
      ATM aTM0 = new ATM((-2673), "DEPOSIT TO: ", "DEPOSIT TO: ", (InetAddress) inet4Address0);
      Session session0 = new Session(aTM0);
      Card card0 = new Card((-2673));
      Deposit deposit0 = new Deposit(aTM0, session0, card0, 1006);
      deposit0.isAmountSet();
      //  // Unstable assertion: assertEquals(122, deposit0.getSerialNumber());
  }

  @Test
  public void test11()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("DEPOSIT TO: ");
      ATM aTM0 = new ATM((-2673), "DEPOSIT TO: ", "DEPOSIT TO: ", (InetAddress) inet4Address0);
      Session session0 = new Session(aTM0);
      Card card0 = new Card((-2673));
      Deposit deposit0 = new Deposit(aTM0, session0, card0, 1006);
      int int0 = deposit0.getAccType();
      //  // Unstable assertion: assertEquals(116, deposit0.getSerialNumber());
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("DEPOSIT TO: ");
      ATM aTM0 = new ATM((-2673), "DEPOSIT TO: ", "DEPOSIT TO: ", (InetAddress) inet4Address0);
      Session session0 = new Session(aTM0);
      Card card0 = new Card((-2673));
      Deposit deposit0 = new Deposit(aTM0, session0, card0, 1006);
      deposit0.setAmountSet(false);
      //  // Unstable assertion: assertEquals(112, deposit0.getSerialNumber());
  }

  @Test
  public void test13()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLoopbackAddress();
      ATM aTM0 = new ATM(2, "", "J,Rk`BA$Rn9V# hfB|W", (InetAddress) inet4Address0);
      Card card0 = new Card(2);
      Deposit deposit0 = new Deposit(aTM0, (Session) null, card0, 2);
      int int0 = deposit0.getAmountToDeposit();
      //  // Unstable assertion: assertEquals(106, deposit0.getSerialNumber());
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLoopbackAddress();
      ATM aTM0 = new ATM(2, "", "J,Rk`BA$Rn9V# hfB|W", (InetAddress) inet4Address0);
      Card card0 = new Card(2);
      Deposit deposit0 = new Deposit(aTM0, (Session) null, card0, 2);
      deposit0.setAmountToDeposit(2);
      deposit0.setAccountSet(true);
      // Undeclared exception!
      try { 
        deposit0.completeTransaction();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("atm.transaction.Deposit$1", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLoopbackAddress();
      ATM aTM0 = new ATM(2, "", "J,Rk`BA$Rn9V# hfB|W", (InetAddress) inet4Address0);
      Card card0 = new Card(2);
      Deposit deposit0 = new Deposit(aTM0, (Session) null, card0, 2);
      deposit0.setAmountToDeposit(2);
      // Undeclared exception!
      try { 
        deposit0.completeTransaction();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("atm.transaction.Deposit$1", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("DEPOSIT TO: ");
      ATM aTM0 = new ATM((-2673), "DEPOSIT TO: ", "DEPOSIT TO: ", (InetAddress) inet4Address0);
      Session session0 = new Session(aTM0);
      Card card0 = new Card((-2673));
      Deposit deposit0 = new Deposit(aTM0, session0, card0, 1006);
      deposit0.isAccountSet();
      //  // Unstable assertion: assertEquals(53, deposit0.getSerialNumber());
  }

  @Test
  public void test17()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName((String) null);
      ATM aTM0 = new ATM(1776, "U=\"/r\"", (String) null, (InetAddress) inet4Address0);
      Session session0 = new Session(aTM0);
      Card card0 = new Card(1776);
      Deposit deposit0 = new Deposit(aTM0, session0, card0, 1776);
      deposit0.setAmountToDeposit((-2068));
      int int0 = deposit0.getAmountToDeposit();
      assertEquals((-2068), int0);
  }

  @Test
  public void test18()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName((String) null);
      ATM aTM0 = new ATM(1776, "U=\"/r\"", (String) null, (InetAddress) inet4Address0);
      Session session0 = new Session(aTM0);
      Card card0 = new Card(1776);
      Deposit deposit0 = new Deposit(aTM0, session0, card0, 1776);
      deposit0.setAccType((-3183));
      deposit0.getSpecificsFromCustomer();
      assertTrue(deposit0.isAccountSet());
  }
}
