package com.bruce.memorygame;

import com.bruce.memorygame.views.Level1View;
import com.bruce.memorygame.views.PrimaryView;
import com.bruce.memorygame.views.SecondaryView;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.layout.layer.SidePopupView;
import com.gluonhq.charm.glisten.visual.Swatch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MemoryGame extends MobileApplication {

    public static final String PRIMARY_VIEW = HOME_VIEW;
    public static final String SECONDARY_VIEW = "second view";
    public static final String LEVEL1_VIEW = "開始遊戲";
    public static final String MENU_LAYER = "Side Menu";
    
    public static final Image imageA = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-b-icon.png"));
    public static final Image imageB = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-b-icon.png"));
    public static final Image imageC = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-c-icon.png"));
    public static final Image imageD = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-d-icon.png"));
    public static final Image imageE = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-e-icon.png"));
    public static final Image imageF = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-f-icon.png"));
    public static final Image imageG = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-g-icon.png"));
    public static final Image imageH = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-h-icon.png"));
    public static final Image imageI = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-i-icon.png"));
    
    @Override
    public void init() {
        addViewFactory(PRIMARY_VIEW, () -> new PrimaryView(PRIMARY_VIEW).getView());
        addViewFactory(SECONDARY_VIEW, () -> new SecondaryView(SECONDARY_VIEW).getView());
        addViewFactory(LEVEL1_VIEW, () -> new Level1View(LEVEL1_VIEW).getView());
        
        addLayerFactory(MENU_LAYER, () -> new SidePopupView(new DrawerManager().getDrawer()));
    }

    @Override
    public void postInit(Scene scene) {
        Swatch.BLUE.assignTo(scene);

        scene.getStylesheets().add(MemoryGame.class.getResource("style.css").toExternalForm());
        ((Stage) scene.getWindow()).getIcons().add(new Image(MemoryGame.class.getResourceAsStream("/icon.png")));
    }
}
