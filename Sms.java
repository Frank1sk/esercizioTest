class Sms extends Notifica {
    public Sms(String destinatario, String messaggio) {
        super(destinatario, messaggio);
    }

    @Override
    public void invia() {
        
        System.out.println("SMS inviato a " + destinatario + " con messaggio: " + messaggio);
    }
}