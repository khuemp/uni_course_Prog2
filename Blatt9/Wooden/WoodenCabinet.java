public class WoodenCabinet extends WoodenFurniture{
    private byte cashape;
    private byte cafunc;

    public WoodenCabinet(byte woodenspecies, float price, float weight, byte cashape, byte cafunc){
        super(woodenspecies, price, weight);
        this.cashape = cashape;
        this.cafunc = cafunc;
    }

    public String toString(){
        return "Cabinet with shape " + cashape + " and function " + cafunc + ", " + super.toString();
    }
}
