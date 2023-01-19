package class34;

public class BaseIphone {

    //Parameters of a class

    private String iosVersion;
    private int memoryInMg;

    private String model;
    private String color;


    //contructors that initializes all parameters
    public BaseIphone(String iosVersion, int memoryInMg, String model, String color) {
        this.iosVersion = iosVersion;
        this.memoryInMg = memoryInMg;
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }

    public int getMemoryInMg() {
        return memoryInMg;
    }

    public void setMemoryInMg(int memoryInMg) {
        this.memoryInMg = memoryInMg;
    }
    @Override
        public String toString () {
            return "BaseIphone{" +
                    "iOSVersion='" + iosVersion + '\'' +
                    ", memoryInMg=" + memoryInMg + '\'' + ", color=' " + color + '\'' +
                    '}';
        }
    }


