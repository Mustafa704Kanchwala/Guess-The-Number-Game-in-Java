package com.mustafa.guessnumbergame;
import java.util.*;
public class GuessNumberGame {
	public static void main(String args[]) {
		String plyr;
		
		Scanner obj1 = new Scanner(System.in);
		Random obj2 = new Random();
		
		System.out.println("Enter the name of player :");
		plyr = obj1.nextLine();
		System.out.println("\nWellcome "+plyr+"!!");
	}
}
