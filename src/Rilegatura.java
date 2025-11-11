class Rilegatura implements Runnable {
    //implementa la classe runnable
    private String tipoRilegatura;

    public Rilegatura() {
        this.tipoRilegatura = "Rilegatura classica";
    }

    @Override
    public void run() {
        //blocco try catch per cattura di eventuali eccezioni
        try {
            System.out.println("Avvio processo di RILEGATURA:");
            Thread.sleep(2500);
            System.out.println("1) inizio a preparare la copertina");
            Thread.sleep(2500);
            System.out.println("2) applico la colla per " + tipoRilegatura);
            Thread.sleep(2500);
            System.out.println("3) finisco la rilegatura del libro");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}