/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados.Entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author IFNMG
 */

//Transforma a classe ator em entidade
@Entity
public class Filme {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Filme;
    
    private String Nome_Filme;
    private LocalDate Lancamento_Filme;
    private BigDecimal Arecadacao_Filme;
    
    //Relacionamenteo um para um
    //Optional false genero não pode ser nulo
    @OneToOne(optional = false)
    private Genero genero;
    //private ArrayList<Ator> Atores;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Id_Filme);
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
        final Filme other = (Filme) obj;
        if (!Objects.equals(this.Id_Filme, other.Id_Filme)) {
            return false;
        }
        return true;
    }
    
    //Get's

    public Integer getId_Filme() {
        return Id_Filme;
    }
    
    public String getNome_Filme() {
        return Nome_Filme;
    }
   
    public LocalDate getLancamento_Filme() {
        return Lancamento_Filme;
    }
    
    public BigDecimal getArecadacao_Filme() {
        return Arecadacao_Filme;
    }
    
    public Genero getGenero() {
        return genero;
    }
    
    /*
    public ArrayList<Ator> getAtores() {
        return Atores;
    }
    */
    //Set's
    
    public void setId_Filme(Integer Id_Filme) {
        this.Id_Filme = Id_Filme;
    }

    public void setNome_Filme(String Nome_Filme) {
        this.Nome_Filme = Nome_Filme;
    }

    public void setLancamento_Filme(LocalDate Lancamento_Filme) {
        this.Lancamento_Filme = Lancamento_Filme;
    }

    public void setArecadacao_Filme(BigDecimal Arecadacao_Filme) {
        this.Arecadacao_Filme = Arecadacao_Filme;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    /*
    public void setAtores(ArrayList<Ator> Atores) {
        this.Atores = Atores;
    }
    */
}
