package class342;

public class BaseIphone {
    private String model;
    private int memoryInMg;
    private String color;
    private String iOSVersion;
    public BaseIphone(String model, int memoryInMg, String color, String iOSVersion) {
        this.model = model;
        this.memoryInMg = memoryInMg;
        this.color = color;
        this.iOSVersion = iOSVersion;
    }
    public String writeAMessage(String messages) {
        return messages;
    }
    public String writeAnote(String note) {
        return note;
    }
}
