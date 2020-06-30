package carfuelconsumption;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageLoader {
    public void loadImageToCalculateFuelConsumptionButton(ImageView image){
        Image img = new Image(String.valueOf(getClass().getResource("/carfuelconsumption/Img/CarFuelConsumptionIconToCalculateButton.png")));
        image.setImage(img);
    }

}
