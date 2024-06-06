public class Equation {
    public void Equation(int a,int b,int c){
        System.out.printf("phuong trinh co dang: %dx2 + %dx + %d%n",a,b,c);
        double delta =(b*b)-(4*a*c);
        if (a == 0 && b ==0)
        {
            System.out.println("phuong trinh vo nghiem");
        }
        else if(a == 0){
            System.out.println("phuong trinh co mot nghiem duy nhat: "+ -c/b);
        }
        
        else if(delta < 0){
            System.out.println("phuong trinh vo nghien");
        }
        else if(delta == 0){
            System.out.println("phuong trinh co mot nghiem kep: "+ -b/2*a);
        }
        else if(delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("phuong trinh có 2 nghiem, x1 = %f , x2 = %f",x1,x2);
        }

    }
}
