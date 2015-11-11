/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DivConqPackage;

import ProblemPackage.FiboProblem;
import SolutionPackage.FiboSolution;

/**
 * 
 * @author Sergio Martín Santana <sergio.ms.91@gmail.com>
 */
public class Main {
    public static void main(String a[])
    {
        FiboDivConq fdc = new FiboDivConq();
        FiboProblem fp = new FiboProblem();
        fp.setProblem(3);
        FiboSolution fs = new FiboSolution();
        fs = ((FiboSolution)fdc.solve(fp));
        System.out.println("Solucion: "+fs.getSolution());
    }
        

}
