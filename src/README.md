# Produzione Libri

## Descrizione del Progetto

Questo progetto Java simula un processo industriale di produzione di libri utilizzando i **thread**. Il sistema implementa un sistema padre-figli dove il thread principale (padre) crea due processi paralleli (figli): la **stampa** delle pagine e la **rilegatura** del libro.

## Obiettivi

-   Utilizza i **thread** in **Java**
-   Usa la **sincronizzazione** tra thread con `join()`
-   Esegue processi industriali **paralleli** con `sleep()`

## Architettura del codice

Il progetto è formato da 3 classi:

### 1. **Main.java**

Classe principale che contiene il **thread padre**, gestisce:

-   Preparazione del macchinario
-   Creazione e avvio dei thread figli
-   Sincronizzazione dei thread figli tramite `join()`
-   Controllo qualità e impacchettamento finale

### 2. **Stampa.java**

**Thread figlio** che implementa `Runnable` per il processo di stampa:

-   **Attributo**: `numeroPagine` (int) - contiene il numero di pagine da stampare
-   **Metodo**: `run()` - esegue il processo di stampa del libro

### 3. **Rilegatura.java**

**Thread figlio** che implementa `Runnable` per il processo di rilegatura:

-   **Attributo**: `tipoRilegatura` - specifica il tipo di rilegatura utilizzata
-   **Metodo**: `run()` - esegue il processo di rilegatura

## Flusso di Esecuzione

1.  **Thread Padre** inizia la produzione preparando il macchinario e i materiali
3.  Il Thread Padre **avvia in parallelo** di due thread figli:
    -   Thread Stampa
    -   Thread Rilegatura
4.  **Sincronizzazione**: Il padre attende il completamento dei figli con `join()`.
5.  Il **Thread Padre** riprende e finisce le sue istruzioni eseguendo controllo qualità e impacchettamento
6.  Fine produzione

## Output Atteso

```
INIZIO PRODUZIONE DEL LIBRO

1) il thread padre prepara il macchinario per la produzione
2) il thread padre carica i materiali necessari

Avvio dei processi di STAMPA e RILEGATURA in parallelo

Avvio processo di STAMPA:
Avvio processo di RILEGATURA:
1) inizio a stampare le pagine
1) inizio a preparare la copertina
2) stampo pagina 1, 2, 3...
2) applico la colla per Rilegatura classica
3) finisco di stampare 200 pagine
3) finisco la rilegatura del libro

TUTTI I LAVORI COMPLETATI

1) Controllo qualità finale del libro
2) Impacchetto il libro per la spedizione

PRODUZIONE DEL LIBRO COMPLETATA
```

## Strumenti principali utilizzati

### Thread.sleep()

Utilizzato per aggiungere un **tempo** di esecuzione dei processi industriali (2,5 secondi)

### Thread.join()

Garantisce che il thread padre **attenda** il **completamento** di entrambi i thread **figli** prima di procedere con le operazioni finali.

### Runnable Interface

Le classi `Stampa` e `Rilegatura` implementano l'interfaccia `Runnable`.