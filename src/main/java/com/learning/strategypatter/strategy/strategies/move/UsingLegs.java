/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learning.strategypatter.strategy.strategies.move;

import com.learning.strategypatter.strategy.MoveStrategy;

/**
 *
 * @author Deivi
 */
public class UsingLegs implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("Moving using legs...");
    }
    
}
