public class Main {
    public static void main(String[] args) {
        Notifica email = new Email("mirko@example.com", "Ciao! Questo è un test di email.");
        Notifica sms = new Sms("1234567890", "Ciao! Questo è un test di SMS.");
        Notifica notificaApp = new NotificaApp("Mirko", "Ciao! Questa è una notifica dell'app.");

        email.invia();
        sms.invia();
        notificaApp.invia();
    }
}