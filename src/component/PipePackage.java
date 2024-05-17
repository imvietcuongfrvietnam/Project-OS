package component;

public class PipePackage {
    private int Throughput;

    public int getThroughput() {
        return Throughput;
    }

    public void setThroughput(int throughput) {
        Throughput = throughput;
    }

    public PipePackage(int throughput) {
        Throughput = throughput;
    }
}
