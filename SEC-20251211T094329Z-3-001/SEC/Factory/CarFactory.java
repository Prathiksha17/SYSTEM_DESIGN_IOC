class CarFactory{
    public static Car getCar(CarType typeOfCar){
        if(typeOfCar == CarType.BMW){
            return new BMW();
        }else if(typeOfCar ==CarType.Thar ){
            return new Thar();
        }else {
            System.out.println("this car can't be manufactured");
            return null;
        }
    } 
}