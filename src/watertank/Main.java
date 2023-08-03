
package watertank;

import watertank.view.AlarmWindow;
import watertank.view.CountDisplayWindow;
import watertank.view.GateWindow;
import watertank.view.WaterLavel;

public class Main {


    public static void main(String[] args) {
       //WindowController windowController = new WindowController();
       WindowController windowController=new WindowController();
       windowController.addWaterLevelObserver(new AlarmWindow());
       windowController.addWaterLevelObserver(new GateWindow());
       windowController.addWaterLevelObserver(new CountDisplayWindow());
       
       new WaterLavel(windowController).setVisible(true);

    }
    
}
