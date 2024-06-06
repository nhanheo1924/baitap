





public class ExcerciseDay3 {
    static void main(String[] args)
    {
        //bai1
        CheckYear checkYear = new CheckYear();
        checkYear.checkYear1(2024);
        checkYear.checkYear1(1000);
        checkYear.checkYear1(2013);
        //bai2
        Calculator calculator = new Calculator();
        calculator.CalculatorInterger("+",4,5);
        calculator.CalculatorInterger("-", 9, 6);
        calculator.CalculatorInterger("*", 8, 3);
        calculator.CalculatorInterger("/", 27, 3);
        //bai3/1
        MaxInterger maxInterger1 = new MaxInterger();
        maxInterger1.maxInterger(3,6, 9);
        maxInterger1.maxInterger(20,5, 10000);
        //bai3/2
        // int max = maxInterger1.FindMaxInterger();
        // System.out.printf("%d la so lon nhat%n",max);
        //bai4
        Equation calculate = new Equation();
        calculate.Equation(1,-5,6);







    }
    
}
