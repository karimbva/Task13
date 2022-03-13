package com.company;

public class Main {

    public static void main(String[] args) {
        fish();
        parrot();
        cat();
        dog();
    }
    static void fish(){
        Fish fish=new Fish();
        fish.setType("Blue Whale");
        fish.setColor("Blue");
        fish.setWeight(50000);
        System.out.println("Type of fish is : "+fish.getType()+",  Color of the fish is: "+fish.getColor()+",   Weight of fish is: "+fish.getWeight()+"KG" );
    }
    static void parrot() {
        Parrot parrot = new Parrot();
        parrot.setType("Black Palm Cockatoo");
        parrot.setColor("Black");
        parrot.setWeight(500);
        System.out.println("Type of parrot is : " + parrot.getType() + ",  Color of the parrot is: " + parrot.getColor() + ",   Weight of parrot is: " + parrot.getWeight() + "gram");
    }
    static void cat(){
        Cat cat=new Cat();
        cat.setType("Maine Coon");
        cat.setColor("Grey");
        cat.setLifespan(15);
        System.out.println("Type of cat is : " + cat.getType() + ",  Color of the cat is: " + cat.getColor() + ",   Lifespan of cat is: " + cat.getLifespan() + " years");
    }
    static void dog(){
        Dog dog=new Dog();
        dog.setType("German Shepherd");
        dog.setColor("Black and tan");
        dog.setLifespan(13);
        System.out.println("Type of dog is : " + dog.getType() + ",  Color of the dog is: " + dog.getColor() + ",   Lifespan of dog is: " + dog.getLifespan() + " years");

    }
}
