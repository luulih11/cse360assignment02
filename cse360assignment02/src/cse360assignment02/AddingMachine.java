package cse360assignment02;
/*
 * @author Luuli Hoang
 * @version 2.0
 */

public class AddingMachine {
	private int total;
	private String memory;
	
	/*
	 * This is the constructor for AddingMachine that instantiates the variables
	 */
	public AddingMachine () {
		total = 0; // not needed - included for clarity
		memory = "0";
	}
	
	/*
	 * This method returns the total value of AddingMachine
	 * @return the AddingMachine's total
	 */
	public int getTotal () { 
		return total;
	}
	
	/*
	 * This method adds the parameter to the AddingMachine's total and
	 * updates the memory string to be used by toString
	 * @param value value to add to the AddingMachine's total and memory
	 */
	public void add (int value) { 
		total += value;
		memory += " + " + value;
	}
	
	/*
	 * This method subtracts the parameter to the AddingMachine's total and
	 * updates the memory string to be used by toString
	 * @param value value to subtract from the AddingMachine's total and add to the memory
	 */
	public void subtract (int value) { 
		total -= value;
		memory += " - " + value;
	}
	
	/*
	 * This method returns all the operations of the AddingMachine
	 * @return the AddingMachine's operations as a string
	 */
	public String toString () { 
		return memory;
	}
	
	/*
	 * This method resets the AddingMachine's total and memory string
	 */
	public void clear() { 
		total = 0;
		memory = "0";
	}
}