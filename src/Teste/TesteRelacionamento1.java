/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Dados.Entidades.Filme;
import Dados.Entidades.Genero;
import Util.JPAUtil;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import javax.persistence.EntityManager;

/**
 *
 * @author IFNMG
 */
public class TesteRelacionamento1 {
    
    public static void main(String[] args) {
        
        Genero g = new Genero();
        g.setNome_Genero("Drama");
        
        Filme f = new Filme();
        f.setNome_Filme("Os Miseraveis");
        f.setArecadacao_Filme(new BigDecimal("2000"));
        f.setLancamento_Filme(LocalDate.of(200, 7, 1));
        f.setGenero(g);
        
        //Pegando ogerenciador de acesso ao BD
        EntityManager Gerenciador = JPAUtil.getGerenciador();
        
        //Iniciar a transação
        Gerenciador.getTransaction().begin();
        
        //Salvando o genero
        Gerenciador.persist(g);
        
        //Salvar O Filme
        Gerenciador.persist(f);
        
        //Finalizando a transação
        Gerenciador.getTransaction().commit();
        
        //Fechar o gerenciado
        Gerenciador.close();
                
    }
    
}
