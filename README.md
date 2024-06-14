# esercizioTest
Esercizio:

Crea una repository e versiona il seguente esercizio in ogni passaggio con titolo dei commit:

 Sistema di Notifiche
Problema: Si desidera implementare un sistema di notifiche per un'applicazione. Le notifiche possono essere di diversi tipi (email, SMS, notifica in-app) e ogni tipo di notifica ha un suo specifico modo di essere inviato. Tuttavia, tutte le notifiche condividono alcune proprietà comuni come il destinatario e il messaggio.
Obiettivo: Utilizzare l'astrazione per progettare e implementare la struttura delle classi per questo sistema di notifiche.
Descrizione del codice

Classe Astratta Notifica:
Crea una classe astratta Notifica con due attributi protetti: destinatario e messaggio.
Definisci un costruttore per inizializzare questi attributi.
Aggiungi un metodo astratto invia() che sarà implementato dalle sottoclassi per inviare la notifica.

Sottoclassi Concretes:
Implementa diverse sottoclassi per Notifica, come Email, SMS, e NotificaApp.
Ogni sottoclasse dovrebbe implementare Invia come un metodo con un tipo di ritorno diverso