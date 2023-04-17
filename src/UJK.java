class UJK extends Uczelnia{
        private String dziekanat;

        public UJK(String id, String nazwa, String miejscowosc, String dziekanat) {
            super(id, nazwa, miejscowosc);
            this.dziekanat = dziekanat;
        }

    public UJK (){}

    public String getDziekanat() {
        return dziekanat;
    }

    public void setDziekanat(String dziekanat) {
        this.dziekanat = dziekanat;

    }

    @Override
    public String toString() {
        return super.toString() + ", dziekanat='" + dziekanat + "'}";
    }
}
