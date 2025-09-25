import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Calculator calc_add = new Calculator();

        calc_add.setNumbers(num1, num2);
        calc_add.divide();
        calc_add.displayResult("+");

        Calculator calc_sub = new Calculator();
        calc_sub.setNumbers(num1, num2);
        calc_sub.divide();
        calc_sub.displayResult("-");
    }
}