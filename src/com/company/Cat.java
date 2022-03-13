package com.company;

public class Cat {
    private String type;
    private String color;
    private int Lifespan;

    public void setType(String catType){
        type=catType;
    }
    public String getType(){
        return type;
    }
    public void setColor(String catColor){
        color=catColor;
    }
    public String getColor(){
        return color;
    }
    public void setLifespan(int catWeight){
        Lifespan =catWeight;
    }
    public int getLifespan(){
        return Lifespan;
    }

}
