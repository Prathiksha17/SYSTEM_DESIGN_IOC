class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }
    public String getDescription(){
        return coffee.getDescription() + " Sugar";
    }
    public int getCost(){
        return coffee.getCost() + 7;
    }
}