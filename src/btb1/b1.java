package btb1;

public class b1 {
    public static void main(String[]args) throws Exception {
        //bai 1
        Person person1 = new Person();
        person1.namsinh = 2004;
        int tuoi = person1.PredictAge();
        System.out.printf("So tuoi la %d%n", tuoi);
        //bai 2
        Circle circle = new Circle();
        circle.bankinh = 4;
        double chuvi = circle.Chuvi();
        System.out.printf("chu vi hinh tron la %f%n",chuvi);
        double dientich = circle.Dientich();
        System.err.printf("dien tich hinh tron la %f%n",dientich);
        //bai 3
        Car car = new Car();
        int beginspeed = 0;
        int carspeed1 = car.upTo20();
        System.out.printf("van toc ban dau %d km/h.%n",beginspeed);
        System.out.printf("van toc tang toc lan 1: %d km/h.%n",carspeed1);
        int carspeed2 = car.upTo40();
        System.out.printf("van toc tang toc lan 2: %d km/h%n",carspeed2);
        int carspeed3 = car.upTo60();
        System.out.printf("van toc tang toc lan 3: %d km/h%n",carspeed3);
        int carspeed4 = car.upTo80();
        System.out.printf("van toc tang toc lan 4: %d km/h%n",carspeed4);
        int carspeed5 = car.upTo100();
        System.out.printf("van toc toi da khi nhan phong len truong la: %d km/h%n",carspeed5+5);
        int tocdocaophim = car.upTospeedcaophimcuaheo();
        System.out.printf("toc do cao phim cua nhan la: %d tu/phut%n",tocdocaophim);
        String hana = car.upToNhanAbility();
        System.out.printf("kha nang chem gio chua nhan = %s muahahahah :))%n",hana);
        //bai4_chuyển h sang phút,ngày sang phút
       
        

        }
    }
    

