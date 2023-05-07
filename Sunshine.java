// EXAM PAPER QUESTION 2015/2016
// Adam Plesca
// 7/5/23

public class Sunshine{
	//data members pirvately owned by this class alone
	private String month, season;
	private int people, price;
	//constructor, which assigns a value to an object
	public Sunshine(){
		price = 0;
		people = 0;
		month = "";
		season = "";
	}
	//setters, sets a value for the user input and then goes to compute it below
	public void setPeople(int people){
		this.people = people;
	}
	public void setMonth(String month){
		this.month = month;
	}
	//where the calculations are done to give a price to the user
	public void compute(){
		switch(month.toLowerCase()){ //toLowerCase method used to be able to have the user type the month in whichever way they please (aslong as it is correct) JANUARY january January etc
			case "march" : //if user types in the three months, the compute method will assign the season to Spring and calculate the total people going to give the user the price
			case "april" :
			case "may" :
				season = "Spring";
				if(people >= 1 || people <= 4){ //selection statement otherwise known as an if statement used to calculate the following user input on how many people they are bringing with them on sunshine tours
					price = people*400;
				}else if(people < 5){
					price = people*300;
				}
					break;
			case "june" :
			case "july" :
			case "august" :
				season = "Summer";
				if(people >= 1 || people <= 4){
					price = people*600;
				}else if(people < 5){
					price = people*500;
				}
					break;
			case "september" :
			case "october" :
			case "november" :
				season = "Autumn";
				if(people >= 1 || people <= 4){
					price = people*500;
				}else if(people < 5){
					price = people*400;
				}
					break;
			case "december" :
			case "january" :
			case "febuary" :
				season = "Winter";
				if(people >= 1 || people <= 4){
					price = people*300;
				}else if(people < 5){
					price = people*200;
				}
					break;
		}
	}
	//getters, these return a value that has been calculated in the compute method
	public int getPrice(){
		return price;
	}
	public String getSeason(){
		return season;
	}
	public int getPeople(){
		return people;
	}
}