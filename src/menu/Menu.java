package menu;

import java.util.Scanner;

public class Menu {
	
	public void optionOne() {
		System.out.println("Type du compte : [Types possibles : COURANT, JOINT, EPARGNE] :");
		System.out.println("Numéro du compte :");
		System.out.println("Première valeur créditée :");
		System.out.println("Taux de placement :");
	}
	
	/**
	 * Retrieves informations about the account that is going to be displayed
	 * @param args
	 */
	public int optionTwo() {
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
	public void optionThree() {
		System.out.println("Option not yet implemented.");
	}
	
	/**
	 * Exit the program
	 * @param args
	 */
	public void optionFour() {
		System.exit(0);
	}
	
	/**
	 * Displays help related to the different options of the program
	 * @param args
	 */
	public void optionFive(){
		
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
				
			}
			
	}

}
