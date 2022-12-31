public class Computer {
    private String compInfo = "";
    private final String name;
    private final String vendor;
    private static int count = 0;

    private double totalWeight = 0;
    public Computer(String name, String vendor, CPU cpu, RAM ram,ROM rom,
                    SCREEN screen, KEYBOARD keyboard) {
        increaseCount(1);
        compInfo = "List of computer parts: ";
        this.name = name;
        this.vendor = vendor;
        this.compInfo = this.compInfo + cpu + ram + rom + screen + keyboard;
        new CPU(cpu.getCpuFrequency(), cpu.getCpuCores(),
                cpu.getCpuProducer(), cpu.getWeight());
        new RAM(ram.getRamType(), ram.getRamSize(), ram.getWeight());
        new ROM(rom.getRomType(), rom.getRomSize(), rom.getWeight());
        new SCREEN(screen.getScreenDiagonal(), screen.getScreenType(),
                screen.getWeight());
        new KEYBOARD(keyboard.getKeyboardType(), keyboard.isBacklight(),
                keyboard.getWeight());
        this.totalWeight = totalWeight + cpu.getWeight() + ram.getWeight() +
                rom.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Computer.count = Computer.count + count;
    }

    public void print(String title){
        System.out.println(title);
    }
    public String toString() {
        return name + " - " + vendor + "\n" + compInfo +
                "\n" + "Total weigh is: " + totalWeight;
    }
}
