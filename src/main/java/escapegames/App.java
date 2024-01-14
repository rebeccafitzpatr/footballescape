package escapegames;

import java.io.IOException;

import escapegames.SceneManager.GameUi;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public  class App extends Application{
    private static Scene scene;
    private static FXMLLoader fxmlLoader;
  
    public static void main(String[] args) {
        launch();
    }

    @Override 
    public void start(final Stage stage) throws IOException {
      SceneManager.addGameUi(GameUi.MENU,loadFxml("startmenu"), fxmlLoader );
      SceneManager.addGameUi(GameUi.LOCKERROOM, loadFxml("lockerroom"), fxmlLoader);
      scene = new Scene(SceneManager.getUi(GameUi.MENU), 800, 596);
      stage.setScene(scene);

      stage.setMinHeight(596);
      stage.setMinWidth(800);
      stage.setResizable(true);
      stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
      scene.setRoot(loadFxml(fxml));
    }

    private static Parent loadFxml(final String fxml) throws IOException {
      fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/" + fxml + ".fxml"));
      return fxmlLoader.load();
    }

    public static void setUi(GameUi ui) {
      scene.setRoot(SceneManager.getUi(ui));
    }
}
