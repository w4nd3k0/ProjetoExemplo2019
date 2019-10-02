/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados.Entidades;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author IFNMG
 */

@Entity
public class Ator {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Ator;
    
    private String Nome_Ator;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.Id_Ator);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ator other = (Ator) obj;
        if (!Objects.equals(this.Id_Ator, other.Id_Ator)) {
            return false;
        }
        return true;
    }
    
    public Integer getId_Ator() {
        return Id_Ator;
    }  
    
    public String getNome_Ator() {
        return Nome_Ator;
    }

    public void setId_Ator(Integer Id_Ator) {
        this.Id_Ator = Id_Ator;
    }

    public void setNome_Ator(String Nome_Ator) {
        this.Nome_Ator = Nome_Ator;
    }
    
    
}
