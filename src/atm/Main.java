package atm;

import java.util.Scanner;

public class Main {

	public static void print(String msg) {
		System.out.print(msg);
	}
	
	public static void main(String[] args) {
		int ATM_BALANCE = 10000;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			print("\n1 - Check Balance\n2 - Withdraw Money\n99 - Close\nATM Input> ");
			int atmnum = scan.nextInt();
			
			if (atmnum == 1) {
				print("Your balance total is " + ATM_BALANCE + "\n\n");
			} else if (atmnum == 2) {
				print("\nEnter amount of money to withdraw\nAmount> ");
				int takemoney = scan.nextInt();
				
				if (takemoney > ATM_BALANCE) {
					print("\nI don't want you to go in debt.\nYou cannot withdraw more than you have.\n");
				}
			} else if (atmnum == 99) {
				scan.close();
				System.exit(0);
			}
		}
	}
}
