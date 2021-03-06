/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexity.checker;

import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

/**
 *
 * @author Kennen
 */
public class SceneManager {

    private HashMap<String, Pane> screenMap = new HashMap<>();
    private Scene main;

    public SceneManager(Scene main) {
        this.main = main;
    }

    protected void addScreen(String name, Pane pane) {
        screenMap.put(name, pane);
    }

    protected void removeScreen(String name) {
        screenMap.remove(name);
    }

    protected void activate(String name) {
        main.setRoot(screenMap.get(name));
    }
}
