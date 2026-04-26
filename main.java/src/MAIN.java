import java.util.Scanner;

class TaxiCustomer {
    private static Scanner sc = new Scanner(System.in);
    private static float surchargeRate = 5.0f, distance, charge, amount;
    private static int choice;
    public String username;
    private String password;
    private float balance;
    TaxiCustomer(String username) {
        this.username = username;
    }
    void setPassword(String password) {
        this.password = password;
    }
    String getPassword() {
        return password;
    }
    void setBalance(float balance) {
        this.balance = balance;
    }
    void displayUserMenu() {
        System.out.println("\n-------------------------USER MENU-------------------------\n");
        System.out.println("Welcome, "+username+"!");
        System.out.println("1 - Check your account balance");
        System.out.println("2 - Deposit money in your account");
        System.out.println("3 - Book a ride\t\t\t");
        System.out.println("4 - Logout");
        System.out.println("Enter your choice:");
        choice = sc.nextInt();
        sc.nextLine();
        switch(choice) {
            case 1:	checkBalance();
                break;
            case 2: depositAmount();
                break;
            case 3: bookARide();
                break;
            case 4:	System.out.println("Logging out....");
                break;
            default: System.out.println("Invalid choice. Try again.");
                displayUserMenu();
                break;
        }
    }
    void checkBalance() {
        System.out.format("Your current balance is Rs. %.2f\n", balance);
        displayUserMenu();
    }
    void depositAmount() {
        System.out.println("Enter amount to be deposited:");
        amount = sc.nextFloat();
        sc.nextLine();
        balance += amount;
        System.out.format("Your new balance is Rs. %.2f\n", balance);
        displayUserMenu();
    }
    void calcCharge() {
        if(distance <= 5.0f) {
            charge = 25.0f * distance;
        } else {
            charge = 125.0f + (distance - 5.0f) * 35.0f;
        }
        charge += (surchargeRate / 100.0f) * charge;
    }
    void bookARide() {
        System.out.println("Thank you for choosing our service.");
        System.out.println("Enter the distance to travel in kms:");
        distance = sc.nextFloat();
        sc.nextLine();
        calcCharge();
        System.out.format("The charge for your ride including surcharge of %.1f%% is Rs. %.2f\n", surchargeRate, charge);
        if (charge > balance) {
            System.out.println("This ride cannot be booked as you have insufficient account balance.");
            checkBalance();
        }
        balance -= charge;
        System.out.println("Ride successfully booked. Enjoy your ride!");
        checkBalance();
    }
}

class MainClassTaxi {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int i, userChoice = 0;
        String username, password;

        TaxiCustomer[] userList = new TaxiCustomer[3];
        userList[0] = new TaxiCustomer("Aahish");
        userList[0].setBalance(1000.0f);
        userList[0].setPassword("Aahish123");
        userList[1] = new TaxiCustomer("Hardik");
        userList[1].setBalance(2000.0f);
        userList[1].setPassword("hardik456");

        do {
            System.out.println("\n-------------------------MAIN MENU-------------------------\n");
            System.out.println("1 - Login to your account");
            System.out.println("2 - Exit the program");
            System.out.println("Enter your choice:");
            userChoice = sc2.nextInt();
            sc2.nextLine();
            switch(userChoice) {
                case 0:	System.out.println("Exiting program...");
                    break;
                case 1:	System.out.println("Enter username:");
                    username = sc2.nextLine();
                    for(i = 0; i < userList.length; i++) {
                        if ( !(username.equals(userList[i].username)) ) continue;
                        System.out.println("Enter password:");
                        password = sc2.nextLine();
                        if( !(password.equals(userList[i].getPassword())) ) {
                            System.out.println("Incorrect password.");
                            break;
                        }
                        userList[i].displayUserMenu();
                        break;
                    }
                    if(i == userList.length) {
                        System.out.println("No such user exists.");
                    }
                    break;
                default: System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while(userChoice != 0);
        sc2.close();
    }
}