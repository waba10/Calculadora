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
public class Binario implements Convertor{

    @Override
    public String efectuar(int num) {
        String binario = "";
        if (num > 0) {
            while(num>0){
                if(num%2==0){
                    binario="0" + binario;
                }
                else{
                    binario="1"+ binario;
                }
                num=(int) num/2;
            }  
        }
        else if(num==0){
                    binario="0";
                    }
        else{
            return "No es posible";
        }
        //System.out.println(binario);
        
        
        return binario;
    }
    
}
