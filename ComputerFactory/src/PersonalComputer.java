public class PersonalComputer extends Product {
    private ComputerCase computerCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PersonalComputer(String model, String manufacture,
                            ComputerCase computerCase,
                            Motherboard motherboard, Monitor monitor) {
        super(model, manufacture);
        this.computerCase = computerCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 500, "yellow");
    }
    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
}
