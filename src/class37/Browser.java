package class37;

public interface Browser {
    void closeBrowser();
    void openIncognito();

}
interface WebBrowser extends Browser{
    void fullScreen();
}

interface MobileBrowser extends Browser {
    void supportRotation();
}

class Chrome implements WebBrowser, MobileBrowser {

    @Override
    public void closeBrowser() {

    }

    @Override
    public void openIncognito() {
        System.out.println("CNTR + Shift + T");

    }

    @Override
    public void supportRotation() {

    }

    @Override
    public void fullScreen() {

    }
}