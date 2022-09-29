package hardCoded;

public class MyApplication {

    private EmailService email = new EmailService();

    /** When we implement SMSService we need to modify The MyApplication Class*/
    private SMSService sms = new SMSService();

    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.email.sendEmail(msg, rec);
    }

    public void processMessages1(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.sms.sendSMS(msg, rec);
    }
}
