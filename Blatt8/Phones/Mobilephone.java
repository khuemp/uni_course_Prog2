public class Mobilephone{
    int contacts;
    int number;
    int battery;

    public Mobilephone(int contacts, int number){
        this.contacts = contacts;
        this.number = number;
        this.battery = 1500;
    }

    public void addContact(){
        contacts++;
        battery -= 2;
    }

    public void removeContact(){
        contacts--;
        battery -= 2;
    }
}