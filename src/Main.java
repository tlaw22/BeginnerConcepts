import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running prompts to collect varriables");
        System.out.println(isSameNum(8, 15));
        // Insert prompts to prompt the user to enter 2 integer variables.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for variable 1: ");
        int variable1Name = scanner.nextInt();
        System.out.println("Enter the number for variable 2: ");
        int variable2Number = scanner.nextInt();
        int sum = (variable1Name + variable2Number);
        System.out.println("The sum of " + variable1Name + " and " + variable2Number + " is " + String.valueOf(sum));
        System.out.println("Enter the WORD for variable 3: ");
        int words = scanner.nextInt();

        System.out.print(Looper(String.valueOf(words)));
    }
/*
Begin
    functions are ways of calculating entire methods or routines
    public static boolean FunctionName(int PassIntiger, int PassString, boolen TrueFalsePass) {
        return x==y?true:false;
    }

    To call the function from within the main method, class or even in-line.
    FunctionName(5, "words", True);

 */

// Write a function that compares two numbers and checks true/false

    public static boolean isSameNum(int x, int y) {
        return x==y?true:false;
    }
    public static boolean isGreater(int x, int y) {
        return x==y?true:false;
    }
    // Write a for loop for 15 cycles
    public static String Looper(String words) {
        for (int i = 0; i < 15; i++) {
            words = words + " ";
        }
        return words;
    }
    // Create a while loop and loop through it 15 times.
    public String WhileLoop(String x) {
        int i = 0;
        while (i < 15) {
            System.out.println(x);
            i++;
        }
        return x;
    }
}