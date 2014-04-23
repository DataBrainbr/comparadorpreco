/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.util;

import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileReader;   
import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;  

/**
 *
 * @author Paulo
 */
public class ArquivoTexto   {
    
    public List<String> lerArquivo(String pArquivo)throws Exception
    {
        File f = new File(pArquivo);  
        List<String> retorno = new ArrayList<String>();
        
        try
        {
            BufferedReader in = new BufferedReader(new FileReader(f));  
            String line;  
            
            while((line = in.readLine())!=null)  
            { 
                retorno.add(line.toString());  
            }
            return retorno;
        
        } 
        catch (FileNotFoundException e) 
        {  
            e.printStackTrace();  
            throw e;
        } 
        catch (IOException e)
        {  
            e.printStackTrace(); 
            throw e;
        }  
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            throw e;
        }
        
        finally
        {
           //
        }
    }
    
}
