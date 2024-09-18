import java.awt.*;

public class car {
    int averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTaillightworking;

    public car(int inputAverageMPG,String inputLicensePlate, Color inputPaintColor, boolean inputAreTailLightWorking){
        this.averageMilesPerGallon  = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTaillightworking = inputAreTailLightWorking;
    }

}
