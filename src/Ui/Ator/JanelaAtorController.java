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
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class JanelaAtorController implements Initializable {

    @FXML
    private JFXTextField TFNome;
    @FXML
    private JFXTextField TFID;
    @FXML
    private JFXButton TBSalvar;

    
    //Criar atributo para representar o serviço
    private AtorServico Servico = new AtorServico();
    
    @FXML
    private TableView<Ator> tabela;
    @FXML
    private TableColumn coNome;
    @FXML
    private TableColumn colId;
        
    //Atributo que representa os dados para tabela
    
    //import javafx.collections.FXCollections;
    //import javafx.collections.ObservableList;
    private ObservableList<Ator> dados = FXCollections.observableArrayList();
    
    
    //atributo que vai armazenar qual ator foi selecionado
    private Ator selecionado;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Configure a tabela
        configurarTabela();
        
        //Carregue a lista de atores na tabela
        listarAtoresTabela();
    }    
    
    //Mensagem de salvo com sucesso
    public void MensagemSucesso(String m){
        
        Alert Alerta = new Alert(Alert.AlertType.INFORMATION);
        Alerta.setTitle("Sucesso");
        Alerta.setHeaderText(null);
        Alerta.setContentText(m);
        Alerta.showAndWait();
    }
    
    private void configurarTabela() {
        //Dizer de onde a coluna vai pegar o valor para
        //exibir, basta dizer o nome do metodo get
        //que deve ser chamado para cada coluna
        // A string entre parênteses é o nome do atributo
        // que vc deseja chamar o get (quase sempre)
        //import javafx.scene.control.cell.PropertyValueFactory;
        
        //Nomes dos atributos na entidade ator
        colId.setCellValueFactory(new PropertyValueFactory("Id_Ator"));
        coNome.setCellValueFactory(new PropertyValueFactory("Nome_Ator"));
    }

    private void listarAtoresTabela() {
        //Limpando quaisquer dados anteriores
        dados.clear();
        
        //Solicitando a camada de servico a lista de atores
        List<Ator> atores = Servico.listar();
                
        //Transformar a lista de atores no formato que a tabela
        //do JavaFX aceita
        dados = FXCollections.observableArrayList(atores);
        
        //Jogando os dados na tabela
        tabela.setItems(dados);
    }

    private void salvar(ActionEvent event) {

    }

    @FXML
    private void Salvar(ActionEvent event) {
                //Pegar os Dados do formulario
        //e cria um objeto ator
        Ator a = new Ator(TFNome.getText());
        
        //Mandar o ator para a camada de serviços
        Servico.Salvar(a);
        
        //Exibindo Mensagem
        MensagemSucesso("Ator Salvo com Sucesso");
        //Limpando o form
        TFNome.setText("");
        
        //Atualiza tabela na janela ator
        listarAtoresTabela();
    }

    @FXML
    private void Editar(ActionEvent event) {
    }
    
}
