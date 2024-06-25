package new1;

import java.util.Scanner;

public class lap {
    static void main(String[] args){
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d. nhanheosocute %n",i);            
        }
        System.out.println("Perfect :)");
        int x = 0;
        while (x < 10){
            if (x % 2 == 0)
            {
            System.out.println("Hello fen");
            }
            x++;



            int c = 1;
            Scanner scnn1 = new Scanner(System.in);
            System.out.println("Enter a character: ");
            String input = scnn1.next();
    
            while (input.equals("y")) {
                System.out.println("Hello World");
                System.out.println("Enter a character: ");
                input = scnn1.next();

        
        }
     
        
    }
}
}