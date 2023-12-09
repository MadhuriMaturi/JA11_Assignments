package ui;
import java.util.Scanner;

import com.hdfc.service.Ban;

public class ATmUI {
	public static void main(String[] args)
	{
		System.out.println("welcome to atm");
		System.out.println("1.deposit");
		System.out.println("2.withdraw");
		System.out.println("3.exit");
		Scanner scanner=new Scanner(System.in);
		int choice= scanner.nextInt();
		Ban bank =Ban.util.getBankobj;
		switch(choice)
		{
		case 1:
			bank.withdraw();// withdraw
			break;
		case 2:
			bank.deposit()//deposit
			break;
		case 3:
		 System.exit();// exit
		break;
		default:
			System.err.println("Invalid Input");
		}
	}

}
