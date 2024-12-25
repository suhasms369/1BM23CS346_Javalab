import java.util.Scanner;

class Account {
	String name;
	double accno;
	String type;
	double balance;
	
	public Account(String name, double accno, String type, double balance){
		this.name =  name;
		this.accno = accno;
		this.type = type;
		this.balance = balance;
	}
	
	void showBal(){
		System.out.println("Your balnce is " + balance);
	}
	
	void deposit(){
		Scanner S = new Scanner(System.in);
		System.out.print("Enter the amount to deposit ");
		double amount = S.nextDouble();
		balance += amount;
		showBal();
	}
	
	void withdraw(){
		Scanner S = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw ");
		double amount = S.nextDouble();
		if (amount > balance){
			System.out.println("insuffesient balance ");
		}
		else{
			balance -= amount;
			showBal();
		}
	}

	boolean isChecqueAvalabe(){
		return false;
	}
}


class SaveAcc extends Account {
	double rate = 7.0;
	int year;

	public SaveAcc(String name, double accnum, double balance, int year){
		super(name,accnum,"Savings",balance);
		this.year=year;
	}
	
	void get(){
	    Scanner S = new Scanner(System.in);
	    System.out.print("Enter customer Name ");
	    name = S.nextLine();
	    System.out.print("Enter Accno ");
	    accno = S.nextDouble();
	    System.out.print("Enter the balance amount ");
	    balance = S.nextDouble();
	    System.out.print("Enter the year ");
	    year = S.nextInt();	    
	    S.nextLine();
	}
	
	void coumpoundInterest(){
		double coumpound = balance *Math.pow((1+rate/100),year) - 1;
		balance +=coumpound;
		System.out.println("you interest is " +coumpound);
		showBal();
	}
	
	boolean isChecqueAvalabe(){
		return false;
	}
}

class CurrAcc extends Account {
    int minBal = 50000;
    
    public CurrAcc (String name, double accnum, double balance){
        super(name, accnum, "Current", balance);
    }
    
    void get(){
	    Scanner S = new Scanner(System.in);
	    System.out.print("Enter customer Name ");
	    name = S.nextLine();
	    System.out.print("Enter Accno ");
	    accno = S.nextDouble();
	    System.out.print("Enter the balance amount ");
	    balance = S.nextDouble();	    
	    S.nextLine();
	}
    
    void check(){
        if(balance<minBal){
            System.out.println("low balance service penalty");
            balance-=500;
        }
    }
    
    void withdraw(){
		Scanner S = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw ");
		double amount = S.nextDouble();
        if(amount > balance){
            System.out.println("no balance");
        }
        else{
            balance-=amount;
            check();
            showBal();
        }
    }
    
    boolean isChecqueAvalabe(){
		return true;
	}
}

public class Lab5{
    public static void main(String []args){
        Scanner S = new Scanner(System.in);
        int choice, subchoice;
        double amount;
        
        while(true){
            System.out.print("Enter the Account type\n 1. Saving Acc \n 2. Current Acc \n 3. to exit ");
            choice = S.nextInt();
            
            if (choice == 3){
                break;
            }
            
            if (choice == 1){
                SaveAcc SA = new SaveAcc(null,0,0,0);
                SA.get();            
                System.out.println("Menu \n 1.Deposit \n 2.Withdraw \n 3. show balance \n 4. compound interest \n 5. cheque availability \n 6.exit");
                boolean exit = true;
            
                while(exit){
                    System.out.print("Your choice ");
                    subchoice = S.nextInt();
                    switch(subchoice){
                        case 1:
                              SA.deposit();
                              break;
                        case 2:
                              SA.withdraw();
                              break;
                        case 3:
                              SA.showBal();
                              break;
                        case 4:
                              SA.coumpoundInterest();
                              break;
                        case 5:
                              System.out.println(SA.isChecqueAvalabe());
                              break;
                        case 6:
                              exit = false;
                              break;
                        default :
                              System.out.println("error");
                              break;
                  }
              }
			}
              
            else if(choice == 2){
                  CurrAcc CA = new CurrAcc(null,0,0);
                  CA.get();
                  
                  System.out.println("Menu \n 1.Deposit \n 2.Withdraw \n 3. show balance \n 4. cheque availability \n 5.exit");
                boolean exit = true;
                  
                  while(exit){
                      System.out.print("Your choice ");
                    subchoice = S.nextInt();
                    switch(subchoice){
                        case 1:
                              CA.deposit();
                              break;
                        case 2:
                              CA.withdraw();
                              break;
                        case 3:
                              CA.showBal();
                              break;
                        case 4:
                              System.out.println(CA.isChecqueAvalabe());
                              break;
                        case 5:
                              exit = false;
                              break;
                        default :
                              System.out.println("error");
                              break;
                  }
                  }
				}
              else {
              System.out.println("Wrong choice try again");
            
		}
	}
}
                }
                  
                    
            
            
            
            
            
            
        
