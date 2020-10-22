/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learning.strategypatter.strategy.strategies.makesound;

import com.learning.strategypatter.strategy.MakeSoundStrategy;

/**
 *
 * @author Deivi
 */
public class Scream implements MakeSoundStrategy {

    @Override
    public void makeSound() {
        System.out.println("Screaming...");
    }
    
}
