/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui.Ator;

import Dados.Entidades.Ator;
import Servicos.AtorServico;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class JanelaAtorController implements Initializable {

    @FXML
    private JFXTextField TFID;
    @FXML
    private JFXTextField TFNome;
    @FXML
    private JFXButton TBSalvar;
    
    //Criar atributo para representar o serviço
    private AtorServico Servico = new AtorServico();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Salvar(ActionEvent event) {
        
        //Pegar os Dados do formulario
        Ator a = new Ator(TFNome.getText());
        
        //Mandar o ator para a camada de serviços
        Servico.Salvar(a);
        
                //Exibindo Mensagem
        MensagemSucesso("Ator Salvo com Sucesso");
        TFNome.setText("");
        
    }
    
        //Mensagem de salvo com sucesso
    public void MensagemSucesso(String m){
        
        Alert Alerta = new Alert(Alert.AlertType.INFORMATION);
        Alerta.setTitle("Sucesso");
        Alerta.setHeaderText(null);
        Alerta.setContentText(m);
        Alerta.showAndWait();
    }
    
}
