package kuh;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kuh implements Comparable<Kuh> {
    private String name = "";
    private int fleckenAnzahl = 0;

    public Kuh(String name, int numSpots) {
        assert name != null;
        this.name = name;
        this.fleckenAnzahl = numSpots;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Kuh)) {
            return false;
        }
        Kuh kuh = (Kuh) object;
        return (this.name.equals(kuh.name)) && this.fleckenAnzahl == kuh.fleckenAnzahl;
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + fleckenAnzahl; 
        //pick randomly as long as hashCode of equal Cows (identical name and fleckenAnzahl) are the same  
        //name.hashCode() uses Java's hashCode
    }

    @Override
    public int compareTo(Kuh kuh) {
        if (fleckenAnzahl == kuh.fleckenAnzahl) {
            return name.compareTo(kuh.name);
        }

        return fleckenAnzahl - kuh.fleckenAnzahl;
    }

    public Kuh doppelteKuh(List<Kuh> kuehe) {
        Collections.sort(kuehe);
        for (int i = 1; i < kuehe.size(); i++) {
            if (kuehe.get(i).equals(kuehe.get(i - 1))) {
                return kuehe.get(i);
            }
        }
        return null;
    }

    public Kuh effizienteDoppelteKuh(List<Kuh> kuehe){
        Set<Kuh> set = new HashSet<>();
        for(Kuh kuh : kuehe){
            if(set.contains(kuh)){
                return kuh;
            }
            set.add(kuh);
        }
        return null;
    }
}
