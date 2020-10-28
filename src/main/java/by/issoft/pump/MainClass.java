package by.issoft.pump;




import java.util.*;


public class MainClass {


    public static void main(String[] args) {

        List<Household> households = new ArrayList<>();

        List<WaterConsumers> gardenLevel = (List<WaterConsumers>) Arrays.asList(
                new WaterConsumers("tomatoe", "plant"),
                new WaterConsumers("apple", "plant")
        );
        Household garden = new Household("flowerGarden");
        garden.addConsumers(gardenLevel);
        households.add(garden);


        List<WaterConsumers> farmLevel = (List<WaterConsumers>) Arrays.asList(
                new WaterConsumers("cow", "animal"),
                new WaterConsumers("rabbit", "animal")
        );
        Household farm = new Household("animalFarm");
        farm.addConsumers(farmLevel);
        households.add(farm);

        int totalWater = 0;

        for (Household h : households) {
            totalWater += h.getWater();
        }
        System.out.println("To supply the household you need " + totalWater + " of water");
    }
}
