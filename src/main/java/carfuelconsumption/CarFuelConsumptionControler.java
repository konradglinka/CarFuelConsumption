package carfuelconsumption;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


public class CarFuelConsumptionControler {
    TextFieldRestrict textFieldRestrict = new TextFieldRestrict(); //Class restrict size of textfield and let put here only double values
    ImageLoader imageLoader = new ImageLoader(); //Class add images
    FuelConsumptionCalculateMethod fuelConsumptionCalculateMethod = new FuelConsumptionCalculateMethod();
    @FXML
    ImageView calculateButtonImageView;
    @FXML
    TextField fuelTextField;
    @FXML
    TextField distanceTextField;
    @FXML
    Label resultFuelConsumptionLabel;
    @FXML
    void initialize() {

        imageLoader.loadImageToCalculateFuelConsumptionButton(calculateButtonImageView); //MOUNT IMAGE TO BUTTON
        textFieldRestrict.limitCharsForTextField(fuelTextField,5);
        textFieldRestrict.onlyDigitsInTextField(fuelTextField);
        textFieldRestrict.limitCharsForTextField(distanceTextField,6);
        textFieldRestrict.onlyDigitsInTextField(distanceTextField);
    }
    @FXML
    void onClickCalculateButton() {
            fuelConsumptionCalculateMethod.calculateFuelConsumption(distanceTextField, fuelTextField, resultFuelConsumptionLabel);
    }
    @FXML
    void pressEnterToWriteFuel(){
        if(distanceTextField.getLength()>0){
        fuelTextField.requestFocus();}
    }
    @FXML
    void pressEnterToWriteDistanceOrCalculate(){
        if(fuelTextField.getLength()<=0){
            distanceTextField.requestFocus();}
            else{
                onClickCalculateButton();
        }
    }
}
