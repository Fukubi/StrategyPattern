package com.learning.strategypatter;

import com.learning.strategypatter.classes.Animal;
import com.learning.strategypatter.strategy.strategies.fly.CanFly;
import com.learning.strategypatter.strategy.strategies.fly.CantFly;
import com.learning.strategypatter.strategy.strategies.makesound.Growl;
import com.learning.strategypatter.strategy.strategies.makesound.Hiss;
import com.learning.strategypatter.strategy.strategies.makesound.Scream;
import com.learning.strategypatter.strategy.strategies.move.Crawling;
import com.learning.strategypatter.strategy.strategies.move.UsingLegs;


public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(new UsingLegs(), new Growl(), new CantFly());
        Animal snake = new Animal(new Crawling(), new Hiss(), new CantFly());
        Animal eagle = new Animal(new UsingLegs(), new Scream(), new CanFly());
        
        dog.move();
        dog.makeSound();
        dog.fly();
        
        snake.move();
        snake.makeSound();
        snake.fly();
        
        eagle.move();
        eagle.makeSound();
        eagle.fly();
    }
}
