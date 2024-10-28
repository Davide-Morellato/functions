public class App {
    
    /*
    * FUNCTIONS -> ogni funzione scritta all'interno di una classe è un METODO:
    *
    * sono blocchi di codice che possono essere richiamati più volte qualora si deve eseguire quell'istruzione
    * 
    * sono esterne alla funzione 'main'
    * 
    * in base a dove deve essere invocata è necessario applicarne il tipo.
    * In un contesto di funzione static (main), per invocare la funzione dichiarata, è necessario applicare anche davanti ad essa static
    * 
    * PARAMETRI
    * sono dati (tipizzati) in entrata, passati al metodo per essere letti in modo dinamico,
    * cioè che possono cambiare in base al dato che si dovrà usare quando il metodo verrà invocato
    */


    public static void main(String[] args){
        //2. invoco la funzione (con Run stampa nel terminale l'istruzione)
        doSomething();

        //invoco la funzione e gli passo il dato per essere elaborato
        //il dato ("pasta al sugo") verrà elaborato come parametro e richiamato nel metodo per essere passato nel blocco di codice
        cookPasta("pasta al sugo");

        //invoco la funzione e gli passo i parametri
        addition(4, 5);

        //salvo in una variabile il risultato atteso dall'invocazione del metodo SUM
        int total = sum(9, 5);
        System.out.println("CON RETURN: " + total);

        //invoco l'OVERLOADED METHODS
        //1.
        int result = howMuch(698, 541, 51);
        System.out.println("Overloaded calc: " + result);
        //
        //2.
        double finance = howMuch(1.23548, 12.1458962);
        System.out.println("Overloaded res: " + finance);

    }


    //
    //1. dichiaro una funzione esplicitando il tipo
    //NB -> void = vuota -> NON RITORNA NULLA MA SVOLGE DELLE ISTRUZIONI (manca il return)
    static void doSomething(){
        System.out.println("SENZA PARAMETRO: " + "fai qualcosa");
    }

    //dichiaro una funzione esplicitando il tipo
    //dichiaro il Tipo di Dato da passare al metodo
    static void cookPasta(String cibo){
        System.out.println("CON PARAMETRO: cuoci " + cibo);
    }

    //dichiaro una funzione
    //NON RESTITUISCE UN VALORE NEL CODICE,
    //MA RESTA ALL'INTERNO DEL METODO 
    static void addition(int a, int b){
        int sum = a + b; //dichiaro l'istruzione
        System.out.println("CON PARAMETRO MA SENZA RETURN: " + sum); //stampo l'istruzione non restituendo alcun valore
    }

    
    //PER RESTITUIRE ALL'ESTERNO IL VALORE ELABORATO DAL METODO, E' NECESSARIO IL RETURN
    //IN QUESTO CASO E' FONDAMENTALE TIPIZZARE ANCHE IL METODO
    static int sum(int a, int b){
        int add = a + b; //dichiaro l'istruzione
        return add; //restituisco il valore
    }


    //////////////////////////
    /*
     * OVERLOADED METHODS
     * sono metodi il cui nome può essere ripetuto più volte, purché le 'signature' (combinazioni di parametri) siano differenti
     */

    //dichiaro un metodo
    static int howMuch(int a, int b, int c){
        int calc = (a - b) * c;
        return calc;
    }

    //dichiaro un metodo con lo stesso nome del precedente, ma diversa signature
    static double howMuch(double a, double b){
        double res = a * b;
        return res;
    }
}
