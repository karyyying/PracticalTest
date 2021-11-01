package ticketSales;

public enum Category {
    Adult, 
    Children, 
    Senior,
    Student, 
    OTHER;

	public static double getCategoryRate(Category item_cat, int item_quan) {
	    if (item_cat == Category.Children) {
	        return 0.80;
	    } else if (item_cat == Category.Senior) {
	        if (item_quan > 10) {
	        	return 0.50;
	        } else if (item_quan > 3) {
	        	return 0.60; // This statement is labeled as L1
	        } else {
	        	return 0.65;
	        }
	    } else if (item_cat == Category.Student) {
	        if (item_quan > 6) {
	        	return 0.55; // This statement is labeled as L2
	        } else {
	        	return 0.65; 
	        }
	    } else {
	    	return 1.00;
	    }
	}
}

