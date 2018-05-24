/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_concretas;

import main.AbstractFactory;

/**
 *
 * @author LN710Q
 */
public class operaciones implements AbstractFactory{
    @Override
    public Aritmetica getAritmetica(String type) {
        switch (type) {
            case "Suma":
                return new Suma();
            case "Resta":
                return new resta();
            case "Division":
                return new Division();
                
            case "Multiplicacion":
                return new Multiplicacion();
        }
        return null;
    }

    @Override
    public Convertor getConvertor(String type) {
        switch (type){
            case "Binario":
                return new Binario();
        }
        return null;
    }
}
