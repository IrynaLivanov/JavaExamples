package project7;

public class Address {
    public static void main(String[] args) {


        String address = "2400 E Devon Ave #215, Des Plaines, IL 60018";

        //TODO WRITE YOUR CODE HERE
        System.out.println("Your address is " + getStreetAddress(address));
        System.out.println("Your city is " + getCity(address));
        System.out.println("Your state is " + getState(address));
        System.out.println("Your ZIP is " + getZipcode(address));

    }


    // TODO IMPLEMENT ALL METHODS
    public static String getStreetAddress(String address) {
        int comma = address.indexOf(',');

        return address.substring(0, comma);
    }


    public static String getCity(String address) {
        int lastcomma = address.lastIndexOf(',');
        int comma = address.indexOf(',');
        return address.substring(comma + 2, lastcomma);
    }

    public static String getState(String address) {
        int lastcomma = address.lastIndexOf(',');
        int lastblank = address.lastIndexOf(" ");
        return address.substring(lastcomma + 2, lastblank);
    }

    public static int getZipcode(String address) {
        int lastblank = address.lastIndexOf(" ");


        return Integer.parseInt(address.substring(lastblank + 1));
    }

}


