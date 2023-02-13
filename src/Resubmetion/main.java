package Resubmetion;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int choice;
        double total = 0.0;
        int number;
        
        System.out.println("..............Welcome to the Restaurant!....................");
        procedural.displayMenu();
        
        do {
            System.out.print("Enter your choice and how many you want from it  ");
            choice = input.nextInt();
            number= input.nextInt();
            
            if (choice >= 1 && choice <= 5) {
                System.out.println("You have chosen  " +choice );
                total = procedural.calculateTotal(choice, total,number);
                System.out.println("Your total bill is $" + total + ".");
                
            } else if (choice == 6) {
                System.out.println("Quitting...");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
        
        System.out.println("Your total bill is $" + total + ".");
    }


	}

