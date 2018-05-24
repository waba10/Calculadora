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
public class Suma implements Aritmetica {
     @Override
    public double efectuar(double n1, double n2) {
        double sum=0;
        sum=n1+n2;
        return sum;
    }
}
