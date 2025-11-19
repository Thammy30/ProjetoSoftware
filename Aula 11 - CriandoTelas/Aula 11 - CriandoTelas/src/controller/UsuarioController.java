package controller;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.AtualizaDados;
import model.ExcluirUsuario;
import model.Usuario;

public class UsuarioController {

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtNome;

    @FXML
    private PasswordField txtSenha;
    
    private Usuario usuarioAtual;
    
    public void recebeUsuario(Usuario usuario) {
    	this.usuarioAtual = usuario;
    	txtLogin.setText(usuario.getLogin());
    	txtNome.setText(usuario.getNome());
    	txtSenha.setText(usuario.getSenha());
    	
    }
        
    @FXML
    void onClickAtualizar(ActionEvent event) throws SQLException {

    	//Capturar novos dados do usuário
    	String novoNome = txtNome.getText();
    	String novoSenha = txtSenha.getText();
    	String novoLogin = txtLogin.getText();
    	
    	//Salvar Login Antigo
    	String loginAntigo = usuarioAtual.getLogin();
    	
    	//Alterar as Informações do usuário
    	usuarioAtual.setLogin(novoLogin);
    	usuarioAtual.setNome(novoNome);
    	usuarioAtual.setSenha(novoSenha);
    	
    	//Chamar a classe para alterar os dados no bamco de dados
    	AtualizaDados dadosAtualizados = new AtualizaDados();
    	boolean sucesso = dadosAtualizados.AtualizarUsuario(usuarioAtual, loginAntigo);
    	
    	if (sucesso) {
    		Alert alerta = new Alert(Alert.AlertType.INFORMATION);
			alerta.setTitle("Usuário atualizado");
			alerta.setHeaderText("Usuário atualizado com sucesso");
			alerta.showAndWait();
}
    }
    @FXML
    void onClickExcluir(ActionEvent event) throws SQLException, IOException {
    	//Salvar o login antigo
    	String loginAntigo = usuarioAtual.getLogin();
    	
    	ExcluirUsuario excluir = new ExcluirUsuario();
    	boolean sucesso = excluir.deletarUsuario(loginAntigo);
    	
    	if (sucesso) {
    		Alert alerta = new Alert(Alert.AlertType.INFORMATION);
			alerta.setTitle("Usuário deletado");
			alerta.setHeaderText("Usuário deletado com sucesso");
			alerta.showAndWait();
			AlterarTelaController.mudarTela(event, "/view/TelaHome.fxml", "Tela Home");
}

    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
    	AlterarTelaController.mudarTela(event, "/view/TelaLogin.fxml", "Tela Login");
    }


}
