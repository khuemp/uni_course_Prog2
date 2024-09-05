public class WoodenChair extends WoodenFurniture{
    private byte chshape;
    private byte chlegs;

    public WoodenChair(byte woodenspecies, float price, float weight, byte chshape, byte chlegs){
        super(woodenspecies, price, weight);
        this.chshape = chshape;
        this.chlegs = chlegs;
    }

    public String toString(){
        return "Chair with shape " + chshape + " and " + chlegs + " legs, " + super.toString();
    }
}
