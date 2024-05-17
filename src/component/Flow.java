package component;

import java.util.ArrayList;
import java.util.List;

public class Flow {
    private int weight;
    private double weightRecently;
    private List<Package> queue;
    private double lastDepartureTime;

    public Flow(int weight) {
        this.weight = weight;
        this.weightRecently = weight;
        this.queue = new ArrayList<>();
        this.lastDepartureTime = 0.0;
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public Package departPacket() {
        if (!queue.isEmpty()) {
            Package packet = queue.remove(0);
            lastDepartureTime += packet.getSize() / weightRecently;
            return packet;
        }
        return null;
    }

    public void addPacket(Package packet) {
        queue.add(packet);
    }

    public int updateNewSize() {
        if (!queue.isEmpty()) {
            int sizeBefore = this.queue.get(0).getSize();
            int time = weight;
            while(this.queue.get(0).getSize()!=0 && time>0){
            this.queue.get(0).setSize(sizeBefore - 1);
            time = time - 1;
            }
            return this.queue.get(0).getSize();
        }
        return -1; // Nếu không có gói tin nào trong hàng đợi, trả về -1
    }
}
