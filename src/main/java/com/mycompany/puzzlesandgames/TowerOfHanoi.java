/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.puzzlesandgames;

/**
 *
 * @author Atikul
 */

import java.util.List;

/**
 * Recursive solution to the Tower of Hanoi puzzle.
 */
public final class TowerOfHanoi {

    private TowerOfHanoi() {
    }
    
    public static void shift(int n, String startPole, String intermediatePole, String endPole, List<String> result) {
        if (n < 0) {
            throw new IllegalArgumentException("Number of discs must be non-negative");
        }
        if (n == 0) {
            return;
        }
        
        // Step 1: Move n-1 discs from start to intermediate
        shift(n - 1, startPole, endPole, intermediatePole, result);
        
        // Step 2: Move the nth disc from start to end
        result.add(String.format("Move %d from %s to %s", n, startPole, endPole));
        
        // Step 3: Move n-1 discs from intermediate to end
        shift(n - 1, intermediatePole, startPole, endPole, result);
    }
}
