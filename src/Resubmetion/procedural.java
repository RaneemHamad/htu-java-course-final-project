package Resubmetion;

public class procedural {
	
	public static void displayMenu() {
        System.out.println("Please choose from the following menu options:");
        System.out.println("1. Burger\n2. Pizza\n3. Salad\n4. Drink\n5. Dessert\n6. Quit");
    }
    
    public static double calculateTotal(int choice, double total,int number) {
        switch (choice) {
            case 1:
                total = 6.99*number;
                break;
            case 2:
                total = 8.99*number;
                break;
            case 3:
                total = 5.99*number;
                break;
            case 4:
                total = 2.99*number;
                break;
            case 5:
                total = 3.99*number;
                break;
        }
        return total;
    }
}
