package hoc;

public class App{
    public static void main(String[] args) {
        Check check1 = new Check();
        check1.checkPass(10);

        int a = 6;
        int b = 7;
        sosanh test = new sosanh();
        test.sosanh1(a, b);

        // Scanner scr = new Scanner(System.in);
        // System.out.println("moi nhap thu: ");
        // String dayInWeek = scr.next();
        // switch (dayInWeek){
        //     case "Hai":
        //     case "Ba":
        //     case "Bốn":
        //     case "Năm":
        //     case "Sáu":
        //     System.out.println("Đây là ngày trong tuần");
        //     break;
        //     case "Bảy":
        //     case "Chủ Nhật":
        //     System.out.println("Đây là ngày cuối tuần");
        //     break;
        //     default:
        //     System.out.println("Nhập sai chính tả");
        //     break;
        // }
       
        n1 n1_n = new n1();
        n1_n.n1_1(4);

        //convert day hour bai 4
        ConvertDayHourToMin convert = new ConvertDayHourToMin();
        a = convert.convertDayToMin(5);
        b = convert.convertHourToMin(6);
        System.out.printf(" 5 gio doi thanh %d phut%n",a);
        System.out.printf("6 gio doi thanh %d phut",b);
        
         
        


    }
}