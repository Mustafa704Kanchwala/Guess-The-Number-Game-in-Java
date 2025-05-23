package com.mustafa.guessnumbergame;
import java.util.*;
public class GuessNumberGame {
	public static int EASY_MODE = 10;
	public static int HARD_MODE = 5;
	public static void main(String args[]) {
		String plyr;
		int val;
		
		int mode;
		int g_val;
		
		try (Scanner obj1 = new Scanner(System.in)) {
			Random obj2 = new Random();
			
			System.out.println("Enter the name of player :");
			plyr = obj1.nextLine();
			System.out.println("\nWellcome "+plyr+" :)");
			
			System.out.println("\nPlease select mode:" +"\n 1)Easy mode\n 2)Hard mode\n 3)Exit");
			mode = obj1.nextInt();
			
			val = obj2.nextInt(1,101);
			
			
			if(mode == 1) {
				System.out.print("Guess Number :");
				System.out.println("You selected the easy mode\n\n You have 10 tries:\n");
				for(int game = 0; game < EASY_MODE; game++) {
					//Easy mode code goes here//
					
					g_val = obj1.nextInt();
					if(g_val < val) {
						System.out.println("Too Less!!");
					}
					else if(g_val > val) {
						System.out.println("Too High!!");					
					}
					else if(g_val == val) {
						System.out.print("Correct Guess "+plyr+" :)");
						break;
					}
				}
			
			}
			else if(mode == 2) {
				System.out.print("Guess Number :");
				System.out.println("You selected the hard mode\n\n You have 05 tries:\n");
				for(int game = 0; game < HARD_MODE; game++) {
					//Hard mode code goes here//
					g_val = obj1.nextInt();
					if(g_val < val) {
						System.out.println("Too Less!!");
					}
					else if(g_val > val) {
						System.out.println("Too High!!");					
					}
					else if(g_val == val) {
						System.out.print("Correct Guess "+plyr+" :)");
						break;
					}
				}
			}
			else if(mode == 3) {
				System.out.println("Thanks for Playing..." + plyr);
			}
			else{
				System.out.println("Invalid input!!!!");
			}
		}
	}
}