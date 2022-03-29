import java.util.Scanner;

public class Miniproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount BNK1 = new BankAccount("PRAKASH", "SP6708");
		BNK1.showMenu();
	}

}

class BankAccount {
	int balance = 1000;
	int previousTransaction;
	String customerName;
	String customerId;
	BankAccount(){
		
	}
	BankAccount(String cname, String cid)
	{
		customerName = cname;
		customerId = cid;
	}

		void deposit(int amount) {
				if (amount != 0) {
					balance = balance + amount;
					
				}
			}

			void withdraw(int amount) {
				if(balance < amount) {
					System.out.println("insufficient funds");
				}
				if (amount != 0 && balance > amount) {
					balance = balance - amount;
					
				}
			}
		void showMenu()
			{
				int option ;
				Scanner sc = new Scanner (System.in);
				
				System.out.println("Welcome " + customerName);
				System.out.println("Your ID is : " + customerId);
				System.out.println("");
				System.out.println("1 - Check Balance");
				System.out.println("2 - Deposit");
				System.out.println("3 - Withdraw");
				System.out.println("4 - Exit");
				
				do
				{
					System.out.println("*********************************");
					System.out.println("Enter an option");
					System.out.println("*********************************");
					option = sc.nextInt();
					System.out.println("\n");

					switch (option)
					{
					case 1 :
						System.out.println("----------------------------");
						System.out.println("Balance = " + balance);
						System.out.println("----------------------------");
						System.out.println("\n");
						break;
						
					case 2 :
			
						System.out.println("----------------------------");
						System.out.println("Enter an amount to deposit : ");
						System.out.println("----------------------------");
						int amount = sc.nextInt();
						deposit(amount);
						System.out.println("Balance  After deposit = " + balance);
						System.out.println("\n");
						break;

	                case 3 :
						System.out.println("----------------------------");
						System.out.println("Enter an amount to withdraw : ");
						System.out.println("----------------------------");
						int amount2 = sc.nextInt();
						withdraw(amount2); 
							System.out.println(" Current Balance = " + balance);
						System.out.println("\n");
						break;
						
					
					case 4 :
						System.out.println("****************************");
						break;
						
						default :
							System.out.println("Invalid Option!, Please enter a valid option");
							break;
					}
				}
					while (option != 4);
					
				System.out.println("Thank You for using our Bank services");
			
			
		

	}

			
		}

		
			
		


