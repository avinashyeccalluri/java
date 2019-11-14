public class PC{
    private Case thecase;
    private Moniter monitor;
    private Motherboard motherboard;

    public PC(Case thecase, Moniter monitor, Motherboard motherboard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getThecase() {
        return thecase;
    }

    public Moniter getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}