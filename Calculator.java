import java.util.Scanner;

public class Calculator {
    
    // Add numbers
    public int addNumbers(int number_1, int number_2){
        int sumOfNumbers = number_1 + number_2;
        return sumOfNumbers;
    }

    // Subtract numbers
    public int diffNumbers(int number_1, int number_2){
        int diffOfNumbers = number_1 - number_2;
        return diffOfNumbers;
    }

    // Multiply numbers
    public int prodNumbers(int number_1, int number_2){
        int prodOfNumbers = number_1 * number_2;
        return prodOfNumbers;
    }

    // Divide numbers
    public int quoNumbers(int number1, int number_2){
        int quoOfNumbers = number1 / number_2;
        return quoOfNumbers;
    }

    public static void main(String[] args){
        // Calculator menu
        Scanner get_input = new Scanner(System.in);
        Scanner numbers = new Scanner(System.in);
        Calculator calculate = new Calculator();

        System.out.println("Calculator version 0.1");
        System.out.println("- - - - - - - - - - - -");
        System.out.println("1. Add numbers");
        System.out.println("2. Sub numbers");
        System.out.println("3. Multiply numbers");
        System.out.println("4. Divide numbers");
        System.out.print(" ");
        System.out.println("Enter a corresponding number for an operation! ");

        String user_input = get_input.nextLine();
        System.out.println("Enter a number: ");
        int num1 = numbers.nextInt();
        System.out.println("Enter another number");
        int num2 = get_input.nextInt();

        switch (user_input){
            case "1":
                System.out.print("The sum is ");
                System.out.println(calculate.addNumbers(num1, num2));
                break;

            case "2":
                System.out.print("The difference is ");
                System.out.println(calculate.diffNumbers(num1, num2));
                break;

            case "3":
                System.out.print("The product is ");
                System.out.println(calculate.prodNumbers(num1, num2));
                break;

            case "4":
                System.out.print("The quotient is ");
                System.out.println(calculate.quoNumbers(num1, num2));
                break;
        }

    }
}
