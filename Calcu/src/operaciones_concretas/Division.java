/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_concretas;

/**
 *
 * @author LN710Q
 */
public class Division implements Aritmetica {
      @Override
    public double efectuar(double n1, double n2) {
        double div=0;
        div=n1/n2;
        return div;
    }
}
