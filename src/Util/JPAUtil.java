/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

/**
 *
 * @author IFNMG
 */
public class JPAUtil {
    
    
    private static EntityManagerFactory Cinema = Persistence.createEntityManagerFactory("projeto");
    
    
    public static EntityManager getGerenciador(){
        
        return Cinema.createEntityManager();
    }
    
}
