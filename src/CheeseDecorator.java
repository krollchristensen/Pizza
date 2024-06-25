public class CheeseDecorator implements Pizza {
    private Pizza pizza;
    
    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public double getCost() {
        return pizza.getCost() + 1.5;
    }
    
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }
}