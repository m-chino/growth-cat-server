package jp.gxp.growthcatserver.front.entity;

import java.util.Date;

public class Motion {

    private Date registerTimestamp;

    private Double accelerationmeter_x;

    private Double accelerationmeter_y;

    private Double accelerationmeter_z;

    private Double gyroscope_x;

    private Double gyroscope_y;

    private Double gyroscope_z;

    private Double magnetometer_x;

    private Double magnetometer_y;

    private Double magnetometer_z;

    private Double luxometer;

    public Date getRegisterTimestamp() {
        return registerTimestamp;
    }

    public void setRegisterTimestamp(Date registerTimestamp) {
        this.registerTimestamp = registerTimestamp;
    }

    public Double getAccelerationmeter_x() {
        return accelerationmeter_x;
    }

    public void setAccelerationmeter_x(Double accelerationmeter_x) {
        this.accelerationmeter_x = accelerationmeter_x;
    }

    public Double getAccelerationmeter_y() {
        return accelerationmeter_y;
    }

    public void setAccelerationmeter_y(Double accelerationmeter_y) {
        this.accelerationmeter_y = accelerationmeter_y;
    }

    public Double getAccelerationmeter_z() {
        return accelerationmeter_z;
    }

    public void setAccelerationmeter_z(Double accelerationmeter_z) {
        this.accelerationmeter_z = accelerationmeter_z;
    }

    public Double getGyroscope_x() {
        return gyroscope_x;
    }

    public void setGyroscope_x(Double gyroscope_x) {
        this.gyroscope_x = gyroscope_x;
    }

    public Double getGyroscope_y() {
        return gyroscope_y;
    }

    public void setGyroscope_y(Double gyroscope_y) {
        this.gyroscope_y = gyroscope_y;
    }

    public Double getGyroscope_z() {
        return gyroscope_z;
    }

    public void setGyroscope_z(Double gyroscope_z) {
        this.gyroscope_z = gyroscope_z;
    }

    public Double getMagnetometer_x() {
        return magnetometer_x;
    }

    public void setMagnetometer_x(Double magnetometer_x) {
        this.magnetometer_x = magnetometer_x;
    }

    public Double getMagnetometer_y() {
        return magnetometer_y;
    }

    public void setMagnetometer_y(Double magnetometer_y) {
        this.magnetometer_y = magnetometer_y;
    }

    public Double getMagnetometer_z() {
        return magnetometer_z;
    }

    public void setMagnetometer_z(Double magnetometer_z) {
        this.magnetometer_z = magnetometer_z;
    }

    public Double getLuxometer() {
        return luxometer;
    }

    public void setLuxometer(Double luxometer) {
        this.luxometer = luxometer;
    }
}
