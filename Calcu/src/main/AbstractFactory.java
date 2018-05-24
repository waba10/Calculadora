/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import operaciones_concretas.Aritmetica;
import operaciones_concretas.Convertor;
/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    Aritmetica getAritmetica(String type);
    Convertor getConvertor(String type);
}
