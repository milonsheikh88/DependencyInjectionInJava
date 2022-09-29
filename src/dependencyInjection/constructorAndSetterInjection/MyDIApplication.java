package dependencyInjection.constructorAndSetterInjection;

import dependencyInjection.services.IMessageService;

public class MyDIApplication {
    private IMessageService iMessageService;

    MyDIApplication(IMessageService iMessageService){
        this.iMessageService=iMessageService;
    }

    public IMessageService getIMessageService() {
        return iMessageService;
    }

    public void setIMessageService(IMessageService iMessageService) {
        this.iMessageService = iMessageService;
    }

    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.iMessageService.sendMessage(msg, rec);
    }
}
