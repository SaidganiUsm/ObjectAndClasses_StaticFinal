public class CPU {
    private String cpuSpecs = "";
    private final String cpuFrequency;
    private final int cpuCores;
    private final String cpuProducer;
    private final int weight;

    public CPU(String cpuFrequency, int cpuCores, String cpuProducer, int weight) {
        this.cpuSpecs = this.cpuSpecs + cpuSpecs;
        this.cpuCores = cpuCores;
        this.cpuFrequency = cpuFrequency;
        this.cpuProducer = cpuProducer;
        this.weight = weight;
    }

    public CPU setCpuFrequency(String cpuFrequency) {
        return new CPU(cpuFrequency, cpuCores, cpuProducer, weight);
    }

    public String getCpuFrequency() {
        return cpuFrequency;
    }

    public CPU setCpuCores(int cpuCores) {
        return new CPU(cpuFrequency, cpuCores, cpuProducer, weight);
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public CPU setCpuProducer(String cpuProducer) {
        return new CPU(cpuFrequency, cpuCores, cpuProducer, weight);
    }

    public String getCpuProducer() {
        return cpuProducer;
    }

    public CPU setWeight(int weight) {
        return new CPU(cpuFrequency, cpuCores, cpuProducer, weight);
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return cpuSpecs = cpuSpecs + "\n" + "Cpu Info: " + cpuFrequency
                + " - " + cpuCores + " Cores - " + cpuProducer + " - " +
                weight + "g";
    }
}
