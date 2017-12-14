public class Date {

	// Default constructor 
	public Date() {

		this.month = 1;
		this.day = 1;
		this.year = 2010;

	} // End of Default constructor

	// Constructor using month, day, and year inputs
	public Date(int theMonth, int theDay, int theYear){

		this.month = theMonth;
		this.day = theDay;
		this.year = theYear;
	} // End of three-part constructor

	public boolean equals(Object rhs) {

		if (!(rhs instanceof Date)) {
			return false;
		} // End of if statement

		Date rhDate = (Date) rhs;

		return rhDate.month == month && 
				rhDate.day == day &&
				rhDate.year == year;

	} // End of equals method

	// Overwrite default object toString method 

	public String toString() {

		return month + "/" + day + "/" + year;

	} // End of toString method

	// Date class properties

	private int month;
	private int day;
	private int year;

} // End of Date class