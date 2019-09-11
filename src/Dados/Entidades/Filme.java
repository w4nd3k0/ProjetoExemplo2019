/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author IFNMG
 */
public class Filme {
    
    private Integer Id_Filme;
    private String Nome_Filme;
    private LocalDate Lancamento_Filme;
    private Double Arecadacao_Filme;
    private Genero genero;
    private ArrayList<Ator> Atores;

    public Integer getId_Filme() {
        return Id_Filme;
    }
    
    public String getNome_Filme() {
        return Nome_Filme;
    }
   
    public LocalDate getLancamento_Filme() {
        return Lancamento_Filme;
    }
    
    public Double getArecadacao_Filme() {
        return Arecadacao_Filme;
    }
    
    public Genero getGenero() {
        return genero;
    }
    
    public ArrayList<Ator> getAtores() {
        return Atores;
    }
    
    public void setId_Filme(Integer Id_Filme) {
        this.Id_Filme = Id_Filme;
    }

    public void setNome_Filme(String Nome_Filme) {
        this.Nome_Filme = Nome_Filme;
    }

    public void setLancamento_Filme(LocalDate Lancamento_Filme) {
        this.Lancamento_Filme = Lancamento_Filme;
    }

    public void setArecadacao_Filme(Double Arecadacao_Filme) {
        this.Arecadacao_Filme = Arecadacao_Filme;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setAtores(ArrayList<Ator> Atores) {
        this.Atores = Atores;
    }
      
}