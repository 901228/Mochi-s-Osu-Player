package mochi.JavaFX;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ControlButton extends Label {

    private ImageView imageview;

    public ControlButton( String name ) {

        super();
        imageview = new ImageView( new Image( getClass().getResourceAsStream( "../../icon/" + name + ".png" ) ) );
        imageview.setFitWidth( 20 );
        imageview.setFitHeight( 20 );

        this.setGraphic( imageview );

        REFERENCE.nodeGroup.add( this );
    }

    public void setIcon( String name ) {

        setImage( name );
        this.setGraphic( imageview );
    }

    private void setImage( String name ) {

        imageview.setImage( new Image( getClass().getResourceAsStream( "../../icon/" + name + ".png" ) ) );
    }

    public ImageView getImageView() {

        return imageview;
    }
}
