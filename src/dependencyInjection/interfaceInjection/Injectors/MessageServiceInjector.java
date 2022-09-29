package dependencyInjection.interfaceInjection.Injectors;

import dependencyInjection.interfaceInjection.serviceConsumers.Consumer;

public interface MessageServiceInjector {
    public Consumer getConsumer();
}
