public class AirPurifier {
    private int smogLevel;
    private int dustLevel;
    private int smokeLevel;
    private int ozoneLevel;
    private int carbonLevel;
    boolean powerOn;

    public int getSmogLevel() {
        return smogLevel;
    }

    public void setSmogLevel(int smogLevel) {
        this.smogLevel = smogLevel;
    }

    public int getDustLevel() {
        return dustLevel;
    }

    public void setDustLevel(int dustLevel) {
        this.dustLevel = dustLevel;
    }

    public int getSmokeLevel() {
        return smokeLevel;
    }

    public void setSmokeLevel(int smokeLevel) {
        this.smokeLevel = smokeLevel;
    }

    public int getOzoneLevel() {
        return ozoneLevel;
    }

    public void setOzoneLevel(int ozoneLevel) {
        this.ozoneLevel = ozoneLevel;
    }

    public int getCarbonLevel() {
        return carbonLevel;
    }

    public void setCarbonLevel(int carbonLevel) {
        this.carbonLevel = carbonLevel;
    }

public String setPurifyingMode(){
        String mode;
        if(getSmogLevel()>10){
            mode="Smog";
        }
        else if(getCarbonLevel()>10){
            mode="Carbon";
        }
        else if(getDustLevel()>10){
            mode="Dust";
        }
        else if(getOzoneLevel()>10) {
            mode = "Ozone";
        }
        else if(getSmokeLevel()>10){
            mode="Smoke";
        }
        else if (smokeLevel > 10 && carbonLevel > 10 && dustLevel > 10 && ozoneLevel > 10) {
        mode = "Combined";
    }
        else{
            mode="Neutral";
        }
            System.out.println(mode);
            return mode;
          }

    public void powerOn() {
        powerOn = true;
        System.out.println("Air purifier is turned on.");
    }

    public void powerOff() {
        powerOn = false;
        System.out.println("Air purifier is turned off.");
    }

    public boolean displayStatus() {
        System.out.println("Air Purifier Status:");
        System.out.println("Power: " + (powerOn ? "On" : "Off"));
        System.out.println("Smoke Level: " + smokeLevel);
        System.out.println("Carbon Level: " + carbonLevel);
        System.out.println("Dust Level: " + dustLevel);
        System.out.println("Ozone Level: " + ozoneLevel);
        return false;
    }
}
