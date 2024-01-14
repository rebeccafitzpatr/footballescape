package escapegames;

import java.util.HashMap;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class SceneManager {


  public enum GameUi {
    MENU,
    LOCKERROOM
  }

  private static HashMap<GameUi, Parent> sceneMap = new HashMap<GameUi, Parent>();
  private static HashMap<GameUi, FXMLLoader> loaderMap = new HashMap<GameUi, FXMLLoader>();

  
  public static void addGameUi(GameUi ui, Parent root, FXMLLoader loader) {
    sceneMap.put(ui, root);
    loaderMap.put(ui, loader);
  }

  public static Parent getUi(GameUi ui) {
    return sceneMap.get(ui);
  }

  public static FXMLLoader getLoader(GameUi ui) {
    return loaderMap.get(ui);
  }
}

