public class PepperoniDecorator implements Pizza {
    private Pizza pizza;
    
    public PepperoniDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
    
    public String getDescription() {
        return pizza.getDescription() + ", pepperoni";
    }
}