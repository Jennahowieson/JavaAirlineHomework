package Flight;

public enum PlaneType {
    BOEING747(20),
    PRIVATEJET (2);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity) {
        this.capacity = capacity;
        this.totalWeight = (capacity*30*2);
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}


