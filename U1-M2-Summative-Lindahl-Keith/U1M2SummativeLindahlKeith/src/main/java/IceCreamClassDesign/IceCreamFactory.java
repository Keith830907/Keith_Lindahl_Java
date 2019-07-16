package IceCreamClassDesign;

public class IceCreamFactory {

    String Chocolate = "Chocolate";
    String Vanilla = "Vanilla";
    String Strawberry = "Strawberry";
    String cherry = "Cherry";

    public IceCreamFactory() {
    }

    public IceCreamFactory(String chocolate, String vanilla, String strawberry, String cherry) {
        Chocolate = chocolate;
        Vanilla = vanilla;
        Strawberry = strawberry;
        this.cherry = cherry;
    }

    public String getChocolate() {
        return Chocolate;
    }

    public void setChocolate(String chocolate) {
        Chocolate = chocolate;
    }

    public String getVanilla() {
        return Vanilla;
    }

    public void setVanilla(String vanilla) {
        Vanilla = vanilla;
    }

    public String getStrawberry() {
        return Strawberry;
    }

    public void setStrawberry(String strawberry) {
        Strawberry = strawberry;
    }

    public String getCherry() {
        return cherry;
    }

    public void setCherry(String cherry) {
        this.cherry = cherry;
    }

    public void produceProcess(){
        System.out.println("Producing product");
    }

    public void shipping(){
        System.out.println("Ship to address needed");
    }

    @Override
    public String toString() {
        return "IceCreamFactory{" +
                "Chocolate='" + Chocolate + '\'' +
                ", Vanilla='" + Vanilla + '\'' +
                ", Strawberry='" + Strawberry + '\'' +
                ", cherry='" + cherry + '\'' +
                '}';
    }

    public static void main(String[] args) {
        IceCreamFactory cherry1 = new IceCreamFactory();
        IceCreamFactory chocolate1 = new IceCreamFactory();
        System.out.println("We are now producing " + cherry1.cherry );
        cherry1.produceProcess();
        cherry1.shipping();
        System.out.println();
        System.out.println("We are now producing " + chocolate1.Chocolate);
        chocolate1.produceProcess();
        chocolate1.shipping();
    }
}
