package component;

public class Package {
    private int sizeBefore;
    private int size;
    private int orderTrans;
    private int src;
    private double timeTrans;
    private double timeOutQueue;
    public double getTimeTrans() {
        return timeTrans;
    }
    public void setTimeTrans(double time) {
        this.timeTrans = time;
    }

    public Package(int size) {
        this.size = size;
        this.sizeBefore = size;
    }

    public int getSizeBefore() {
        return sizeBefore;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public int getOrderTrans() {
        return orderTrans;
    }

    public void setOrderTrans(int oderTrans) {
        this.orderTrans = oderTrans;
    }


    public double getTimeOutQueue() {
        return timeOutQueue;
    }

    public void setTimeOutQueue(double timeOutQueue) {
        this.timeOutQueue = timeOutQueue;
    }
}
