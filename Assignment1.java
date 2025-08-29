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
					t.sellTickets(input);
					break;
				case 2:
					break;
				case 3:
					t.changeTicketPrice(input);
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
		seats = 50;
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

	public void sellTickets(Scanner input){
		System.out.println("Sell how many tickets? ");
		int ammount = input.nextInt();
		if(ammount > this.seats){
			System.out.println("Unable to sell " + ammount + " tickets: Only " + this.seats + " seats available.");
		}else{
			System.out.println("Sold " + ammount + " tickets at $" + this.ticketPrice + " for a total of $" + ammount * this.ticketPrice);
			this.seats -= ammount;
			this.balance += ammount * this.ticketPrice;
		}
		System.out.println();
	}

	public void changeTicketPrice(Scanner input){
		System.out.print("Enter new ticket price: $");
		this.ticketPrice = input.nextDouble();
		System.out.println("Ticket price updated.\n");
	}

	public void endMovie(){
		System.out.println("All seats have been vacated and cleaned.\n");
		this.seats = 50;
	}

}
