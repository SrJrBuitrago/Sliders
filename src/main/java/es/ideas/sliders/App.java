package es.ideas.sliders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/**
 * Clase principal de la aplicación Sliders
 *
 * @author SrBlxde (José Ramón)
 * @author LzByte (Lázaro)
 * @see <a href="https://github.com/SrJrBuitrago">Cuenta de Github de José
 * Ramón</a>
 * @see <a href="https://github.com/LzByte">Cuenta de Github de Lázaro</a>
 * @see <a href="https://github.com/SrJrBuitrago/Temporizador">Repositorio 
 * Temporizador</a>
 */
public class App extends Application {
    /**
     * Método que se ejcuta al iniciar la aplicación, carga el FXML "vista",
     * añade el título "Sliders" y le pone propiedades de alto y ancho a la
     * GUI.
     * @param stage
     * @throws IOException 
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(
                "vista.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 450);
        stage.setTitle("Sliders");
        stage.setMinWidth(600);
        stage.setMinHeight(450);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}