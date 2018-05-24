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
public class resta implements Aritmetica {
      @Override
    public double efectuar(double n1, double n2) {
        double restar=0;
        restar=n1-n2;
        return restar;
    }
}
