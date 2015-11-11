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
abstract public class DivConqTemplate {
    
    final public Solution solve(Problem p) {
        Problem[] pp;
        if (isSimple(p))
            return simplySolve(p);
        else 
            pp = decompose(p);
        Solution[] ss = new Solution[pp.length];
        for(int i = 0; i < pp.length; i++) {

            ss[i] = solve(pp[i]);
        } 
        return combine(p, ss);
    }
    abstract protected boolean isSimple (Problem p);
    abstract protected Solution simplySolve (Problem p);
    abstract protected Problem[] decompose (Problem p);
    abstract protected Solution combine(Problem p, Solution[] ss);
}
