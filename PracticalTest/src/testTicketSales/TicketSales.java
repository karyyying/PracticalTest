package testTicketSales;

import org.junit.Test;

import ticketSales.*;

import static org.junit.Assert.*;

public class TicketSales {
    // Hint:
    // Enum Category can be declared as e.g. "Category.Adult, Category.Children ..."
    // For comparing double in JUnit
    // assertEquals (double, double, delta) , delta can be 0 .
    // e.g. assertEquals (10.00, 10.00, 0);
    // Add your answers to their respective test cases below.

    // Add your answer to the six test cases for Q2
	@Test
	public void testQ2_1() {
		Buyer buyer = new Buyer();
		Ticket t = new Ticket(buyer);
		double res = t.getDiscountRate(Category.Children, 0);
		assertEquals(res, -1.00, 0.0);
	}

	@Test
	public void testQ2_2() {
		Buyer buyer = new Buyer();
		Ticket t = new Ticket(buyer);
		double res = t.getDiscountRate(Category.Children, 1);
		assertEquals(res, 0.80, 0.0);
	}

	@Test
	public void testQ2_3() {
		Buyer buyer = new Buyer();
		Ticket t = new Ticket(buyer);
		double res = t.getDiscountRate(Category.Senior, 11);
		assertEquals(res, 0.50, 0.0);
	}

	@Test
	public void testQ2_4() {
		Buyer buyer = new Buyer();
		Ticket t = new Ticket(buyer);
		double res = t.getDiscountRate(Category.Senior, 1);
		assertEquals(res, 0.65, 0.0);		
	}

	@Test
	public void testQ2_5() {
		Buyer buyer = new Buyer();
		Ticket t = new Ticket(buyer);
		double res = t.getDiscountRate(Category.Student, 5);
		assertEquals(res, 0.65, 0.0);	
	}

	@Test
	public void testQ2_6() {
		Buyer buyer = new Buyer();
		Ticket t = new Ticket(buyer);
		double res = t.getDiscountRate(Category.OTHER, 7);
		assertEquals(res, 1.00, 0.0);	
	}

	
    // Add your answer to the two test cases for Q3
	// Hint: Use either the default constructor or declare a constructor in the stub class with super.
	@Test
	public void testQ3_1() {
		class Buyer_stub extends Buyer{
			public boolean isBirthdayThisWeek() {
				return true;
			}
		}
		Buyer_stub buyer = new Buyer_stub();
		Ticket t = new Ticket(buyer);
		double res = t.getDiscountRate(Category.OTHER, 6);
		assertEquals(res, 0.50, 0.0);	
	}


    @Test
    public void testQ3_2() {
		class Buyer_stub extends Buyer{
			public boolean isBirthdayThisWeek() {
				return true;
			}
		}
		Buyer_stub buyer = new Buyer_stub();
		Ticket t = new Ticket(buyer);
		double res = t.getDiscountRate(Category.OTHER, 4);
		assertEquals(res, 0.85, 0.0);	
    }

    // Add your answer to the two test cases for Q4
	@Test
	public void testQ4_1() {
		Buyer buyer = new Buyer("Peter", 15, 10);
		Ticket t = new Ticket(buyer);
		double res = t.getDiscountRate(Category.OTHER, 7);
		assertEquals(res, 0.50, 0.0);	
	}

	@Test
	public void testQ4_2() {
		Buyer buyer = new Buyer("Amy", 15, 10);
		Ticket t = new Ticket(buyer);
		double res = t.getDiscountRate(Category.OTHER, 3);
		assertEquals(res, 0.85, 0.0);	
	}
	

}
