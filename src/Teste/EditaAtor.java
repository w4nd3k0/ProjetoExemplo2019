/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.sdfdfdsfasff
 */
package Teste;

import Dados.Entidades.Ator;
import Util.JPAUtil;
import javax.persistence.EntityManager;


/**
 *
 * @author IFNMG
 */
public class EditaAtor {
    
    public static void main(String[] args) {
        
        ///pegando o gerenciado de acessso ao BD
        EntityManager Gerenciador = JPAUtil.getGerenciador();
        
        //Buscando um ator pelo id (Segundo parametro)
        Ator a = Gerenciador.find(Ator.class, 1);
        
        //Editando colocando um novo nome
        a.setNome_Ator("Samuell");
        
        //Inciar a transação
        Gerenciador.getTransaction().begin();
        
        //Finalizando a transação
        Gerenciador.getTransaction().commit();
        
        //Fechar o gerenciado
        Gerenciador.close();
        
    }
    
}
