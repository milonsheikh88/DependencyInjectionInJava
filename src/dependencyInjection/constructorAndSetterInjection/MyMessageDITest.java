package dependencyInjection.constructorAndSetterInjection;

import dependencyInjection.services.EmailServiceImpl;
import dependencyInjection.services.SMSServiceImpl;

public class MyMessageDITest {
    public static void main(String[] args) {
        MyDIApplication myDIApplication;

        /** Constructor injection */
        myDIApplication=new MyDIApplication(new EmailServiceImpl());
        myDIApplication.processMessages("Constructor", "user@abc.com");

        myDIApplication=new MyDIApplication(new SMSServiceImpl());
        myDIApplication.processMessages("Constructor", "01725336688");

        /** Setter injection */
        myDIApplication.setIMessageService(new EmailServiceImpl());
        myDIApplication.processMessages("Setter", "user@abc.com");

        myDIApplication.setIMessageService(new SMSServiceImpl());
        myDIApplication.processMessages("Setter", "01725336688");

    }
}
