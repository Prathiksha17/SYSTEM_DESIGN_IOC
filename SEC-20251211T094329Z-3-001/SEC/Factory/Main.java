class Main{
    public static void main(String [] args){
        CarFactory factory = new CarFactory();
        Car bmw = factory.getCar(CarType.BMW);
        Car thar = factory.getCar(CarType.Thar);
        Car audi = factory.getCar(CarType.Audi);
        bmw.drive();
        thar.drive();
        // audi.drive();
    }
}