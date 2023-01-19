package class34;

public class TouchIDIphone extends BaseIphone {
    public TouchIDIphone(String iosVersion, int memoryInMg, String model, String color) {
        super(iosVersion, memoryInMg, model, color);
    }
    String fingerPrintData[] = {"text1", "text2","text3"};
    public boolean getUserTouchId(String userFingerPrint){
        boolean isUnlock = false;
        for(int i=0; i< fingerPrintData.length; i++){
            if(userFingerPrint.equalsIgnoreCase(fingerPrintData[i])){
                isUnlock=true;
            }
    }
        return isUnlock;



    }
}
