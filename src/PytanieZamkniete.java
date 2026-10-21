public abstract class PytanieZamkniete extends Pytanie {
    public abstract boolean sprawdz();
    private String trescOdpA, trescOdpB, trescOdpC;
    char poprawnaOdp;

    public PytanieZamkniete(String trescPytania, String nazwaZdjecia, String trescOdpA, String trescOdpB, String trescOdpC, char poprawnaOdp) {
        super(trescPytania, nazwaZdjecia);
        this.trescOdpA = trescOdpA;
        this.trescOdpB = trescOdpB;
        this.trescOdpC = trescOdpC;
        this.poprawnaOdp = poprawnaOdp;
    }
}
