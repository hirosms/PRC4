package MainPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import DivConqPackage.*;
import ProblemPackage.*;
import SolutionPackage.*;

/**
 * 
 * @author Sergio Martín Santana <sergio.ms.91@gmail.com>
 */
public class Main {
    public static void main(String a[])
    {
        //Fibonacci
        
        FiboDivConq fdc = new FiboDivConq();
        FiboProblem fp = new FiboProblem();
        int n = 3;
        fp.setProblem(n);
        FiboSolution fs = new FiboSolution();
        fs = ((FiboSolution)fdc.solve(fp));
        
        System.out.println("Fibonacci");
        System.out.println("Valor: "+n);
        System.out.println("Solucion: "+fs.getSolution());
        
        //Factorial
        
        FactDivConq fdc_fac = new FactDivConq();
        FactProblem fp_fac = new FactProblem();
        int m = 3;
        fp_fac.setProblem(m);
        FactSolution fs_fac = new FactSolution();
        fs_fac = ((FactSolution)fdc_fac.solve(fp_fac));
        
        System.out.println("Factorial");
        System.out.println("Valor: "+m);
        System.out.println("Solucion: "+fs_fac.getSolution());
        
    }
        

}
