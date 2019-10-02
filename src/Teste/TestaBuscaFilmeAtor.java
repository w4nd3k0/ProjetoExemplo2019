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
public class TestaBuscaFilmeAtor {
    
    public static void main(String[] args) {
        
        //Pegando ogerenciador de acesso ao BD
        EntityManager Gerenciador = JPAUtil.getGerenciador();
        
        //Buscar o filme de id1
        Filme f = Gerenciador.find(Filme.class, 1);
        
        //Imprimir o nome do filme
        System.out.println("Filme: " + f.getNome_Filme());
        
        //Imprimir o genero
        System.out.println("Genero: " + f.getGenero().getNome_Genero());

        //imprimindo o nome dos atores desse filme
        for(Ator a : f.getAtores()){
            System.out.println("Ator: " + a.getNome_Ator());
        }
    }
    
}
