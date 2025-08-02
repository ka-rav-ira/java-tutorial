package LowLevelDesign.Lect2_OpenClosedPrinciple.Example1.ProblematicCode;

public enum NotificationType {
    SMS,
    EMAIL,
    WHATSAPP;

    public void sendSMSNotification() {
        System.out.println("Sending SMS notification");
    }

    public void sendEmailNotification() {
        System.out.println("Sending Email notification");
    }
    public void sendWhatsAppNotification() {
        System.out.println("Sending WhatsApp notification");
    }

}
