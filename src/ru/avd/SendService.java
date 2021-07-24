package ru.avd;

public class SendService {
    Command sms;
    Command email;
    Command smsAndEmail;

    public SendService(Command sms, Command email, Command smsAndEmail) {
        this.sms = sms;
        this.email = email;
        this.smsAndEmail = smsAndEmail;
    }

    public void sendSms(){
        sms.execute();
    }
    public void sendEmail(){
        email.execute();
    }
    public void sendSmsAndEmail(){
        smsAndEmail.execute();
    }
}
