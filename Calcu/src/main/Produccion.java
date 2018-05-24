/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import operaciones_concretas.operaciones;
/**
 *
 * @author LN710Q
 */
public class Produccion {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "operaciones concretas":
                return  (AbstractFactory) new operaciones();
          
        }
        return null;
    }
}
