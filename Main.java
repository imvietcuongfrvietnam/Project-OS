import algorithms_scheduler.WFQScheduler;
import component.Flow;
import component.Package;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách các luồng và gói tin
        ArrayList<Flow> flows = new ArrayList<>();
        flows.add(new Flow(1)); // Luồng 1
        flows.add(new Flow(2)); // Luồng 2
        flows.add(new Flow(1)); // Luồng 3

        // Thêm gói tin vào từng luồng
        flows.get(0).addPacket(new Package(350));
        flows.get(1).addPacket(new Package(600));
        flows.get(1).addPacket(new Package(40));
        flows.get(2).addPacket(new Package(450));

        // Run the WFQ simulation
        WFQScheduler.simulationWFQ(flows);
    }
}
