public class KEYBOARD {
    private String keyboardSpecs = "";
    private final String keyboardType;
    private final Boolean isBacklight;
    private final int weight;

    public KEYBOARD(String keyboardType, boolean isBacklight, int weight){
        this.keyboardSpecs = this.keyboardSpecs + keyboardSpecs;
        this.keyboardType = keyboardType;
        this.isBacklight = isBacklight;
        this.weight = weight;
    }
    public KEYBOARD setKeyboardType(String keyboardType) {
        return new KEYBOARD(keyboardType, isBacklight, weight);
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public KEYBOARD setScreenType(boolean isBacklight) {
        return new KEYBOARD(keyboardType, isBacklight, weight);
    }

    public boolean isBacklight() {
        return isBacklight;
    }

    public KEYBOARD setWeight(int weight) {
        return new KEYBOARD(keyboardType, isBacklight, weight);
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return keyboardSpecs = keyboardSpecs + "\n" + "Keyboard info: " +
                keyboardType + " Type" + " - " + isBacklight + " Backlight " + " - " +
                weight + "g";
    }
}
