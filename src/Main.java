public class Main {
    public static void main(String[] args) {
        AreaDeterminant areaDeterminant = new AreaDeterminant(35, 16);
        areaDeterminant.getArea(areaDeterminant);
        AirPurifier airPurifier = new AirPurifier();
        airPurifier.powerOn();
        airPurifier.setDustLevel(25);
        airPurifier.setPurifyingMode();
        airPurifier.powerOn();
        airPurifier.displayStatus();
        FireDetector fireDetector = new FireDetector(airPurifier);
        fireDetector.detectSmoke(5);
        fireDetector.getSmokeLevel();
        fireDetector.displayStatus();
        fireDetector.isAlarmActive();
        HumidityAdjuster humidityAdjuster = new HumidityAdjuster(55, 45);
        humidityAdjuster.adjustHumidity();
        humidityAdjuster.displayStatus();
        humidityAdjuster.resetHumidity();
        TemperatureAdjuster temperatureAdjuster = new TemperatureAdjuster(33, 25);
        temperatureAdjuster.adjustTemperature();
        temperatureAdjuster.displayStatus();
        temperatureAdjuster.resetTemperature();
        ClimateControlRemote remote = new ClimateControlRemote();

        remote.powerOn();

        remote.setSmokeLevel(5);
        remote.displayAirPurifierStatus(); // Display air purifier status after setting smoke level

        remote.adjustHumidity(50);
        remote.displayHumidityAdjusterStatus(); // Display humidity adjuster status after adjusting humidity

        remote.adjustTemperature(24.5);
        remote.displayTemperatureAdjusterStatus(); // Display temperature adjuster status after adjusting temperature

        remote.powerOff();
    }
}