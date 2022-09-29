package hardCoded;

public class MyLegacyTest {
    public static void main(String[] args) {
        MyApplication app = new MyApplication();

        app.processMessages("Welcome Mail User", "user@abc.com");
        app.processMessages1("Welcome Mobile User", "01725336688");
    }
}
