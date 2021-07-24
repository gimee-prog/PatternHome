package ru.avd;

public class SendSmsCommand implements Command{
    private Notification notification;
    public SendSmsCommand(Notification notification){
        this.notification = notification;
    }
    @Override
    public void execute() {
        notification.smsNotification();
    }
}
