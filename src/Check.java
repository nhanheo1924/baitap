

public class Check {
    public void checkPass(double mark){
        if (mark < 5 ){
        System.out.print("2 trieu");
        }
        else if(mark<8 && mark >=5){
            System.out.print("Pass");
        }
        else if(mark<10 && mark >= 8) {
            System.out.print("Me rit");
        }
        else if(mark == 10){
            System.out.print("500k");  
        }
        else {
            System.out.print("sai tham so");
        }
        System.out.println("");
        }
    }

