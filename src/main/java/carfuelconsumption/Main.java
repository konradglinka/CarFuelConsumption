package carfuelconsumption;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    //VM CONFIGURATIONS TO RUN JAVA FX APP
    //--module-path E:\BACKUP\javafx-sdk-11.0.2\lib --add-modules javafx.controls,javafx.fxml

    public void start(Stage primaryStage) throws Exception{

        //CONTROLER
        Parent root = FXMLLoader.load(this.getClass().getResource("/carfuelconsumption/CarFuelConsumptionView.fxml"));
        //ICON OF APP
        primaryStage.getIcons().add(new Image(String.valueOf(getClass().getResource("/carfuelconsumption/Img/CarFuelConsumptionIcon.png"))));
        //TITLE OF APP
        primaryStage.setTitle("Car Fuel Consumption");
        primaryStage.setScene(new Scene(root));
        //SIZABLE IS OFF
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
