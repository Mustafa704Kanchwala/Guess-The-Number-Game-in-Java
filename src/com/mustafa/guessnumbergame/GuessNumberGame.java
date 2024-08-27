package com.mustafa.guessnumbergame;
import java.util.*;
public class GuessNumberGame {
	public static void main(String args[]) {
		String plyr;
		int val;
		int EASY_MODE = 10;
		int HARD_MODE = 5;
		int mode;
		int g_val;
		
		Scanner obj1 = new Scanner(System.in);
		Random obj2 = new Random();
		
		System.out.print("Enter the name of player :");
		plyr = obj1.nextLine();
		System.out.println("\nWellcome "+plyr+" :)");
		System.out.println("\nPlease select mode:" +"\n 1)Easy mode\n 2)Hard mode");
		mode = obj1.nextInt();
		val = obj2.nextInt(0,100);
		
		
		if(mode == 1) {
			System.out.print("You selected the easy mode\n You have 10 tries:\n");
			
			}
		
		else if(mode == 2) {
			System.out.println("You selected the hard mode\n\n You have 5 tries:\n");
			}
		
		else {
			System.out.println("Invalid input :(");
		}
	}
}
