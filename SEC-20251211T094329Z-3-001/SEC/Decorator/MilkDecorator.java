class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    public String getDescription(){
        return coffee.getDescription() + " Milk";
    }
    public int getCost(){
        return coffee.getCost() + 10;
    }
}