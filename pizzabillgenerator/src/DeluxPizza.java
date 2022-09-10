public class DeluxPizza extends pizza{

    public DeluxPizza(Boolean Veg){
        super(true);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraToppings() {}
}
