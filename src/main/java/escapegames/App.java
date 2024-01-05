package escapegames;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 */
public  class App extends Application{
    private static Scene scene;
    private static FXMLLoader fxmlLoader;
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        launch();
    }

    @Override 
    public void start(final Stage stage) throws IOException {
        fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/startmenu.fxml"));
        Parent root = fxmlLoader.load();
        scene = new Scene(root);
        stage.setScene(scene);

        // Set window size and make it resizable
        stage.setMinHeight(596);
        stage.setMinWidth(800);
        stage.setResizable(true);
        stage.show();
        }
}
