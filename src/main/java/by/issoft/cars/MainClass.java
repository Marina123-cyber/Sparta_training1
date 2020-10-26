package by.issoft.cars;

public class MainClass {
    public static void main(String[] args) {
        Car car = new Car(50);

        System.out.println(car.getLiters());

        System.out.println("*******************");

        TrackCar truckCar = new TrackCar(98);
        System.out.println(car.getLiters());
        //truckCar.setLiters(100);
       // truckCar.goToCity("Leozno");
        //System.out.println("Truck capacity is " + truckCar.getWeightCapacity());
    }
}
