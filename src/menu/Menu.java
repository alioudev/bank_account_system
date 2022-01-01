package menu;

import java.util.Scanner;

public class Menu {
	
	public static void optionOne() {
		System.out.println("Type du compte : [Types possibles : COURANT, JOINT, EPARGNE] :");
		System.out.println("Num�ro du compte :");
		System.out.println("Premi�re valeur cr�dit�e :");
		System.out.println("Taux de placement :");
	}
	
	/**
	 * Retrieves informations about the account that is going to be displayed
	 * @param args
	 */
	public static int optionTwo() {
		System.out.println("Quel compte souhaitez-vous consulter ?");
		Scanner account = new Scanner(System.in);
		int accToDisplay = account.nextInt();
		account.close();
		return accToDisplay;
	}
	
	/**
	 * Display : Not handled yet
	 * @param args
	 */
	public static void optionThree() {
		System.out.println("Option not yet implemented.");
	}
	
	/**
	 * Exit the program
	 * @param args
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
		
		System.out.println("1 - Creer un compte");
		System.out.println("2 - Afficher un compte");
		System.out.println("3 - Creer une ligne comptable");
		System.out.println("4 - Sortir");
		System.out.println("5 - De l'aide");
		System.out.println("Votre choix :");
		Scanner choice = new Scanner(System.in);
		int validChoice = choice.nextInt();
		choice.close();
		// swithc through the choice made
			switch(validChoice) {
				case 1 : 
						Menu.optionOne();
						break;
				case 2 :
						Menu.optionTwo();
						break;
				default:
					System.out.println("Choice is not a valid operation");
			}
			
	}

}
