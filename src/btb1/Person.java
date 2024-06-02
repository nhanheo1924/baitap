package btb1;

public class Person {
    public int namsinh;

    public int PredictAge(){
        int curent_year = 2024;
        return curent_year - namsinh;
    }
}
