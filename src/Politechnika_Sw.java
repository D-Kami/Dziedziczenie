class Politechnika_Sw extends Uczelnia{

    private String kierunki;

    public Politechnika_Sw(String id, String nazwa, String miejscowosc, String kierunki) {
        super(id, nazwa, miejscowosc);
        this.kierunki = kierunki;
    }

    public Politechnika_Sw (){}

    public String getKierunki() {
        return kierunki;
    }

    public void setKierunki(String kierunki) {
        this.kierunki = kierunki;
    }

    @Override
    public String toString() {
        return super.toString() + ", kierunki='" + kierunki + "'}";
    }
}
