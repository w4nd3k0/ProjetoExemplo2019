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
public class TestaBuscaFilme {
    
    public static void main(String[] args) {
        
        //Pegando ogerenciador de acesso ao BD
        EntityManager Gerenciador = JPAUtil.getGerenciador();
        
        //Buscando um ator pelo id (Segundo parametro)
        Filme f = Gerenciador.find(Filme.class, 1);
        
        //Imprimindo nome do filme
        System.out.println("Filme: "+ f.getNome_Filme());
        
        //Imprimindo o nome do genero de filme
        System.out.println("Genero: " + f.getGenero().getNome_Genero());
    }
}
