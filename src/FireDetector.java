public class FireDetector extends AirPurifier{
    private boolean alarmActive;
    private int smokeLevelThreshold;

    public FireDetector(AirPurifier airPurifier) {
        alarmActive = false;
        smokeLevelThreshold = airPurifier.getSmokeLevel();
    }

    public void detectSmoke(int smokeLevel) {
        if (smokeLevel >= smokeLevelThreshold) {
            activateAlarm();
        } else {
            deactivateAlarm();
        }
    }

    private void activateAlarm() {
        alarmActive = true;
        System.out.println("Smoke detected! Alarm activated.");
    }

    private void deactivateAlarm() {
        alarmActive = false;
        System.out.println("Smoke cleared. Alarm deactivated.");
    }

    public boolean isAlarmActive() {
        return alarmActive;
    }
}
