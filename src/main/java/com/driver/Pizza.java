package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int finalBill;
    boolean flag;
    boolean checkForBag;
    boolean checkForCheese;
    boolean checkForTopping;
    int bagPrice;
    int ExtraCheeseAmount;
    int ExtraToppingAmount;
//Veg pizza base price = 300
//Non-veg pizza base price = 400
//Extra Cheese Price = 80
//Extra Toppings For Veg Pizza = 70
//Extra Toppings For Non-veg Pizza = 120
//Paper bag Price = 20
    public Pizza(Boolean isVeg){
        this.checkForBag=true;
        this.checkForCheese=true;
        this.checkForTopping=true;
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){
        if(isVeg==true){
            this.price=300;
            return this.price;
        }else{
            this.price=400;
            return this.price;
        }

    }


    public void addExtraCheese(){
        if(checkForCheese==true) {
            this.ExtraCheeseAmount = 80;
            this.finalBill = getPrice() + this.ExtraCheeseAmount;
            this.flag = true;
            this.checkForCheese=false;
        }
    }

    public void addExtraToppings() {;
        if (checkForTopping == true) {
            if (this.flag == true) {
                if (isVeg == true) {
                    this.ExtraToppingAmount = 70;
                    this.finalBill = this.finalBill + this.ExtraToppingAmount;
                } else {
                    this.ExtraToppingAmount = 120;
                    this.finalBill = this.finalBill + this.ExtraToppingAmount;
                }
            }
           this.checkForTopping=false;
        }
    }

    public void addTakeaway() {
        if (checkForBag == true) {
            this.bagPrice=20;
            this.finalBill = this.finalBill + this.bagPrice;
            this.checkForBag=false;
        }
    }
    public String getBill(){

        this.bill = String.valueOf(this.finalBill);
        System.out.println("Base Price Of The Pizza: "+this.price);
        System.out.println("Extra Cheese Added: "+ this.ExtraCheeseAmount);
        System.out.println("Extra Toppings Added: "+ this.ExtraToppingAmount);
        System.out.println("Paperbag Added: "+this.bagPrice);
        return this.bill;
    }
}
