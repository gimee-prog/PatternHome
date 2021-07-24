package ru.avd;

public class Notification {
    public Notification() {
    }
    public void smsNotification(){
        System.out.println("Отправлено уведовмление в SMS");
    }
    public void emailNotification(){
        System.out.println("Отправлено уведомление по E-mail");
    }
    public void smsAndEmailNotification(){
        System.out.println("Отправлено уведомление в SMS и по E-mail");
    }
}
