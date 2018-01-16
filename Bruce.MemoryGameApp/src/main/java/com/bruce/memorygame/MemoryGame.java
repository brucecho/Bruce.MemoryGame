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
    public static final Image imageJ = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-j-icon.png"));
    public static final Image imageK = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-k-icon.png"));
    public static final Image imageL = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-l-icon.png"));
    public static final Image imageM = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-m-icon.png"));
    public static final Image imageN = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-n-icon.png"));
    public static final Image imageO = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-o-icon.png"));
    public static final Image imageP = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-p-icon.png"));
    public static final Image imageQ = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-q-icon.png"));
    public static final Image imageR = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-r-icon.png"));
    public static final Image imageS = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-s-icon.png"));
    public static final Image imageT = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-t-icon.png"));
    public static final Image imageU = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-u-icon.png"));
    public static final Image imageV = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-v-icon.png"));
    public static final Image imageW = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-w-icon.png"));
    public static final Image imageX = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-x-icon.png"));
    public static final Image imageY = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-y-icon.png"));
    public static final Image imageZ = new Image(MemoryGame.class.getResourceAsStream("/com/bruce/memorygame/picture/Letter-z-icon.png"));
    
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
