
import java.util.Scanner;



public class MaxInterger {
    static void maxInterger(int num1,int num2,int num3){
        if (num1 > num2 && num1 > num3 ){
            System.out.printf("%d la so lon nhat%n",num1);
            }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.printf("%d la so lon nhat%n",num2);
        }
        else{
            System.out.printf("%d la so lon nhat%n",num3);
        }

    }
    public int FindMaxInterger(){
        Scanner scrn1 = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number1 = scrn1.nextInt();
        System.out.println("Please enter number: ");
        int number2 = scrn1.nextInt();
        System.out.println("Please enter number: ");
        int number3 = scrn1.nextInt();
        int max = number1;
        if(number2 > max){
             max = number2;
        }
        if (number3 > max){
            max = number3;
        }
        return max;
        


    }
    }
