package uhr;

public class Lorex {
    String name;
    int preis;
    int goldantiel;

    public Lorex(String name, int preis, int goldantiel) {
        this.goldantiel = goldantiel;
        this.preis = preis;
        this.name = name;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Lorex other = (Lorex) obj;
        if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
        // return (goldantiel + preis) % 10;
    }
}
