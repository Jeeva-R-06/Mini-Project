import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("*****************************");
            System.out.println("Welcome to my Calculator! \uD83E\uDDEE");
            System.out.println("*****************************");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulas Division\n6. Exit");
            System.out.print("Enter the choice that you want to perform: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter two numbers: ");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println("The Addition of "+num1+" and "+num2+" is:"+(num1+num2));
                    break;
                case 2:
                    System.out.println("Enter two numbers: ");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    System.out.println("The Subtraction of "+num1+" and "+num2+" is:"+(num1-num2));
                    break;
                case 3:
                    System.out.println("Enter two numbers: ");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    System.out.println("The Multiplication of "+num1+" and "+num2+" is:"+(num1*num2));
                    break;
                case 4:
                    System.out.println("Enter two numbers: ");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    if(num2==0){
                        System.out.println("Dividing by zero is undefined");
                    } else {
                        System.out.println("The Division of " + num1 + " and " + num2 + " is:" + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Enter two numbers: ");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    System.out.println("The Modulas Division of "+num1+" and "+num2+" is:"+(num1%num2));
                    break;
                case 6:
                    System.out.println("Exiting the Calculator.....");
                    break;
                default:
                    System.out.println("Invalid Choice. Try Again...!");
            }
        }while(choice != 6);
    }
}
