package sensors.thermoset.ThermoSetX19;

import itec3030.smarthome.standards.Thermostat;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;

public class ThermosetX19 implements Thermostat {

    private ControllerInterface ctrlInterface;
    private String id;
    private int tempThermo;
    public boolean enableThermo;

    // Constructor for ThermoSetX19 and Front End
    public ThermosetX19(){
        FrontEnd thermoDevice = new FrontEnd(this);
        thermoDevice.pack();
        thermoDevice.setVisible(true);
    }

    // New Temperature for thermostat
    // @param tempThermo is the temperature
    public void newTemperature(int tempThermo){
        this.tempThermo = tempThermo;
    }

    // Returns the controller the that is connected to the thermostat
    // @return ctrlInterface is the controller
    public ControllerInterface getController(){
        return ctrlInterface;
    }

    // Links the controller to the thermostat
    // @param ctrlInterface is the controller
    @Override
    public void setController(ControllerInterface ctrlInterface) {
        this.ctrlInterface = ctrlInterface;
    }

    // Reads the current ID of the thermostat
    // @param id is the ID
    public String getID(){
        return id;
    }

    // Gives new ID to the thermostat
    // @param id is the new ID
    @Override
    public void setID(String id) {
        this.id = id;
    }

    // Enables Thermostat
    public void enable(){
        enableThermo = true;
    }

    // Disables Thermostat
    public void disable(){
        enableThermo = false;
    }

    // Checks if the thermostat is enabled
    // @return enableThermo if true thermostat enabled and if false thermostat
    @Override
    public boolean enabled() {
        return enableThermo;
    }

    // Shows the temperature of the thermostat
    // @return tempThermo the temperature
    @Override
    public int getReading() {
        return tempThermo;
    }
}
