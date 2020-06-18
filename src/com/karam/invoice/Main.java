package com.karam.invoice;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        VBox vBox = loader.load();

        MenuBar menuBar = createMenu();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());

        Pane menuPane = (Pane) vBox.getChildren().get(0);
        menuPane.getChildren().add(menuBar);

        primaryStage.setTitle("Invoice Generator");
        primaryStage.setScene(new Scene(vBox, 650, 800));
        primaryStage.show();
    }

    private MenuBar createMenu() {


        Menu fileMenu = new Menu("File");
        MenuItem newGame = new MenuItem("New ");
        newGame.setOnAction(event -> resetGame());
        MenuItem resetGame = new MenuItem("Reset ");
        resetGame.setOnAction(event -> resetGame());

        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
        MenuItem  exitGame = new MenuItem("Exit ");
        exitGame.setOnAction(event -> exitGame());

        fileMenu.getItems().addAll(newGame, resetGame, separatorMenuItem, exitGame);

        Menu helpMenu = new Menu("Help");
        MenuItem aboutGame = new MenuItem("About App");
        aboutGame.setOnAction(event -> aboutTaxInvoice());

     

        helpMenu.getItems().addAll(aboutGame);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, helpMenu);

        return menuBar;
    }

    private void aboutTaxInvoice() {
    }

    private static void resetGame()
    {

    }
    private static void exitGame()
    {
        Platform.exit();
        System.exit(0);
    }


    public static void main(String[] args) {
        launch(args);

    }
}
