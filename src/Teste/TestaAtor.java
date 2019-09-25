/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Dados.Entidades.Ator;
import Util.JPAUtil;
import javax.persistence.*;

/**
 *
 * @author IFNMG
 */
public class TestaAtor {
    
    public static void main(String[] args) {
        //Testando a criação da tabela ator
    
        //Pegando ogerenciador de acesso ao BD
        EntityManager Gerenciador = JPAUtil.getGerenciador();
        
        //Criando um Objeto Ator
        Ator a1 = new Ator();
        a1.setNome_Ator("Carla");
                
        //Iniciar a transação
        Gerenciador.getTransaction().begin();
        
        //Alteração que eu quero que ocorra no BD
        Gerenciador.persist(a1);
        
        //Finalizando a transação
        Gerenciador.getTransaction().commit();
        
        //Fechar o gerenciado
        Gerenciador.close();
        
    }
}
