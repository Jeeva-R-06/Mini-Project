import java.util.Scanner;

public class CoffeeOrderingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("\u263A Welcome to Coffee Cafe! \u2615");
        System.out.println("*****************************\n");
        System.out.println("Choose your coffee: ");
        System.out.println("1. Espresso - \u20B9200");
        System.out.println("2. Cappuccino - \u20B9250");
        System.out.println("3. Latte - \u20B9300");
        System.out.println("Enter your choice: ");
        byte choice = scanner.nextByte();
        int bill = 0;

        switch(choice) {
            case 1: bill+=200; break;
            case 2: bill+=250; break;
            case 3: bill+=300; break;
            default: System.out.println("Invalid Coffee choice"); break;
        }
        if(bill>0) {
            System.out.println("Add whipped cream for \u20B930 (yes=1 / no=0)");
            byte whippedchoice = scanner.nextByte();

            if (whippedchoice== 1) {
                bill += 30;
            }

            System.out.println("Add a flavour shot?(Vannila for \u20B920 or Hazelnut for \u20B925 (yes=1 / no=0)");
            byte flavour = scanner.nextByte();
            if (flavour == 1) {
                System.out.println("Which One? Enter 1 for Vannila(\u20B920) & 2 for Hazelnut(\u20B925)");
                byte flavourchoice = scanner.nextByte();
                switch(flavourchoice) {
                    case 1: bill+=20; break;
                    case 2: bill+=25; break;
                    default: System.out.println("Invalid Flavour Choice"); break;
                }
            }
            System.out.println("Total bill: \u20B9" + bill);
        }
    }
}
