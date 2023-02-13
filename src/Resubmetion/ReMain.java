package Resubmetion;

public class ReMain {
    public static void main(String[] args) {
    	FastFoodRestaurant mcdonalds = new FastFoodRestaurant("McDonald's", "Amman", "Burgers, fries, shakes");
    	FineDiningRestaurant leBernardin = new FineDiningRestaurant("leBernardin", "Aqaba", "chicken, Bread");
    	//method call to display the details of each restaurant
    	mcdonalds.displayRestaurantDetails();
    	System.out.println("Type: " + mcdonalds.getType());

    	leBernardin.displayRestaurantDetails();
    	System.out.println("Type: " + leBernardin.getType());
    }
}

