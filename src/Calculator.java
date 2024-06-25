public class Calculator {
    //(bai2) có xem gpt hướng dẫn
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
  
//(bai3) chưa biết làm, xem gpt nhưng ko hiểu
    public static void primeFactors(int number) {
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2)//không hiểu đoạn này 
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

}
