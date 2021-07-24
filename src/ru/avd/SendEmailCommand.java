package ru.avd;

public class SendEmailCommand implements Command{
    private Notification notification;

    public SendEmailCommand(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void execute() {
        notification.emailNotification();
    }
}
