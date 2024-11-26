package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Car camryCar = new Car(10001,30,4);

        ElectricMotorcycle teslaMotorcyle = new ElectricMotorcycle(10002,100);

        System.out.println(camryCar.calculateTotalPrice(2));



        System.out.println(teslaMotorcyle.calculateTotalPrice(2));


        String myName = null;


        Car[] myArr = new Car[5];

        System.out.println(Arrays.toString(myArr));


    }
}
