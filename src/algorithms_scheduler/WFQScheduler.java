package algorithms_scheduler;

import component.Flow;
import component.Package;
import component.QueueOutput;

import java.util.ArrayList;

public class WFQScheduler {
    private static int order = 0;

    public static void simulationWFQ(ArrayList<Flow> flows) {
        QueueOutput queueOutput = new QueueOutput();
        int count = 0;

        while (true) {
            for (Flow flow : flows) {
                if (!flow.isEmpty()) {
                    int t = flow.updateNewSize();
                    if (t <= 0) { // Sửa điều kiện so sánh cho đúng
                        Package pkg = flow.departPacket();
                        if (pkg != null) {
                            pkg.setOrderTrans(++order);
                            queueOutput.push(pkg);
                        }
                    }
                }
            }
            count = 0;
            for (Flow flow : flows) {
                if (flow.isEmpty()) count++;
            }
            if (count == flows.size()) break;
        }
        queueOutput.printOrderPackages();
    }
}
