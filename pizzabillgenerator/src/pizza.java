public class pizza {

    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPack = 20;
    private int basePizzaPrice;

    private Boolean isExtraCheeseAdded = false;
    private Boolean isToppingsAdded = false;
    private Boolean optedForTakeAway = false;

    public pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;

       this.price += extraCheesePrice;


    }

    public void addExtraToppings(){
        isToppingsAdded = true;

      this.price += extraToppingsPrice;
    }

    public void takeAway(){
        optedForTakeAway = true;

      this.price += backPack;
    }

    public void getBill(){
        String bill = "";
      System.out.println("Base Pizza: " + basePizzaPrice);
      if(isExtraCheeseAdded){
          bill += "Extra Cheese Added : " + extraCheesePrice + "\n";
      }
      if(isToppingsAdded){
          bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
      }
      if(optedForTakeAway){
          bill += "Opted For Takeaway: " + backPack + "\n";
      }

      bill += "Total Bill: " + this.price + "\n";
      System.out.println(bill);

    }
}
