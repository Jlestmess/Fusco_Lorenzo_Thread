public class Main {
    public static void main(String[] args) {
        System.out.println("INIZIO PRODUZIONE DEL LIBRO\n");

        //il thread padre inizia
        System.out.println("1) il thread padre prepara il macchinario per la produzione");
        System.out.println("2) il thread padre carica i materiali necessari\n");

        //blocco try catch per cattura eccezione
        try {
            //creazione di due thread figli
            Thread stampaThread = new Thread(new Stampa());
            Thread rilegaturaThread = new Thread(new Rilegatura());

            System.out.println("Avvio dei processi di STAMPA e RILEGATURA in parallelo\n");

            //avvio dei thread figli in modo parallelo
            stampaThread.start();
            rilegaturaThread.start();

            //con questo join il padre aspetta che i figli finiscano
            stampaThread.join();
            rilegaturaThread.join();

            //il thread padre riprende dopo il join
            System.out.println("\nTUTTI I LAVORI COMPLETATI");
            System.out.println("\n1) Controllo qualità finale del libro");
            System.out.println("2) Impacchetto il libro per la spedizione");
            System.out.println("\nPRODUZIONE DEL LIBRO COMPLETATA");

        } catch (InterruptedException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}
