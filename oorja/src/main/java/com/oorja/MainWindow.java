package com.oorja;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import static jdk.internal.misc.OSEnvironment.initialize;

public class MainWindow {

    private Stage stage;
    private Scene scene;
    private BorderPane borderPane;
    private HBox hbox;

    private Media media;
    private MediaPlayer mediaPlayer;
    private MediaView mediaView;

    private String MEDIA_URL = "";
    private Button btnPlay;
    private Button btnPause;

    public MainWindow() {
        initialize();
    }

    private void initialize(){
        stage = new Stage();
        stage.setTitle("Oorja's Heart Machine");
        borderPane = new BorderPane();

        media = new Media();
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setOnReady(() → stage.sizeToScene());

        


    }


    private class Media {
    }

    private class MediaPlayer {
        public void setAutoPlay(boolean b) {
        }

        public void setOnReady() {
        }
    }

    private class MediaView {
    }
}

