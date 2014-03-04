/*va
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.fonetica;

import java.lang.Object;
import org.apache.commons.codec.language.DoubleMetaphone; 
/**
 *
 * @author Paulo
 */
public class Fonetica extends Object{
    
    public String doubleMetaphone(String value)
    {
        DoubleMetaphone teste = new DoubleMetaphone();
    
        String retorno = teste.doubleMetaphone(value);
        
        return retorno;
    
    }
    
}
