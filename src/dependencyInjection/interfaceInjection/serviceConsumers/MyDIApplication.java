package dependencyInjection.interfaceInjection.serviceConsumers;
import dependencyInjection.services.IMessageService;

public class MyDIApplication implements Consumer{

    private IMessageService service;

    public MyDIApplication(IMessageService svc){
        this.service=svc;
    }

    @Override
    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }

}