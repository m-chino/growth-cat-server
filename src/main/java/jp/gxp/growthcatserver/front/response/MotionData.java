package jp.gxp.growthcatserver.front.response;

public class MotionData {
    private String registerTimestamp;

    private double accelerationmeter_x;

    private double accelerationmeter_y;

    private double accelerationmeter_z;

    private double gyroscope_x;

    private double gyroscope_y;

    private double gyroscope_z;

    private double magnetometer_x;

    private double magnetometer_y;

    private double magnetometer_z;

    private double luxometer;

    public String getRegisterTimestamp() {
        return registerTimestamp;
    }

    public void setRegisterTimestamp(String registerTimestamp) {
        this.registerTimestamp = registerTimestamp;
    }

    public double getAccelerationmeter_x() {
        return accelerationmeter_x;
    }

    public void setAccelerationmeter_x(double accelerationmeter_x) {
        this.accelerationmeter_x = accelerationmeter_x;
    }

    public double getAccelerationmeter_y() {
        return accelerationmeter_y;
    }

    public void setAccelerationmeter_y(double accelerationmeter_y) {
        this.accelerationmeter_y = accelerationmeter_y;
    }

    public double getAccelerationmeter_z() {
        return accelerationmeter_z;
    }

    public void setAccelerationmeter_z(double accelerationmeter_z) {
        this.accelerationmeter_z = accelerationmeter_z;
    }

    public double getGyroscope_x() {
        return gyroscope_x;
    }

    public void setGyroscope_x(double gyroscope_x) {
        this.gyroscope_x = gyroscope_x;
    }

    public double getGyroscope_y() {
        return gyroscope_y;
    }

    public void setGyroscope_y(double gyroscope_y) {
        this.gyroscope_y = gyroscope_y;
    }

    public double getGyroscope_z() {
        return gyroscope_z;
    }

    public void setGyroscope_z(double gyroscope_z) {
        this.gyroscope_z = gyroscope_z;
    }

    public double getMagnetometer_x() {
        return magnetometer_x;
    }

    public void setMagnetometer_x(double magnetometer_x) {
        this.magnetometer_x = magnetometer_x;
    }

    public double getMagnetometer_y() {
        return magnetometer_y;
    }

    public void setMagnetometer_y(double magnetometer_y) {
        this.magnetometer_y = magnetometer_y;
    }

    public double getMagnetometer_z() {
        return magnetometer_z;
    }

    public void setMagnetometer_z(double magnetometer_z) {
        this.magnetometer_z = magnetometer_z;
    }

    public double getLuxometer() {
        return luxometer;
    }

    public void setLuxometer(double luxometer) {
        this.luxometer = luxometer;
    }
}
