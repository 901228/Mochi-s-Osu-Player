package mochi.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start( Stage primaryStage ) {

        try {

            AnchorPane root = new AnchorPane();
            Scene scene = new Scene( root, 400, 400, Color.DIMGRAY );
            Rectangle background = new Rectangle( scene.getWidth(), root.getHeight(), Color.DIMGRAY );
            REFERENCE.nodeGroup.add( background );

            RootDirectoryChooser chooser = new RootDirectoryChooser();
            Label l = new Label();
            REFERENCE.nodeGroup.add( l );
            l.setText( chooser.getDirectoryChooser().showDialog( primaryStage ).getAbsolutePath() );

            root.getChildren().addAll( REFERENCE.nodeGroup );
            primaryStage.setScene( scene );
            primaryStage.show();
        } catch ( Exception e ) {

            e.printStackTrace();
        }
    }

    public static void main( String[] args ) {

        launch( args );
    }
}
