package hoc;
public class Calculator {
    static void CalculatorInterger(String operation,int a,int b){
        switch (operation) {
            case "+":
                System.out.printf("%d + %d = %d%n",a,b,a+b);
                break;
            case "-":
                System.out.printf("%d - %d = %d%n",a,b,a-b);
                break;
            case "*":
                System.out.printf("%d * %d = %d%n",a,b,a*b);
                break;
            case "/":
            {
                if ( b == 0)
            {
                System.out.println("khong the chia");
            }
            else
                System.out.printf("%d / %d = %d%n",a,b,a/b);
            }
            break;
            default:
                System.out.println("nhan buon ma co tinh nhap sai la bi can do");
                break;
        }
    }
    
}
