/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados.Daos;

import Dados.Entidades.Ator;
import Util.JPAUtil;
import javax.persistence.EntityManager;

/**
 *  
 * @author IFNMG
 */

//Salvar Aotr no BD
public class AtorDao {
    
    public void Salvar(Ator a){
        
        //pegando o gerenciado de acessso ao BD
        EntityManager Gerenciador = JPAUtil.getGerenciador();
        
        //Inciar a transação
        Gerenciador.getTransaction().begin();
        
        //Alteração que eu quero que ocorra no BD
        Gerenciador.persist(a);
        
        //Finalizando a transação
        Gerenciador.getTransaction().commit();
                
    }
    
}
