package mochi.JavaFX;

import java.io.File;

import javafx.stage.DirectoryChooser;

public class RootDirectoryChooser {

    private DirectoryChooser directoryChooser;

    public RootDirectoryChooser() {

        directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle( "Select Osu Root Directory" );
        directoryChooser.setInitialDirectory( new File( System.getProperty( "user.home" ) + "/AppData/Local/osu!" ) );
    }

    public DirectoryChooser getDirectoryChooser() {

        return directoryChooser;
    }
}
