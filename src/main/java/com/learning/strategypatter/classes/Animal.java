/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learning.strategypatter.classes;

import com.learning.strategypatter.strategy.FlyStrategy;
import com.learning.strategypatter.strategy.MakeSoundStrategy;
import com.learning.strategypatter.strategy.MoveStrategy;

/**
 *
 * @author Deivi
 */
public class Animal {
    
    private final MoveStrategy moveStrategy;
    private final MakeSoundStrategy makeSoundStrategy;
    private final FlyStrategy flyStrategy;

    public Animal(MoveStrategy moveStrategy, MakeSoundStrategy makeSoundStrategy, FlyStrategy flyStrategy) {
        this.moveStrategy = moveStrategy;
        this.makeSoundStrategy = makeSoundStrategy;
        this.flyStrategy = flyStrategy;
    }

    public void move() {
        this.moveStrategy.move();
    }
    
    public void makeSound() {
        this.makeSoundStrategy.makeSound();
    }
    
    public void fly() {
        this.flyStrategy.fly();
    }
}
