interface Coffee {
    String getDescription();
    double getCost();
}

class SimpleCoffee implements Coffee(){
    public String getDescription(){
        return "Simple Coffee.."
    }
    public double getCost(){
        return 5.0;
    }
}

class CoffeeDecorator implements Coffee(){
    private Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    public String getDescription(){
        return coffee.getDescription();
    }

    public double getCost(){
        return coffee.getCost();
    }
}

class MilkDecoratoor implements CoffeeDecorator(){
    
}