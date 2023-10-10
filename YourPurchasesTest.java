import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest {

	private static final double EPSILON = 1E-12;
	
	/**
	 * Tests CalculateChange() methods
	 */
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0); //Five dollars of payment.
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50; //Expecting 3.5 dollars of change.
	    Assert.assertEquals(expected, changeResult, EPSILON);
		
	}

	
	 // YOUR TASKS ARE STATED HERE: 
	   // RUN THE TEST CASE IN YourPurchasesTest.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE individual TEST CASES 
		//  (NOT ALREADY STATED IN THIS CODE) TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	   // ADD NEW TEST CASES HERE!!!
	
	
	/**
	 * Tests recordPurchase() and getPurchase() methods
	 */
    @Test
    public void testRecordPurchase() {
        YourPurchases aPurchase = new YourPurchases();
        aPurchase.recordPurchase(2.0); // 2 dollars of payment.
        double price = aPurchase.getPurchase();
        double expected = 2.0; // Expecting 2.0 dollars (price of an item)
        Assert.assertEquals(expected, price, EPSILON);
    }

	/**
	 * Tests receivePayment() and getPayment() methods
	 */
    @Test
    public void testRecievePayment() {
    	YourPurchases bPurchase = new YourPurchases();
    	bPurchase.receivePayment(7,1,2,1,3); // 7.53 dollars of payment.
        double payment = bPurchase.getPayment();
        double expected = 7.53; // Expecting 7.53 dollars payment
        Assert.assertEquals(expected, payment, EPSILON);
    }
    
	/**
	 * Tests giveChange() method
	 */
    @Test
    public void testGiveChange() {
    	YourPurchases cPurchase = new YourPurchases();
		cPurchase.recordPurchase(7.0);
		cPurchase.receivePayment(8, 0,0,0,0); //8.0 dollars of payment.
		double change = cPurchase.giveChange(); //1.0 dollars of change.
        double expected = 1.0; // Expecting 1.0 dollars of change.
        Assert.assertEquals(expected, change, EPSILON);
    }

}
