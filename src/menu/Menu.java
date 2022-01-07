package menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	/**
	 * Instances variables for the program
	 */

	public  ArrayList<Object> accountArrayList = new ArrayList<>();
	/**
	 * Menu of the program
	 */
	public static void menu(){
		System.out.println("1 - Creer un compte");
		System.out.println("2 - Afficher un compte");
		System.out.println("3 - Creer une ligne comptable");
		System.out.println("4 - Sortir");
		System.out.println("5 - Afficher l'aide");
		System.out.println("Votre choix :");
	}

	/**
	 * Displays form for a new account to be created
	 * return 
	 */
	public  void optionOne() {
		System.out.println("Type du compte : [Types possibles : COURANT, JOINT, EPARGNE] :");
		Scanner account = new Scanner(System.in);
		String accountType = account.next();
		accountArrayList.add(accountType);
		System.out.println("Numero du compte :");
		System.out.println("Premiere valeur creditee :");
		System.out.println("Taux de placement :");
		
		account.close();
	}
	
	/**
	 * Retrieves informations about the account that is going to be displayed
	 * @param args
	 */
	public static Integer optionTwo() {
		System.out.println("Quel compte souhaitez-vous consulter ?");
		Scanner account = new Scanner(System.in);
		int accountToDisplay = account.nextInt();
		account.close();
		return accountToDisplay;
	}
	
	/**
	 * Display : Not handled yet
	 * @param args : N/A
	 */
	public static void optionThree() {
		System.out.println("Option not yet implemented.");
	}
	
	/**
	 * Exit the whole program
	 * @param args : N/A
	 */
	public static void optionFour() {
		System.exit(0);
	}
	
	/**
	 * Displays help related to the different options of the program
	 * @param args
	 */
	public static void optionFive(){
		// not yet implemented
		
	}
	
	
	public static void main(String[] args) {
		
		// call the menu
		menu();
		// get the user input (i.e choice)
		Scanner choice = new Scanner(System.in);
		int validChoice = choice.nextInt();
		// 
			// switch through the choice of the user
				switch(validChoice) {
					case 1 : 
							optionOne();
							break;
					case 2 :
							optionTwo();
							break;
					case 3 : 
							optionThree();
							break;
					case 4 : 
							optionFour();
							break;
					case 5 : 
							optionFive();
							break;
					default:
						System.out.println("Choice is not a valid operation, make a new one.");
				}
			
		// close the used scanner
		choice.close();
	}

}
