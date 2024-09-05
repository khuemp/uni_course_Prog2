public class Main {
    public static void main(String[] args){
        WoodenFurniture[] myFurniture = new WoodenFurniture[3];
        myFurniture[0] = new WoodenChair((byte) 1, 333.0f, 5.0f, (byte) 3, (byte) 1);
        myFurniture[1] = new WoodenTable((byte) 2, 4.0f, 4.2f, (byte) 1, (byte) 4, (byte) 2);
        myFurniture[2] = new WoodenCabinet((byte) 0, 1000.0f, 3.1416f, (byte) 0, (byte) 2);

        System.out.println("My furniture:");
        for(WoodenFurniture f: myFurniture){
            System.out.println(f);
        }
        System.out.println("Price for all: " + sumOfPieces(myFurniture));
    }

    public static int sumOfPieces (WoodenFurniture[] furniture){
        int result = 0;
        for (WoodenFurniture x: furniture){
            result += x.getPrice();
        }
        return result;
    }
}
