package address.view;

/**
 * Created by Bobbie on 6/7/2016.
 */

import address.MainApp;
import javafx.fxml.FXML;


/**
 * All private fields and methods where the fxml file needs access must be annotated with @FXML.
 */
public class FrontPageController {

    // Reference to the main application.
    private MainApp mainApp;

    private boolean continueClicked = true;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public FrontPageController() {
    }

    /**
     * Initializes the controller class. This method is automatically called after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {

    }

    /**
     * Is called by the main application to give a reference back to itself.
     *
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

    }

    /**
     * Called when the user clicks the continue button.
     */
    @FXML
    private void handleContinue() {

        if (continueClicked) {
            mainApp.showPersonOverview();
        }
    }
}
