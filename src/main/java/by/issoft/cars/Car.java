package by.issoft.cars;

public class Car {
    protected int liters;
    public Car(int liters){
        //System.out.println("I am in constructor");
        this.liters = liters;
    }


    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public void goToCity(String city){
        System.out.println("I go to "+ city);
        liters -= city.length();
        int leftLiters = liters - city.length();
        System.out.println("Liters left: "+ liters);
    }
}
