/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MiscPackage;

import java.util.ArrayList;

/**
 * 
 * @author Sergio Martín Santana <sergio.ms.91@gmail.com>
 */
public class Data_Random {
    
    ArrayList <Integer> data = new ArrayList();

    public Data_Random(int sz) {
        int i =0;
        while (i <= sz)
        {
            generar(sz);
            i++;
        }
    }
    
    public int Get_Rdm (int n)
    {
        return (int) Math.floor(Math.random()*(n-0+1)+0);
    }
    public int generar (int n)
    {
      int numero = Get_Rdm(n);//genero un numero
      if(data.isEmpty()){//si la lista esta vacia
        data.add(numero);
        return numero;
      }else{//si no esta vacia
        if(data.contains(numero)){//Si el numero que generé esta contenido en la lista
          return generar(n);//recursivamente lo mando a generar otra vez
        }else{//Si no esta contenido en la lista
          data.add(numero);
          return numero;
        }
      }
  } 

    public ArrayList<Integer> getData() {
        return data;
    }
    
    
    
}
