package carfuelconsumption;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FuelConsumptionCalculateMethod {
    public void calculateFuelConsumption(TextField distanceInKilometers, TextField fuelInLiters, Label resultTextToUser){
        if(distanceInKilometers.getLength()>0 && fuelInLiters.getLength()>0) { //Method calculate liters of fuel per 100 kilometers
            double distance = Double.parseDouble(distanceInKilometers.getText());
            double fuel = Double.parseDouble(fuelInLiters.getText());
            long pom = Math.round((fuel / distance) * 10000.00); // 100 * 100 - becuase 100
            // kilometers and round to two decimal places after point so 10000
            double result = pom / 100.00;
            resultTextToUser.setText(String.valueOf(result));
        }
        else{
            resultTextToUser.setText("NO DATA FROM USER");
        }
    }
}
