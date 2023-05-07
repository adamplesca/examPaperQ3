// EXAM PAPER QUESTION 2015/2016
// Adam Plesca
// 7/5/23

import javax.swing.JOptionPane;

public class SunshineApp{
	public static void main(String args[]){
		 //public data varibales, non assigned
		 String month,season;
		 int people, price;
		 //created the object for my instantiable class to work
		 Sunshine SS = new Sunshine();
		 //gets the month of which the user is going, brings it to the instantiable class
		 month = JOptionPane.showInputDialog(null, "What month do you plan on going to Sunshine Tours?: ");
		 SS.setMonth(month);
		 //gets the people of which the user is going, brings it to the instantiable class
		 people = Integer.parseInt(JOptionPane.showInputDialog(null, "How many people are you planning on going with?"));
		 SS.setPeople(people);
		 //calls and uses the compute method in the main class (this one)
		 SS.compute();
		 //assigns variables that were not yet assigned and then calls on the getters to bring back the calulated value from the compute method
		 price = SS.getPrice();
		 season = SS.getSeason();
		 //tells the user the final amount and all the choices of the user who used the SunshineApp
		 JOptionPane.showMessageDialog(null, "Here is the total price based on you choices are as followed:\nPeople:  "+people+"\nMonth:  "+month+"\n\nThe season you are going in is:  "+season+"\nThe total will be:  $"+price);
	}
}