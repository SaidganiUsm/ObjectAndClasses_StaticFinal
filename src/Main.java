public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("Gaming build", "Msi",
                new CPU("4Ghz", 8, "Intel", 120),
                new RAM(4,256, 150),
                new ROM("SSD", 512, 160),
                new SCREEN(15.6, "IPS", 3560),
                new KEYBOARD("Mechanic", true, 120));
        System.out.println(comp);
        System.out.println();
        Computer comp1 = new Computer("Gaming build", "Msi",
                new CPU("5Ghz", 12, "Intel", 170),
                new RAM(3,64, 70),
                new ROM("SSD", 512, 160),
                new SCREEN(15.6, "IPS", 4060),
                new KEYBOARD("Mechanic", true, 120));
        System.out.println(comp1);
        System.out.println();
        Computer comp2 = new Computer("Gaming build", "Msi",
                new CPU("5Ghz", 12, "Intel", 170),
                new RAM(3,64, 70),
                new ROM("SSD", 512, 160),
                new SCREEN(15.6, "IPS", 4060),
                new KEYBOARD("Mechanic", true, 120));
        System.out.println(comp2);
        System.out.println();
        System.out.println("Total count of Computers" + Computer.getCount());
    }
}
