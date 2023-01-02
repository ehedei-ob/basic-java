package main;

import main.smart.SmartDevice;
import main.smart.SmartPhone;
import main.smart.SmartWatch;

/**
 * @author {@link "mailto:ehernandez@eturia.es"}
 */
public class Main {
    public static void main(String[] args) {
        final SmartDevice[] smartDevices = new SmartDevice[2];
        smartDevices[0] = new SmartPhone("Samsung", "Galaxy A12", "164 x 75.8 x 8.9 mm", 205,
                "60Hz refresh rate, IPS LCD 720×1600, 6.5 in (170 mm), 20:9 ratio, ~85.8% screen-to-body ratio, ~270 ppi density",
                "Octa-core: 4x2.35 GHz Cortex-A53 & 4x1.8 GHz Cortex-A53", "PowerVR GE8320", "Samsung Exynos 850",
                "One UI Core 5.0 over Android 13", 6144, "48 MP f/2.0, 26mm wide (AF), 5 MP f/2.2 123° ultrawide, 2 MP f/2.4 macro, 2 MP f/2.4 depth sensor",
                "8 MP f/2.2", new String[]{"Nano SIM", "Nano Sim"}, new String[] {"2G", "3G", "4G"});
        smartDevices[1] = new SmartWatch("Apple", "Watch Ultra", "40 x 44 x 14.4 mm", 61, "Always-On Retina LTPO OLED 410 x 502, 2000 nits",
                "S8 SiP with 64-bit dual-core processor", "PowerVR", "U1", "WatchOS 9.0", 2048,
                new String[]{"Third-generation optical heart sensor", "Fall Detection", "Compass", "Noise Monitoring",
                "Blood oxygen sensor", "Electrical heart"});

        for (SmartDevice smartDevice: smartDevices) {
            System.out.println(smartDevice);
        }
    }
}