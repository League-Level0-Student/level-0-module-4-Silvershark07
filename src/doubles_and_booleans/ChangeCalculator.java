package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
int nickels;
int dimes;		
int quarters;		

// Ask the user how many nickels they have
String n = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
nickels =Integer.parseInt(n);
		// Ask the user how many dimes they have, and convert their answer
String d =JOptionPane.showInputDialog("How many dimes do you have?");
dimes=Integer.parseInt(d);
// Ask the user how many quarters they have, and convert their answer
String q =JOptionPane.showInputDialog("How many quarters do you have?");
quarters=Integer.parseInt(q);
// Calculate how much money the user has and save it in a double variable 
 
		// Tell the user how much money they have
double money = (nickels*5) + (dimes*10) + (quarters*25) * .01;
	JOptionPane.showMessageDialog(null, "You have "  +money+  " dollars");
	
String P = "PB&J";
String T = "Turkey sandwich";	
String C = "cheese sandwich"	;
	
String sand = JOptionPane.showInputDialog("What kind of sandwhich do you want?");
	
if (sand.equals(P)) {	
	JOptionPane.showMessageDialog(null, "Here is your sandwich!");
	}
else if (sand.equals(T)) {	
	JOptionPane.showMessageDialog(null, "Here is your sandwich!");
	}
else if (sand.equals(C)) {	
	JOptionPane.showMessageDialog(null, "Here is your sandwich!");
}
	else {
	 JOptionPane.showMessageDialog(null, "I don't have this sandwich!");
	
	}
}
	
	
	
	
}

