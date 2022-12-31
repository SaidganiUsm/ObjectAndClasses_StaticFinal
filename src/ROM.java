public class ROM {
    private String romSpecs = "";
    private final String romType;
    private final int romSize;
    private final int weight;

    public ROM(String romType, int romSize, int weight){
        this.romSpecs = this.romSpecs + romSpecs;
        this.romType = romType;
        this.romSize = romSize;
        this.weight = weight;
    }
    public ROM setRamType(String romType) {
        return new ROM(romType, romSize, weight);
    }

    public String getRomType() {
        return romType;
    }

    public ROM setRomSize(int romSize) {
        return new ROM(romType, romSize, weight);
    }

    public int getRomSize() {
        return romSize;
    }

    public ROM setWeight(int weight) {
        return new ROM(romType, romSize, weight);
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return romSpecs = romSpecs + "\n" + "Rom info: " +
                romType + " Type" + " - " + romSize + " Gb " + " - " +
                weight + "g";
    }
}
