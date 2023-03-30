public interface FlightEnable {

    // public static final is redundant for interface fields
    double MILES_TO_KM = 1.60934;

    double KM_TO_MILES = 0.621371;

    void takeOff();

    void land();

    void fly();

//    FlightStages transition(FlightStages stage);
    default FlightStages transition(FlightStages stage) {

//        System.out.println("transition not implemented on "
//        + this.getClass().getName());
//        return null;
        FlightStages netStage = stage.getNetStage();
        System.out.println("Transitioning from " + stage + " to " + netStage);
        return netStage;
    }

}