/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados.Entidades;

/**
 *
 * @author IFNMG
 */
public class Genero {
    
    private Integer Id_Genero;
    private String Nome_Genero;

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
