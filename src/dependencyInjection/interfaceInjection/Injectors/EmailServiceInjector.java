package dependencyInjection.interfaceInjection.Injectors;

import dependencyInjection.interfaceInjection.serviceConsumers.Consumer;
import dependencyInjection.interfaceInjection.serviceConsumers.MyDIApplication;
import dependencyInjection.services.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }

}
