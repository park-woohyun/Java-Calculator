import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Calculator calc_add = new Calculator();

        calc_add.setNumbers(num1, num2);
        calc_add.add();
        calc_add.displayResult("+");

        Calculator calc_sub = new Calculator();
        calc_sub.setNumbers(num1, num2);
        calc_sub.subtract();
        calc_sub.displayResult("-");

        Calculator calc_mul = new Calculator();
        calc_mul.setNumbers(num1, num2);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        Calculator calc_div = new Calculator();
        calc_div.setNumbers(num1, num2);
        calc_div.divide();
        calc_div.displayResult("/");
    }
}