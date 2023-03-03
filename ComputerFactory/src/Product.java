public class Product {
    private String model;
    private String manufacture;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacture) {
        this.model = model;
        this.manufacture = manufacture;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format(
                "Drawing pixel at %dx%d in color %s", x, y, color));
    }
}

class Monitor extends Product {
    private int size;
    private String resolution;
    public Monitor(String model, String manufacture) {
        super(model, manufacture);
    }

    public Monitor(String model, String manufacture, int size, String resolution) {
        super(model, manufacture);
        this.size = size;
        this.resolution = resolution;
    }
}
class Motherboard extends Product {
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacture) {
        super(model, manufacture);
    }

    public Motherboard(String model, String manufacture, int ramSlots, int cardSlots, String bios) {
        super(model, manufacture);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }
}
class ComputerCase extends Product {
    private String powerSupply;
    public ComputerCase(String model, String manufacture) {
        super(model, manufacture);
    }

    public ComputerCase(String model, String manufacture, String powerSupply) {
        super(model, manufacture);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
