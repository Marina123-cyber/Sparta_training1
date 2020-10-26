package by.issoft.cars;

public class TrackCar extends Car {
private int weightCapacity = 23;

    public TrackCar(int liters) {
        super(liters);
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }
}
