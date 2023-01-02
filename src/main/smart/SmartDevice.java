package main.smart;

/**
 * @author {@link "mailto:ehernandez@eturia.es"}
 */
public abstract class SmartDevice {
    private String brand;
    private String model;
    private String size;
    private int weight;
    private String display;
    private String cpu;
    private String gpu;
    private String chip;
    private String os;
    private int ram;

    protected SmartDevice() {
    }

    protected SmartDevice(final String brand, final String model, final String size, final int weight,
                       final String display, final String cpu, final String gpu, final String chip, final String os,
                       final int ram) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.weight = weight;
        this.display = display;
        this.cpu = cpu;
        this.gpu = gpu;
        this.chip = chip;
        this.os = os;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(final String size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(final String display) {
        this.display = display;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(final String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(final String gpu) {
        this.gpu = gpu;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(final String chip) {
        this.chip = chip;
    }

    public String getOs() {
        return os;
    }

    public void setOs(final String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(final int ram) {
        this.ram = ram;
    }

}
