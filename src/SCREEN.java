public class SCREEN {
    private String screenSpecs = "";
    private final double screenDiagonal;
    private final String screenType;
    private final int weight;

    public SCREEN(double screenDiaganal, String screenType, int weight){
        this.screenSpecs = this.screenSpecs + screenSpecs;
        this.screenDiagonal = screenDiaganal;
        this.screenType = screenType;
        this.weight = weight;
    }
    public SCREEN setScreenDiagonal(double screenDiagonal) {
        return new SCREEN(screenDiagonal, screenType, weight);
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public SCREEN setScreenType(String screenType) {
        return new SCREEN(screenDiagonal, screenType, weight);
    }

    public String getScreenType() {
        return screenType;
    }

    public SCREEN setWeight(int weight) {
        return new SCREEN(screenDiagonal, screenType, weight);
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return screenSpecs = screenSpecs + "\n" + "Screen info: " +
                screenDiagonal + " Diagonal" + " - " + screenType + " Type " + " - " +
                weight + "g";
    }
}
