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

//Transforma a classe ator em entidade
@Entity
public class Genero {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Genero;
    
    private String Nome_Genero;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.Id_Genero);
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
        final Genero other = (Genero) obj;
        if (!Objects.equals(this.Id_Genero, other.Id_Genero)) {
            return false;
        }
        return true;
    }
    
    public Integer getId_Genero() {
        return Id_Genero;
    }
    
    public String getNome_Genero() {
        return Nome_Genero;
    }

    public void setId_Genero(Integer Id_Genero) {
        this.Id_Genero = Id_Genero;
    }

    public void setNome_Genero(String Nome_Genero) {
        this.Nome_Genero = Nome_Genero;
    }
    
    
}
