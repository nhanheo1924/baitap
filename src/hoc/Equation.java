package hoc;
public class Equation {
    public void Equation(int a,int b,int c){
        System.out.printf("phuong trinh co dang: %dx2 + %dx + %d%n",a,b,c);
        double delta =(b*b)-(4*a*c);
        if (a == 0)
        {
            if (b == 0) 
            {
                if (c==0)
                {
                    System.out.println("phuong trinh co vo so nghiem");
                }
                else
                { 
                    System.out.println("phuong trinh vo nghiem");
                }
            }  
            else
            {
                double a1 = (-b/a);
                System.out.println("phuong trinh co mot nghiem duy nhat : " + a1 );
            }
        }  
        else
        {
            if(delta < 0){
            System.out.println("phuong trinh vo nghien");
            }
            else if(delta == 0){
            System.out.println("phuong trinh co mot nghiem kep: "+ -b/2*a);
            }
            else if(delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("phuong trinh có 2 nghiem%n x1 = %f %n x2 = %f",x1,x2);
            }
        }
    }       
}
    