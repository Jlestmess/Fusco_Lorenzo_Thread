class Stampa implements Runnable {
    //implementa la classe runnable
    private int numeroPagine;

    public Stampa() {
        this.numeroPagine = 200;
    }

    @Override
    public void run() {
        //blocco try catch per cattura di eventuali eccezioni
        try {
            System.out.println("Avvio processo di STAMPA:");
            Thread.sleep(2500);
            System.out.println("1) inizio a stampare le pagine");
            Thread.sleep(2500);
            System.out.println("2) stampo pagina 1, 2, 3...");
            Thread.sleep(2500);
            System.out.println("3) finisco di stampare " + numeroPagine + " pagine");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}