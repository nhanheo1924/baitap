import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        //bai 2
        Calculator calculator = new Calculator();
        int sumOfProduct = calculator.calculateSumOfProduct(2);
        System.out.printf("Tong cua tich la %d%n", sumOfProduct);
        //bai3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();
        System.out.print("Các thừa số nguyên tố của " + number + " là: ");
        calculator.primeFactors(number);
    }
}
