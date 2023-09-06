public class ClimateControlRemote {
    private AirPurifier airPurifier;
    private FireDetector fireDetector;
    private HumidityAdjuster humidityAdjuster;
    private TemperatureAdjuster temperatureAdjuster;

    public ClimateControlRemote() {
        airPurifier = new AirPurifier();
        fireDetector = new FireDetector(airPurifier);
        humidityAdjuster = new HumidityAdjuster(0, 0);
        temperatureAdjuster = new TemperatureAdjuster(0, 0);
    }

    public void powerOn() {
        airPurifier.powerOn();
    }

    public void powerOff() {
        airPurifier.powerOff();
    }

    public void setSmogLevel(int level) {
        airPurifier.setSmogLevel(level);
    }

    public void setDustLevel(int level) {
        airPurifier.setDustLevel(level);
    }

    public void setSmokeLevel(int level) {
        airPurifier.setSmokeLevel(level);
        fireDetector.detectSmoke(level);
    }

    public void setOzoneLevel(int level) {
        airPurifier.setOzoneLevel(level);
    }

    public void setCarbonLevel(int level) {
        airPurifier.setCarbonLevel(level);
    }

    public void adjustHumidity(int targetHumidity) {
        humidityAdjuster.setTargetHumidity(targetHumidity);
        humidityAdjuster.adjustHumidity();
    }

    public void adjustTemperature(double targetTemperature) {
        temperatureAdjuster.setTargetTemperature(targetTemperature);
        temperatureAdjuster.adjustTemperature();
    }

    public void displayAirPurifierStatus() {
        airPurifier.displayStatus();
    }

    public void displayHumidityAdjusterStatus() {
        humidityAdjuster.displayStatus();
    }

    public void displayTemperatureAdjusterStatus() {
        temperatureAdjuster.displayStatus();
    }
}