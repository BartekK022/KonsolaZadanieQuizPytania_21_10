public abstract class Pytanie {

    public abstract boolean sprawdzOdp(char odp);
    private String trescPytania;
    private String nazwaZdjecia;
    private boolean czyPoprawna;

    public Pytanie(String trescPytania, String nazwaZdjecia) {
        this.trescPytania = trescPytania;
        this.nazwaZdjecia = nazwaZdjecia;
        czyPoprawna = false;
    }


}
