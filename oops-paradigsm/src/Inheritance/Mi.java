package inheritance;

public class Mi extends Phone {
    String androidVersion;
    boolean hasCamera;
    boolean hasBluetooth;

    public Mi(String model,double size,String androidVersion, boolean hasCamera, boolean hasBluetooth) {
        super("MI",model,size);
        this.androidVersion = androidVersion;
        this.hasCamera = hasCamera;
        this.hasBluetooth = hasBluetooth;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    @Override
    public String toString() {
        return "Mi{" +
                "androidVersion='" + androidVersion + '\'' +
                ", hasCamera=" + hasCamera +
                ", hasBluetooth=" + hasBluetooth +
                '}';
    }
}
