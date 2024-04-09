package Lesson2_OpenClosedPrinciple.Example1.ProblematicCode;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<NotificationType> notificationTypes) {
        for(NotificationType type: notificationTypes) {
            if(type == NotificationType.SMS) {
                type.sendSMSNotification();
            }
            else if(type == NotificationType.EMAIL) {
                type.sendEmailNotification();
            }
            else if(type == NotificationType.WHATSAPP) {
                type.sendWhatsappNotification();
            }
        }
    }
}

/**
 * Problems in the above code that are not satisfying the Open closed principle
 * 1-> if in future more NotificationType is added the above code needs to be changed
       which actually shows the potential problem of extensibility
 * Solution: create one abstract class Notification which contains the send() methodd
 *           now create the concrete classes like EmailNotification , SmsNotification
 *           etc. which implements the abstract class Notification .
 *
 *           Now in the sender class we can pass the List of abstract class Notification
 *           now iterate through each object and call the send method.
 *
 * Implementation: the implementation is provided in the betterCode folder
 */
