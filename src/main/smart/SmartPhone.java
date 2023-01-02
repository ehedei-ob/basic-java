package main.smart;

import java.util.Arrays;

/**
 * @author {@link "mailto:ehernandez@eturia.es"}
 */
public class SmartPhone extends SmartDevice {
    private String camera;
    private String frontalCamera;
    private String[] sim;
    private String[] compatibleNetworks;

    public SmartPhone() {
    }

    public SmartPhone(final String brand, final String model, final String size, final int weight, final String display,
                      final String cpu, final String gpu, final String chip, final String os, final int ram,
                      final String camera, final String frontalCamera, final String[] sim,
                      final String[] compatibleNetworks) {
        super(brand, model, size, weight, display, cpu, gpu, chip, os, ram);
        this.camera = camera;
        this.frontalCamera = frontalCamera;
        this.sim = sim;
        this.compatibleNetworks = compatibleNetworks;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(final String camera) {
        this.camera = camera;
    }

    public String getFrontalCamera() {
        return frontalCamera;
    }

    public void setFrontalCamera(final String frontalCamera) {
        this.frontalCamera = frontalCamera;
    }

    public String[] getSim() {
        return sim;
    }

    public void setSim(final String[] sim) {
        this.sim = sim;
    }

    public String[] getCompatibleNetworks() {
        return compatibleNetworks;
    }

    public void setCompatibleNetworks(final String[] compatibleNetworks) {
        this.compatibleNetworks = compatibleNetworks;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
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
                ", camera='" + camera + '\'' +
                ", frontalCamera='" + frontalCamera + '\'' +
                ", sim=" + Arrays.toString(sim) +
                ", compatibleNetworks=" + Arrays.toString(compatibleNetworks) +
                '}';

    }
}
