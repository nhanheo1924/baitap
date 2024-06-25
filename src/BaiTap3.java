import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        //bai 2
        Calculator calculator = new Calculator();
        int sumOfProduct = calculator.calculateSumOfProduct(2);
        System.out.printf("Tong cua tich la %d%n", sumOfProduct);
        //bai3
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap mọt so nguyen duong: ");
        int number = scanner.nextInt();
        System.out.print("cac thua so nguyen to " + number + " la: ");
        calculator.primeFactors(number);
        System.out.println();
        //bai1
        int sum = calculator.calculateSum();
        System.out.print("tong la: " + sum);

        
    }
}

