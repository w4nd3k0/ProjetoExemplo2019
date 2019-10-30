/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicos;

import Dados.Daos.AtorDao;
import Dados.Entidades.Ator;
import java.util.List;
import javafx.scene.control.Alert;

/**
 *
 * @author IFNMG
 */

//Serviços Logicos de ator
public class AtorServico {
    
    //Atributo para representar a camada de dados 
    private AtorDao Dao = new AtorDao();    
    
    public void Salvar(Ator a){
        //Fazer Qualquer regra de negocio
        
        
        //Mandar o ator para a camada de dados
        
        //Para ser salvado no bando de dados
        Dao.Salvar(a);
                
    }

    /**
     * Solicita a camada DAO para buscar os atores
     * cadastrados
     * @return 
     */
    public List<Ator> listar(){
        
        //Qualquer regra de negócio (se aplicável)
        
        //Pedir a DAO para listar e retornar
        return Dao.listar();
        
    }
    

}
