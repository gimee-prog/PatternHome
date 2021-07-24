package ru.avd;

public class SendSmsEmailCommand implements Command{
    Notification notification;

    public SendSmsEmailCommand(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void execute() {
        notification.smsAndEmailNotification();
    }
}
