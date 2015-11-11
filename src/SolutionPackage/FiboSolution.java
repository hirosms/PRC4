/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SolutionPackage;

import ProblemPackage.Problem;

/**
 * 
 * @author Sergio Martín Santana <sergio.ms.91@gmail.com>
 */
public class FiboSolution implements Solution {
    
    int s;

    @Override
    public int getSolution() {
        return s;
    }

    @Override
    public void setSolution(int a) {
        s = a;
    }
    

}
