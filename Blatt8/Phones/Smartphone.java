public class Smartphone extends Mobilephone{
    int apps;

    public Smartphone (int contacts, int number, int apps){
        super(contacts, number);
    }

    public void installApp(){
        apps++;
        battery -= 5;
    }

    public void deinstallApp(){
        apps--;
        battery -= 2;
    }
}
