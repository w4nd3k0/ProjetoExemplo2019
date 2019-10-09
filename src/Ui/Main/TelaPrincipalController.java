/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author IFNMG
 */
public class TelaPrincipalController implements Initializable {
    
    private Label label;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AbrirJanelaAtor(ActionEvent event) throws IOException {
        
        //Código para abrir uma nova Janela
        
        //Ler o FXML que representa a nova janela
        //(adicionar o throws)
        Parent root = FXMLLoader.load(getClass()
                .getResource("/Ui/Ator/JanelaAtor.fxml"));
        
        //Criando a cena
        Scene scene = new Scene(root);
        
        //Criando a janela (STAGE) 
        Stage stage = new Stage(StageStyle.UTILITY);
        
        //Titulo na janela
        stage.setTitle("Ator");
        
        //Adicionando a cena na janela
        stage.setScene(scene);
        
        //Configurando o MODALITY
        //Diz respeito ao comportamento das janelas anteriores
        //quando essa for mostrada
        //Para bloquear interação com as janelas anteriores
        stage.initModality(Modality.APPLICATION_MODAL);
        
        //Mostrando a nova janela
        stage.show();
        
    }

    @FXML
    private void AbrirJanelaFilme(ActionEvent event) throws IOException {
        
        //Código para abrir uma nova Janela
        
        //Ler o FXML que representa a nova janela
        //(adicionar o throws)
        Parent root = FXMLLoader.load(getClass()
                .getResource("/Ui/Filme/JanelaFilme.fxml"));
        
        //Criando a cena
        Scene scene = new Scene(root);
        
        //Criando a janela (STAGE) 
        Stage stage = new Stage(StageStyle.UTILITY);
        
        //Titulo na janela
        stage.setTitle("Filme");
        
        //Adicionando a cena na janela
        stage.setScene(scene);
        
        //Configurando o MODALITY
        //Diz respeito ao comportamento das janelas anteriores
        //quando essa for mostrada
        //Para bloquear interação com as janelas anteriores
        stage.initModality(Modality.APPLICATION_MODAL);
        
        //Mostrando a nova janela
        stage.show();
        
    }

    @FXML
    private void AbrirjanelaFilme(MouseEvent event) {
    }

    
}
