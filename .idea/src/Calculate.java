import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: " + scanner);
        double firstNumber = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите знак" + scanner1);
        String mark = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе число: " + scanner2);
        double secondNumber = scanner2.nextDouble();
        switch(mark){
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
        }

    }
}