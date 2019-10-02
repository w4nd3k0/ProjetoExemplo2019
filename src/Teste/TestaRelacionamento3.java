/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Dados.Entidades.Ator;
import Dados.Entidades.Filme;
import Util.JPAUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author IFNMG
 */
public class TestaRelacionamento3 {
    
    public static void main(String[] args) {
        
        //Pegando ogerenciador de acesso ao BD
        EntityManager Gerenciador = JPAUtil.getGerenciador();
        
        //Buscar Atores Cadastrados
        Ator a1 = Gerenciador.find(Ator.class,1);
        Ator a2 = Gerenciador.find(Ator.class,2);
        
        //Buscando um filme
        Filme f = Gerenciador.find(Filme.class,1);
        
        
        //Associando atores com o filme
        f.getAtores().add(a1);
        f.getAtores().add(a2);
        
        //Iniciar a transação
        Gerenciador.getTransaction().begin();
        
        //Finalizando a transação
        Gerenciador.getTransaction().commit();
        
        //Fechar o gerenciado
        Gerenciador.close();
    }
    
}
