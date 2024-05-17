package component;
import java.util.ArrayList;
import java.util.Comparator;
public class QueueOutput {
    private  ArrayList<Package> queueOutput;

    public QueueOutput() {
        this.queueOutput = new ArrayList<>();
    }

    public void push(Package item) {
        queueOutput.add(item);
    }

    public boolean isEmpty() {
        return queueOutput.isEmpty();
    }

    public void printOrderPackages() {
        System.out.println("Size\tOrderTrans\tSource\tTime Trans\tTime out of Queue");
        for (Package pkg : queueOutput) {
            System.out.println(pkg.getSizeBefore()+"  "+pkg.getOrderTrans());
        }
    }
    public void sortByTime() {
        queueOutput.sort(Comparator.comparingDouble(Package::getTimeTrans));
    }
    public ArrayList<Package> getQueueOutput(){
        return this.queueOutput;
    }

}
