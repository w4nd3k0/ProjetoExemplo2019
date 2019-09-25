/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Dados.Entidades.Ator;
import Util.JPAUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author IFNMG
 */
public class TesteBuscaAtor {
    
    public static void main(String[] args) {
        
        //Pegando ogerenciador de acesso ao BD (Sempre precisa do gerenciado para comunicação com o BD
        EntityManager Gerenciador = JPAUtil.getGerenciador();
        
        //Buscando um ator pelo ID
        Ator a = Gerenciador.find(Ator.class, 1);
        
        //Impimir nome do ator
        System.out.println("Nome: " + a.getNome_Ator());
        
        //Fechar Gerenenciado
        Gerenciador.close();
    }
    
}
