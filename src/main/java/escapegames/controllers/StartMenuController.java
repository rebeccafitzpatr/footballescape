package escapegames.controllers;

import java.io.IOException;

import escapegames.App;
import escapegames.SceneManager.GameUi;
import javafx.fxml.FXML;

public class StartMenuController extends Controllers{

    @Override
    protected void initialise() {
        
    }

    @FXML
    private void startGame() throws IOException {
        App.setUi(GameUi.LOCKERROOM);
    }
    
}
