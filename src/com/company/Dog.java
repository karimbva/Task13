package com.company;

public class Dog {
    private String type;
    private String color;
    private int Lifespan;

    public void setType(String dogType){
        type=dogType;
    }
    public String getType(){
        return type;
    }
    public void setColor(String dogColor){
        color=dogColor;
    }
    public String getColor(){
        return color;
    }
    public void setLifespan(int dogLifespan){
        Lifespan =dogLifespan;
    }
    public int getLifespan(){
        return Lifespan;
    }

}
