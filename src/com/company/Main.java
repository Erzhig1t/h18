package com.company;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Cow cow1 = new Cow(200, 3, "Male", "Krasavchik");
        Cow cow2 = new Cow(250, 4, "Female", "Milk maker");
        Cow cow3 = new Cow(300, 5, "Male", "Raketa");
        Cow cow4 = new Cow(240, 3, "Female", "Power");
        Cow cow5 = new Cow(200, 2, "Female", "krasavitsa");
        Cow cow6 = new Cow(150, 2, "Male", "Mini krasavchik");

        Sheep sheep1 = new Sheep(30, 2, "Female", "kukla");
        Sheep sheep2 = new Sheep(50, 3, "Male", "Kochkor");
        Sheep sheep3 = new Sheep(60, 4, "Male", "Buldozer");
        Sheep sheep4 = new Sheep(45, 3, "Female", "Helicopter");
        Sheep sheep5 = new Sheep(34, 2, "Male", "Mini kochkor");

        Horse horse1 = new Horse(350, 3, "Male", "Akkula");
        Horse horse2 = new Horse(400, 4, "Male", "Tulpar");
        Horse horse3 = new Horse(380, 5, "Male", "Rocket");

        Farm farm1 = new Farm("Kurenkeev street, 23", "Akylbek Japarov",
                new Cow[]{cow1, cow2, cow3, cow4, cow5}, new Sheep[]{sheep1, sheep2, sheep3}, new Horse[]{horse1, horse2});
        System.out.println("Farm1 address is: " + farm1.getAddress());
        System.out.println("Farm1 owner name is: " + farm1.getOwnerName());
        System.out.println("Farm1 cows are: " + "\n" + Arrays.toString(farm1.cows));
        System.out.println("Farm1 sheep are: " + "\n" + Arrays.toString(farm1.sheep));
        System.out.println("Farm1 horses are: " + "\n" + Arrays.toString(farm1.horses));

        Farm farm2 = new Farm("Toktogul, 45", "Sadyr Japarov",
                new Cow[]{cow6}, new Sheep[]{sheep3}, new Horse[]{horse2});
        System.out.println("\nFarm2 address is: " + farm2.getAddress());
        System.out.println("Farm2 owner name is: " + farm2.getOwnerName());
        System.out.println("Farm2 cows are: " + "\n" + Arrays.toString(farm2.cows));
        System.out.println("Farm2 sheep are: " + "\n" + Arrays.toString(farm2.sheep));
        System.out.println("Farm2 horses are: " + "\n" + Arrays.toString(farm2.horses));
    }

}

















