package clg;

public class FactoryMethod {

    interface Notification {
        void send();
    }

    static class EmailNotification implements Notification {
        @Override
        public void send() {
            System.out.println("sending email notif");
        }
    }

    static class SMSNotification implements Notification {
        @Override
        public void send() {
            System.out.println("sendin sms notif");
        }
    }

    static class PushNotification implements Notification {
        @Override
        public void send() {
            System.out.println("sendin push notif");
        }
    }

    static abstract class NotificationFactory {

        abstract Notification createNotification();

        public void notifyUser() {
            Notification notification = createNotification();
            notification.send();
        }
    }

    static class EmailFactory extends NotificationFactory {
        @Override
        Notification createNotification() {
            return new EmailNotification();
        }
    }

    static class SMSFactory extends NotificationFactory {
        @Override
        Notification createNotification() {
            return new SMSNotification();
        }
    }

    static class PushFactory extends NotificationFactory {
        @Override
        Notification createNotification() {
            return new PushNotification();
        }
    }

    public static void main(String[] args) {

        NotificationFactory factory;

        factory = new EmailFactory();
        factory.notifyUser();

        factory = new SMSFactory();
        factory.notifyUser();

        factory = new PushFactory();
        factory.notifyUser();
    }
}
