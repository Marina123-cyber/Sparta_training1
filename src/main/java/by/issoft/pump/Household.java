package by.issoft.pump;


import java.util.*;

public class Household {

    //String name;

    String name;
    //  List<Integer> liters;
    List<WaterConsumers> wConsumers;

    public Household(String name) {
        this.name = name;

    }

    public void addConsumers(List<WaterConsumers> wConsumers) {
        this.wConsumers = wConsumers;
    }


    public int getWater() {

            int bucket = 0;

            for (WaterConsumers c : wConsumers) {

                switch (c.type) {

                    case "plant": {
                        bucket += 68;
                        break;
                    }
                    case "animal": {
                        bucket += 37;
                        break;
                    }

                }
            }
            return bucket;
    }
}


