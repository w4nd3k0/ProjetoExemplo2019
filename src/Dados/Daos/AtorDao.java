/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados.Daos;

import Dados.Entidades.Ator;
import Util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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
    
    /**
     * Retorna uma lista com todos os atores 
     * que estejam cadastrados no banco de dados
     * @return 
     */
    public List<Ator> listar(){
        
      //Pegando o gerenciador de acesso ao BD
      EntityManager gerenciador = JPAUtil.getGerenciador(); 
      
      //Criando a consulta ao BD
      TypedQuery<Ator> consulta = gerenciador.createQuery("Select a from Ator a", Ator.class);
      
      //Retornar a lista de atores
      return consulta.getResultList();
        
    }
    
}
