/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.cleasing;

import java.sql.*;
import br.com.databrain.dao.*;

/**
 *
 * @author Paulo
 */
public class CleasingDAO {
    
    public ResultSet retiraTagsHTMLDAO()
    {
        String SQL = "SELECT cleasing_tags_html FROM db_sistema.cleasing_tags_html";
        ResultSet retorno;
        
        RetornaConsulta rc = new RetornaConsulta();
        
        retorno = rc.RetornaResulSet(SQL);
        
        return retorno;
    }
    
}
