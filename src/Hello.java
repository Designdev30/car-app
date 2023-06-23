


public class Hello {
    public static void main (String[] args) {
        // instantiating new constructor
        Car car = new Car();
        Destination destination = new Destination();

        car.setDoors("All doors closed");
        car.setMake ("BMW");
        car.setColor("Black");
        destination.setCali("Destination is California");
        car.setSpeed(15);
        car.setDriver("seated");
        

        

        // System.out.println(car.run);
        System.out.println(car.getMake());
        System.out.println(car.getColor());
        System.out.println(car.getDoors());
        System.out.println(car.getDriver());
        System.out.println(car.getSpeed());
        System.out.println(destination.getCali());
       
    }
}

