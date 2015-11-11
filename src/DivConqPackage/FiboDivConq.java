/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DivConqPackage;

import ProblemPackage.*;
import SolutionPackage.*;

/**
 * 
 * @author Sergio Martín Santana <sergio.ms.91@gmail.com>
 */
public class FiboDivConq extends DivConqTemplate {
    
    @Override
    protected boolean isSimple(Problem p) {
        return ((FiboProblem)p).getProblem() == 1 || ((FiboProblem)p).getProblem() == 2;
    }

    @Override
    protected Solution simplySolve(Problem p) {
        Solution aux  = new FiboSolution();
        ((FiboSolution)aux).setSolution(1);
        return aux;
    }

    @Override
    protected Problem[] decompose(Problem p) {
        Problem [] aux = new Problem [2];
        aux[0]  = new FiboProblem();
        aux[1]  = new FiboProblem();
      //int a;
      //  a = ((FiboProblem)p).getProblem();
        ((FiboProblem)aux[0]).setProblem(((FiboProblem)p).getProblem()-1);
        ((FiboProblem)aux[1]).setProblem(((FiboProblem)p).getProblem()-2);
        //aux[1].setProblem(p.getProblem()-2);
        
        return aux;
    }

    @Override
    protected Solution combine(Problem p, Solution[] ss) {
        int ret = 0;
        Solution s = new FiboSolution();
        //((FiboProblem)p).getProblem();
        ret += ((FiboSolution)ss[0]).getSolution()+((FiboSolution)ss[1]).getSolution();
        ((FiboSolution)s).setSolution(ret);
        return s;
    }
}
