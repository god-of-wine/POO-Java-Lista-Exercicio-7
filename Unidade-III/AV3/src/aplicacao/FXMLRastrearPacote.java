// Classe que inicializa a aba de Rastrear Pacotes

package aplicacao;

import java.util.ArrayList;

import entidades.Pacote;
import fxmls.FXMLRastrearPacoteController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMLRastrearPacote extends Application{
    public void start(Stage stage){}
    public void start(Stage stage, ArrayList<Pacote> lista) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxmls/rastrearpacote.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setTitle("Rastrear Pacotes - POO");
        stage.setResizable(false);
        stage.getIcons().add(new javafx.scene.image.Image("/imagens/rastrearPacote_icone.png"));

        FXMLRastrearPacoteController fxmlRPC = fxmlLoader.getController();
        fxmlRPC.setListaBBD(lista);

        stage.setScene(scene);
        stage.show();
    }
}
