package dependencyInjection.interfaceInjection.Injectors;

import dependencyInjection.interfaceInjection.serviceConsumers.Consumer;
import dependencyInjection.interfaceInjection.serviceConsumers.MyDIApplication;
import dependencyInjection.services.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }

}