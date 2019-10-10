// NAME:  Audrey Kong
// Assignment #2
// Assignment #2
package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;

	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}

	public int getTotal () {
		return total;
	}

	public void add (int value) {
		total = total + value;
		history = history + total + " " +  "+" + " "+ value + "\n";
	}

	public void subtract (int value) {
		total = total - value;
		history = history + total + " " + "-" + " " + value + "\n";

	}

	public String toString () {
		return history;
	}

	public void clear() {

	}
}
