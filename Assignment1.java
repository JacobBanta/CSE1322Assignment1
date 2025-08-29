import java.util.Scanner;
public class Lab1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("[Movie Theater Manager]");
		Theater t = new Theater();
		boolean shouldQuit = false;
		while(!shouldQuit){
			System.out.print("1. Sell tickets\n2. End movie session\n3. Change ticket price\n4. Sell confection\n5. Change price of confection\n6. View Balance\n7. View prices\n8. Quit\nEnter option: ");
			int option = input.nextInt();
			System.out.println();
			switch(option){
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					t.viewBalance();
					break;
				case 7:
					break;
				case 8:
					shouldQuit = true;
					break;
			}
		}
	}
}
class Theater {
	int seats;
	double balance;
	double ticketPrice;
	double popcornPrice;
	double sodaPrice;
	double candyPrice;

	public Theater(){
		seats = 30;
		balance = 0;
		ticketPrice = 30;
		popcornPrice = 25;
		sodaPrice = 10;
		candyPrice = 15;
	}

	public void viewBalance(){
		System.out.println("Current balance is $" + this.balance);
		System.out.println();
	}

}
