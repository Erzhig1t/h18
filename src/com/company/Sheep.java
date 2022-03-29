package com.company;

public class Sheep extends Pet{

    public Sheep(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public String getNickName() {
        return super.getNickName();
    }

    @Override
    public void setNickName(String nickName) {
        super.setNickName(nickName);
    }

    @Override
    public String toString() {
        return "Sheep weight is:" + getWeight()+ ", Sheep age is: "+ getAge()+ ", Sheep gender is: "
                + getGender()+", Sheep nick name is: "+ getNickName();
    }
}

