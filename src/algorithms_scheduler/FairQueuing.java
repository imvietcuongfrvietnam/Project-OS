package algorithms_scheduler;

import component.Flow;
import component.Package;
import component.QueueOutput;

import java.util.ArrayList;

public class FairQueuing {

    public static void simulationFairQueuing(ArrayList<Flow> flows, double throughput) throws InterruptedException {
        QueueOutput queueOutput = new QueueOutput();
        int orderTrans = 0;
        double time = 0.0;

        // Thêm gói vào queueOutput từ mỗi luồng flow
        for (int i = 0; i < flows.size(); i++) {
            Flow flow = flows.get(i);
            if (!flow.isEmpty()) {
                Package pkg = flow.departPacket();
                pkg.setSrc(i); // Đặt nguồn cho gói
                queueOutput.push(pkg);
            }
        }
        queueOutput.sortByTime();

        // Thiết lập thông tin cho từng gói trong queueOutput
        while(!queueOutput.isEmpty()) {
            for (Package pkg : queueOutput.getQueueOutput()) {
                pkg.setOrderTrans(++orderTrans);
                pkg.setTimeTrans(pkg.getSize() / throughput);
                time += pkg.getTimeTrans();
                pkg.setTimeOutQueue(time);
            }
        }
        // In ra thứ tự của các gói
        queueOutput.printOrderPackages();
    }
}
