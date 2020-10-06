import java.util.Calendar;

/*
 * Name: Jennifer Stegina
 * Date: 28 January 2019
 * Description: Heart Rate Problem
 */

public class HeartRate {
	
	//declare variables
	private String firstName; //all instance variables
	private String lastName;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	
	//HeartRate constructor with the five required parameters
	public HeartRate(String firstName,String lastName,int birthDay,int birthMonth,int birthYear){
		
		// assign values to each specific instance variable		
		this.firstName = firstName; 
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		 
	}
	
	//all sets and gets for the attributes to follow
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	
	public int getBirthDay() {
		return birthDay;
	}
	
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	
	public int getBirthMonth() {
		return birthMonth;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	Calendar calendar = Calendar.getInstance(); 

    int calYear = calendar.get(Calendar.YEAR); 
    int calDay = calendar.get(Calendar.DAY_OF_MONTH); 
    int calMonth = calendar.get(Calendar.MONTH) + 1; 
	
	public int getAge(){
		int age = calYear - birthYear;             
		if (birthMonth > calMonth) {
            age -= 1;
        } 
		else if (birthMonth == calMonth) {
				if (birthDay > calDay) {
					age -= 1;
				}
        	}
		return age;
	}
	//max heart rate is 220 - your age (in years)
	public double calcMaxHeartRate(){
		double maxHeartRate = 220 - getAge();
		return maxHeartRate;
	}
	
	//min heart rate is 50% of the max
	public double calcMinTargetHeartRate(){
		double minTargetHeartRate = calcMaxHeartRate() * 0.5 ;
		return minTargetHeartRate;
	}
	
	//max heart rate is 85% of the max
	public double calcMaxTargetHeartRate() {
		double maxTargetHeartRate = calcMaxHeartRate() * 0.85; 
		return maxTargetHeartRate;
	}
	
	//display to the user all attributes created
	public void printInformation() {
		System.out.printf("%s %s's age in years is %d."
				+ "\nWith a birthdate of %d/%d/%d."
				+ "\nRecommended max heart rate is %.0f. "
				+ "\nTarget heart rate range is %.0f to %.0f.\n", 
				firstName, lastName, getAge(), getBirthMonth(),
				getBirthDay(), getBirthYear(),calcMaxHeartRate(), 
				calcMinTargetHeartRate(), calcMaxTargetHeartRate());
	}
}
