class Main{
    public static void main(String args[]){
        Coffee coffee1  = new SimpleCoffee();//Base Coffee , 5
        Coffee coffee = new SugarDecorator(coffee1); // Base Coffee sugar , 7+5
        coffee = new MilkDecorator(coffee);// Base Coffee sugar milk , 7+5+10
        coffee = new MilkDecorator(coffee);
        Coffee coffee2 = new MilkDecorator(coffee1); //Base Coffee milk , 5+10
        System.out.println(coffee1.getDescription()); // Base Coffee
        System.out.println(coffee1.getCost()); // 5
        System.out.println(coffee.getDescription()); //Base Coffee sugar milk
        System.out.println(coffee.getCost()); // 7+5+10 == 22
        System.out.println(coffee2.getDescription()); //Base Coffee milk
        System.out.println(coffee2.getCost()); // 15
    }
}

//https://meet.google.com/ugb-uzdf-orx