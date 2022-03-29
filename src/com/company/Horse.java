package com.company;

public class Horse extends Pet{

    public Horse(int weight, int age, String gender, String nickName) {
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
        return "Horse weight is: "+ getWeight()+ ", Horse age is: " + getAge()+ ", Horse gender is: "
                + ", Horse nick name is: "+ getNickName();
    }

}

