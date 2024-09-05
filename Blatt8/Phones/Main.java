public class Main {
    public static void main (String [] args){
        Mobilephone myPhone1 = new Mobilephone(10,15);
        for(int i = 0; i<3; i++){
            myPhone1.addContact();
            System.out.println("Your battery is: " + myPhone1.battery + "\tYou have " + myPhone1.contacts + " contact(s).");
        }
 
        Smartphone myPhone2 = new Smartphone(10, 12, 5);
        for(int i = 0; i<3; i++){
            myPhone2.installApp();
            System.out.println("Your battery is: " + myPhone2.battery + "\tYou have " + myPhone2.apps + " app(s).");
        }
    }
}
