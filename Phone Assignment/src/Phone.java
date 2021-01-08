public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.setVersionNumber(versionNumber);
        this.batteryPercentage = batteryPercentage;
        this.setCarrier(carrier);
        this.setRingTone(ringTone);
    }
   
    public abstract void displayInfo();
    
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getVersionNumber() {
		return versionNumber;
	}
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	public String getRingTone() {
		return ringTone;
	}
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
}
