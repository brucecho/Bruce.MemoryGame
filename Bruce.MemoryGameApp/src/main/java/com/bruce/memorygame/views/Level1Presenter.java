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
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;

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
    private ImageView imageviewPicture1;
    @FXML
    private ImageView imageviewPicture2;
    @FXML
    private ImageView imageviewPicture3;
    @FXML
    private ImageView imageviewPicture4;
    @FXML
    private Label labelMessage;
    @FXML
    private Button buttonStart;
    @FXML
    private Button buttonContinue;
    @FXML
    private Button buttonTryagain;

    private String strAllLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private ArrayList alShowLetter = new ArrayList();

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
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            alShowLetter.add(i, strAllLetter.charAt(r.nextInt(strAllLetter.length())));
        }
        imageviewPicture1.setImage(getImage(alShowLetter.get(0).toString()));
        imageviewPicture2.setImage(getImage(alShowLetter.get(1).toString()));
        imageviewPicture3.setImage(getImage(alShowLetter.get(2).toString()));
        imageviewPicture4.setImage(getImage(alShowLetter.get(3).toString()));

        Rotate rotationTransform1 = new Rotate(180);
        rotationTransform1.setAxis(Rotate.Y_AXIS);
        rotationTransform1.setPivotX(imageviewPicture1.getBoundsInLocal().getWidth() / 2);
        imageviewPicture1.getTransforms().add(rotationTransform1);

        Rotate rotationTransform2 = new Rotate(180);
        rotationTransform2.setAxis(Rotate.Y_AXIS);
        rotationTransform2.setPivotX(imageviewPicture2.getBoundsInLocal().getWidth() / 2);
        imageviewPicture2.getTransforms().add(rotationTransform2);

        Rotate rotationTransform3 = new Rotate(180);
        rotationTransform3.setAxis(Rotate.Y_AXIS);
        rotationTransform3.setPivotX(imageviewPicture3.getBoundsInLocal().getWidth() / 2);
        imageviewPicture3.getTransforms().add(rotationTransform3);

        Rotate rotationTransform4 = new Rotate(180);
        rotationTransform4.setAxis(Rotate.Y_AXIS);
        rotationTransform4.setPivotX(imageviewPicture4.getBoundsInLocal().getWidth() / 2);
        imageviewPicture4.getTransforms().add(rotationTransform4);
        
        setStatus("初始");
    }

    private void setStatus(String strStatusName) {
        switch(strStatusName){
            case "初始":
                this.imageviewPicture1.setVisible(false);
                this.imageviewPicture2.setVisible(false);
                this.imageviewPicture3.setVisible(false);
                this.imageviewPicture4.setVisible(false);
                break;
            case "":
                break;
        }
    }

    private Image getImage(String strLetter) {
        if (strLetter.equals("A")) {
            return MemoryGame.imageA;
        } else if (strLetter.equals("B")) {
            return MemoryGame.imageB;
        } else if (strLetter.equals("C")) {
            return MemoryGame.imageC;
        } else if (strLetter.equals("D")) {
            return MemoryGame.imageD;
        } else if (strLetter.equals("E")) {
            return MemoryGame.imageE;
        } else if (strLetter.equals("F")) {
            return MemoryGame.imageF;
        } else if (strLetter.equals("G")) {
            return MemoryGame.imageG;
        } else if (strLetter.equals("H")) {
            return MemoryGame.imageH;
        } else if (strLetter.equals("I")) {
            return MemoryGame.imageI;
        } else if (strLetter.equals("J")) {
            return MemoryGame.imageJ;
        } else if (strLetter.equals("K")) {
            return MemoryGame.imageK;
        } else if (strLetter.equals("L")) {
            return MemoryGame.imageL;
        } else if (strLetter.equals("M")) {
            return MemoryGame.imageM;
        } else if (strLetter.equals("N")) {
            return MemoryGame.imageN;
        } else if (strLetter.equals("O")) {
            return MemoryGame.imageO;
        } else if (strLetter.equals("P")) {
            return MemoryGame.imageP;
        } else if (strLetter.equals("Q")) {
            return MemoryGame.imageQ;
        } else if (strLetter.equals("R")) {
            return MemoryGame.imageR;
        } else if (strLetter.equals("S")) {
            return MemoryGame.imageS;
        } else if (strLetter.equals("T")) {
            return MemoryGame.imageT;
        } else if (strLetter.equals("U")) {
            return MemoryGame.imageU;
        } else if (strLetter.equals("V")) {
            return MemoryGame.imageV;
        } else if (strLetter.equals("W")) {
            return MemoryGame.imageW;
        } else if (strLetter.equals("X")) {
            return MemoryGame.imageX;
        } else if (strLetter.equals("Y")) {
            return MemoryGame.imageY;
        } else if (strLetter.equals("Z")) {
            return MemoryGame.imageZ;
        }
        return null;
    }
}
