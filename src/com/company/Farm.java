package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    Cow[] cows;
    Sheep[] sheep;
    Horse[] horses;

    public Farm(String address, String ownerName, Cow[] cows, Sheep[] sheep, Horse[] horses) {
        super();
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;

    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                ", Farm address: " + address + '\'' +
                ", OwnerName is:'" + ownerName + '\'' +
                ", Farm cows are: " + Arrays.toString(cows) +
                ", Farm sheep are: " + Arrays.toString(sheep) +
                ", Farm horses are: " + Arrays.toString(horses) +
                '}';
    }
}


