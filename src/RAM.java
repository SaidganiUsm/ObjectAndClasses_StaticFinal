public class RAM {
    private String ramSpecs = "";
    private final int ramType;
    private final int ramSize;
    private final int weight;

    public RAM(int ramType, int ramSize, int weight){
        this.ramSpecs = this.ramSpecs + ramSpecs;
        this.ramType = ramType;
        this.ramSize = ramSize;
        this.weight = weight;
    }
    public RAM setRamType(int ramType) {
        return new RAM(ramType, ramSize, weight);
    }

    public int getRamType() {
        return ramType;
    }

    public RAM setRamSize(int ramSize) {
        return new RAM(ramType, ramSize, weight);
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getWeight() {
        return weight;
    }

    public RAM setWeight(int weight) {
        return new RAM(ramType, ramSize, weight);
    }

    public String toString() {
        return ramSpecs = ramSpecs + "\n" + "Ram info: " + "ddr" +
                ramType + " Type" + " - " + ramSize + " Gb " + " - " +
                weight + "g";
    }
}
