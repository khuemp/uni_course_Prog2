package uhr;

import java.util.HashSet;

public class Main {
    
    public static void main(String[] args){
        HashSet<Lorex> uhren = new HashSet<Lorex>();
        Lorex r1 = new Lorex("Explorer", 5600, 500);
        Lorex r2 = new Lorex("Pre-Daytona", 12050, 700);

        uhren.add(r1);
        uhren.add(r2);
        System.out.println(uhren.contains(r1));
        System.out.println(uhren.contains(r2));

        r1.setPreis(4643);
        r2.setPreis(19040);
        System.out.println(uhren.contains(r1));
        System.out.println(uhren.contains(r2));
    }
}
