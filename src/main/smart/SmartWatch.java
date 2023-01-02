package main.smart;

import java.util.Arrays;

/**
 * @author {@link "mailto:ehernandez@eturia.es"}
 */
public class SmartWatch extends SmartDevice {
    private String[] vitalInputs;

    public SmartWatch() {
    }

    public SmartWatch(final String brand, final String model, final String size, final int weight, final String display,
                      final String cpu, final String gpu, final String chip, final String os, final int ram,
                      final String[] vitalInputs) {
        super(brand, model, size, weight, display, cpu, gpu, chip, os, ram);
        this.vitalInputs = vitalInputs;
    }

    public String[] getVitalInputs() {
        return vitalInputs;
    }

    public void setVitalInputs(final String[] vitalInputs) {
        this.vitalInputs = vitalInputs;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", size='" + getSize() + '\'' +
                ", weight=" + getWeight() +
                ", display='" + getDisplay() + '\'' +
                ", cpu='" + getCpu() + '\'' +
                ", gpu='" + getGpu() + '\'' +
                ", chip='" + getChip() + '\'' +
                ", os='" + getOs() + '\'' +
                ", ram=" + getRam() +
                ", vitalInputs=" + Arrays.toString(vitalInputs) +
                '}';
    }
}
