package Lesson2_OpenClosedPrinciple.Example1.BetterCode;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<Notification> notifications) {
        for(Notification noti: notifications) {
            noti.send();
        }
    }
}
