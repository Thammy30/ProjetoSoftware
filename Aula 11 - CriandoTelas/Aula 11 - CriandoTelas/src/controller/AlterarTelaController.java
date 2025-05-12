package controller;

import java.io.IOException;
import java.lang.classfile.components.ClassPrinter.Node;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AlterarTelaController {

	public static void mudarTela(ActionEvent event, String TelaFXML, String Titulo) throws IOException {
		
		//Informe o caminho do arquivo Fxml
		FXMLLoader loader = new FXMLLoader(AlterarTelaController.class.getResource(TelaFXML));
		//Carregar o arquivo FXML
		Parent root = loader.load();
		
		//Identificar a mudança de janela
		Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
		
		//Definir uma nova cena para tela
		Scene scene = new Scene(root);
		
		//Definir um titulo para a janela
		stage.setTitle(Titulo);
		
		//Atualizo uma nova senha
		stage.setScene(scene);
		stage.show();
	}
	

	
}
