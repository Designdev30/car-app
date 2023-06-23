public class Car {
    private String doors;
    private String engine;
    private String color;
    private String make;
    private String driver;
    public int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public String getDoors() {
        return doors;
    }
    public void setDoors(String doors) {
        this.doors = doors;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String run() {
        if (doors.equals("closed") && engine.endsWith("on")
        && driver.equals ("seated") && speed >0 ){
        return "running";
    } else 
            return "not running";

    }
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
}
