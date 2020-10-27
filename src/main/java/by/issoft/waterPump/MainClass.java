package by.issoft.waterPump;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

Garden garden = new Garden();
Farm farm = new Farm();
House house = new House();

garden.addTrees();

List<WaterConsumers> consList = Arrays.asList(garden, farm, house);
for(WaterConsumers i: consList){
    i.calculateWater();
}


    }