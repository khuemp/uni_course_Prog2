public class WoodenTable extends WoodenFurniture{
    private byte tshape;
    private byte tlegs;
    private byte tfunc;
 
    public WoodenTable(byte woodspecies, float price, float weight, byte tshape, byte tlegs, byte tfunc){
        super(woodspecies, price, weight);
        this.tshape = tshape;
        this.tlegs = tlegs;
        this.tfunc = tfunc;
    }

    public String toString(){
        return "Table with shape " + tshape + " and " + tlegs + " legs for activity " + tfunc + ", " + super.toString();
    }
}
