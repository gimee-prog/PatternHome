package ru.avd;

public class Main {

    public static void main(String[] args) {
	Notification notification = new Notification();
	SendService sendService = new SendService(
	        new SendSmsCommand(notification),
            new SendEmailCommand(notification),
            new SendSmsEmailCommand(notification));
	sendService.sendSms();
	sendService.sendEmail();
	sendService.sendSmsAndEmail();
    }
}
