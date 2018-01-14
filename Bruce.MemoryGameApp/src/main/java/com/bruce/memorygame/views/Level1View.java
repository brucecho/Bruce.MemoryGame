/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruce.memorygame.views;

import com.gluonhq.charm.glisten.mvc.View;
import java.io.IOException;
import javafx.fxml.FXMLLoader;

/**
 *
 * @author bruce
 */
public class Level1View {

    private final String name;

    public Level1View(String name) {
        this.name = name;
    }

    public View getView() {
        try {
            View view = FXMLLoader.load(SecondaryView.class.getResource("level1.fxml"));
            view.setName(name);
            return view;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
            return new View(name);
        }
    }
}
