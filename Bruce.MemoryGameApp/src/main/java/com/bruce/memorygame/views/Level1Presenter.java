/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruce.memorygame.views;

import com.bruce.memorygame.MemoryGame;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author bruce
 */
public class Level1Presenter implements Initializable {

    @FXML
    private View viewContent;
    @FXML
    private Label labelLevelName;
    @FXML
    private ImageView imageviewPicture01;
    @FXML
    private ImageView imageviewPicture02;
    @FXML
    private ImageView imageviewPicture03;
    @FXML
    private ImageView imageviewPicture04;
    @FXML
    private Label labelMessage;
    @FXML
    private Button buttonStart;
    @FXML
    private Button buttonContinue;
    @FXML
    private Button buttonTryagain;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        viewContent.showingProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue) {
                AppBar appBar = MobileApplication.getInstance().getAppBar();
                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e
                        -> MobileApplication.getInstance().showLayer(MemoryGame.MENU_LAYER)));
                appBar.setTitleText("Level 1");
//                appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> 
//                        System.out.println("Search")));
            }
        });

    }

}
