import java.util.Scanner;

public class Calculator {
    //(bai2)
    public int calculateSumOfProduct(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= i; j++) {
                a *= j;
            }
            sum += a;
        }
        return sum;
    }
  
    //(bai3)
    public static void primeFactors(int number) {
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2)
        {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        if (number > 2) {
            System.out.print(number);
        }
    }
    //bai3
    public int calculateSum() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Moi nhap vao so de tinh tong: , 'n' để kết thúc: ");
            String input = scanner.next();
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                if (input.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Nhap bat ky de tiep tuc chuong trinh, 'n' để kết thúc!!!");
                }
            }
        }
        return sum;
    }

}
