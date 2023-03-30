public enum FlightStages implements Trackable {

    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;

    @Override
    public void track() {

        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNetStage() {

        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];

    }

}
