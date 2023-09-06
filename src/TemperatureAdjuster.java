public class TemperatureAdjuster {
    private double currentTemperature;
    private double targetTemperature;

    public TemperatureAdjuster(double initialTemperature, double targetTemperature) {
        currentTemperature = initialTemperature;
        this.targetTemperature = targetTemperature;
    }

    public void adjustTemperature() {
        if (currentTemperature < targetTemperature) {
            increaseTemperature();
        } else if (currentTemperature > targetTemperature) {
            decreaseTemperature();
        } else {
            System.out.println("Temperature is already at the target level.");
        }
    }

    private void increaseTemperature() {
        currentTemperature++;
        System.out.println("Increasing temperature. Current temperature: " + currentTemperature + "°C");
        // Additional logic to control temperature levels
    }

    private void decreaseTemperature() {
        currentTemperature--;
        System.out.println("Decreasing temperature. Current temperature: " + currentTemperature + "°C");
        // Additional logic to control temperature levels
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
        System.out.println("Target temperature level updated: " + targetTemperature + "°C");
    }

    public void resetTemperature() {
        currentTemperature = 0;
        System.out.println("Temperature has been reset.");
    }

    public void displayStatus() {
        System.out.println("Temperature Adjuster Status:");
        System.out.println("Current Temperature: " + currentTemperature + "°C");
        System.out.println("Target Temperature: " + targetTemperature + "°C");
    }

    public void increaseTargetTemperature(double increment) {
        targetTemperature += increment;
        System.out.println("Target temperature increased by " + increment + "°C. New target temperature: " + targetTemperature + "°C");
    }

    public void decreaseTargetTemperature(double decrement) {
        targetTemperature -= decrement;
        System.out.println("Target temperature decreased by " + decrement + "°C. New target temperature: " + targetTemperature + "°C");
    }

    public void resetTargetTemperature() {
        targetTemperature = 0;
        System.out.println("Target temperature has been reset.");
    }
}
