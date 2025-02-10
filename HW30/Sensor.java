public abstract class Sensor {
    private String name;
    private int modelNumber;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public abstract void recordMeasurement();
}
