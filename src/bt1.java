public static void main(String[] args) {
        Person person1 = new Person();
        person1.namsinh = 2004;
        int tuoi = person1.PredictAge();
        System.out.printf("So tuoi la %d", tuoi);
}
