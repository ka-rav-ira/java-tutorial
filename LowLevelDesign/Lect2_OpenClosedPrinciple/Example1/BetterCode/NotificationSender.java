package LowLevelDesign.Lect2_OpenClosedPrinciple.Example1.BetterCode;

import java.util.*;

public class NotificationSender {

    public void sendNotifications(List<Notification> notifications) {
        for (Notification notification : notifications) {
            notification.send();
        }
    }
}
