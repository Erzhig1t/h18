package com.company;

public class Cow extends Pet{


    public Cow(int weight, int age, String gender, String nickName) {
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
        return "Cow weight is: " + getWeight()+ ", Cow age is: "+ getAge()+ ", Cow gender is: "
                +getGender()+ ", Cow nick name is: " + getNickName();
    }
}


