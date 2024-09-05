public class WoodenFurniture implements WoodenFurnitureInterface {
    private byte woodenspecies;
    private float price;
    private float weight;

    public byte getWoodenspecies(){
        return woodenspecies;
    }

    public float getPrice(){
        return price;
    }

    public float getWeight(){
        return weight;
    }

    public WoodenFurniture(byte woodenspecies, float price, float weight){
        this.woodenspecies = woodenspecies;
        this.price = price;
        this.weight = weight;
    }

    public String toString(){
        return "Furniture of wood " + woodenspecies + " with weight " + weight + " for only " + price;
    }
}
