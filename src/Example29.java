import java.util.Scanner;
public class Example29 {
    public static void main(String[] args) {
        int number;
        int number2;
        System.out.println("Type the first number:  ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        number = inputValue.nextInt();
        System.out.println("Type the second number:  ");
        Scanner inputValue2;
        inputValue2 = new Scanner(System.in);
        number2 = inputValue2.nextInt();
        while (number >= number2) {
            number = number- number2;
        }
        System.out.println("The rest is" +  " " + number);
    }
}






























