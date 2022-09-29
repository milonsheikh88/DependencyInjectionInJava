package dependencyInjection.interfaceInjection;

import dependencyInjection.interfaceInjection.Injectors.EmailServiceInjector;
import dependencyInjection.interfaceInjection.Injectors.MessageServiceInjector;
import dependencyInjection.interfaceInjection.Injectors.SMSServiceInjector;
import dependencyInjection.interfaceInjection.serviceConsumers.Consumer;

public class MyMessageDITest {

    public static void main(String[] args) {
        MessageServiceInjector injector;
        Consumer app;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages("Interface Injection", "user@abc.com");

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages("Interface Injection", "01725336688");
    }
}
