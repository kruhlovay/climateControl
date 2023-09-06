public class HumidityAdjuster {
    private int currentHumidity;
    private int targetHumidity;

    public HumidityAdjuster(int initialHumidity, int targetHumidity) {
        currentHumidity = initialHumidity;
        this.targetHumidity = targetHumidity;
    }

    public void adjustHumidity() {
        if (currentHumidity < targetHumidity) {
            increaseHumidity();
        } else if (currentHumidity > targetHumidity) {
            decreaseHumidity();
        } else {
            System.out.println("Humidity is already at the target level.");
        }
    }

    private void increaseHumidity() {
        currentHumidity++;
        System.out.println("Increasing humidity. Current humidity: " + currentHumidity + "%");
    }

    private void decreaseHumidity() {
        currentHumidity--;
        System.out.println("Decreasing humidity. Current humidity: " + currentHumidity + "%");
    }

    public int getCurrentHumidity() {
        return currentHumidity;
    }

    public int getTargetHumidity() {
        return targetHumidity;
    }

    public void setTargetHumidity(int targetHumidity) {
        this.targetHumidity = targetHumidity;
        System.out.println("Target humidity level updated: " + targetHumidity + "%");
    }

       public void resetHumidity() {
        currentHumidity = 0;
        System.out.println("Humidity has been reset.");
    }

    public void displayStatus() {
        System.out.println("Humidity Adjuster Status:");
        System.out.println("Current Humidity: " + currentHumidity + "%");
        System.out.println("Target Humidity: " + targetHumidity + "%");
    }
}
