/*
 * Name: Jennifer Stegina
 * Date: 18 February 2019
 * Description: Employee PieceWorker Problem
 * 
 * Instructions: In your subclass, PieceWorker, do the following:
 * 1) PieceWorker should inherit from Employee
 * 2) Pieceworker should create private variables for wage (wage per piece) and pieces (number of pieces produced)
 * 3) The constructor of PieceWorker should take in enough information to instantiate the super class, 
 * 		as well as any values the PieceWorker class needs. The constructor should call the set methods
 * 4) Each private variable should have a get/set method and the sets should validate that wages and 
 * 		pieces are greater than 0. It should throw an exception if not.
 * 5) This class should override the earnings and toString() methods from the base class.
 */
public class PieceWorker extends Employee {

	private double wagePerPiece; // wage per piece output
	private double quantity; // output for week
	
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, 
			double wagePerPiece, double quantity) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
		setWagePerPiece(wagePerPiece);
	    setQuantity(quantity);
	}

	 // set PieceWorker's wage
	 public void setWagePerPiece(double wagePerPiece) {
		 if (wagePerPiece <= 0.0) {
	         throw new IllegalArgumentException(
	            "Wage per piece must be > 0.0");
	 	}
	      this.wagePerPiece = wagePerPiece;
	 }
	 
	 //get wage per piece
	 public double getWagePerPiece() {
	      
		 return wagePerPiece;
	 }

	 // set quantity
	 public void setQuantity(double quantity) {
		 if( quantity <= 0) {
			 throw new IllegalArgumentException(
				"Quantity must be > 0");
		 }
		 this.quantity = quantity;
	 }
	 
	//get quantity made
	 public double getQuantity() {
			 
		 return quantity;
	}

	// determine PieceWorker's earnings
	@Override
	public double earnings() {
	    return getQuantity() * getWagePerPiece();
	}

	// return String representation of PieceWorker object
	@Override                                                   
	public String toString() {                                                           
	      return String.format("%s: %s%n%s: $%,.2f%n%s: %.2f",    
	         "piece worker employee", super.toString(),              
	         "wage per piece", getWagePerPiece(),                       
	         "quantity made", getQuantity());             
	   } 
}