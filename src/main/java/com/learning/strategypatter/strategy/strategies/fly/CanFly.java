/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learning.strategypatter.strategy.strategies.fly;

import com.learning.strategypatter.strategy.FlyStrategy;

/**
 *
 * @author Deivi
 */
public class CanFly implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
    
}
