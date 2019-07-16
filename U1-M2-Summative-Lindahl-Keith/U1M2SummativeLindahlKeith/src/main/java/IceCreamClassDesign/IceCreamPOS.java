package IceCreamClassDesign;

public class IceCreamPOS {

    private double smallIceCreamCone = 2.75;
    private double mediumIceCreamCone = 3.50;
    private double largeIceCreamCone = 4.00;
    private double oneScoopIcecreamBowl = 1.50;
    private double twoScoopIcecreamBowl = 2.50;
    private double threeScoopIcecreamBowl = 3.25;

    public void complaints(){
        System.out.println("returned and see how to help");
    }
    public void purchase(){
        System.out.println("purchased and handed reciept");
    }

    public IceCreamPOS(double smallIceCreamCone, double mediumIceCreamCone, double largeIceCreamCone, double oneScoopIcecreamBowl, double twoScoopIcecreamBowl, double threeScoopIcecreamBowl) {
        this.smallIceCreamCone = smallIceCreamCone;
        this.mediumIceCreamCone = mediumIceCreamCone;
        this.largeIceCreamCone = largeIceCreamCone;
        this.oneScoopIcecreamBowl = oneScoopIcecreamBowl;
        this.twoScoopIcecreamBowl = twoScoopIcecreamBowl;
        this.threeScoopIcecreamBowl = threeScoopIcecreamBowl;
    }

    public IceCreamPOS() {
    }

    public double getSmallIceCreamCone() {
        return smallIceCreamCone;
    }

    public void setSmallIceCreamCone(double smallIceCreamCone) {
        this.smallIceCreamCone = smallIceCreamCone;
    }

    public double getMediumIceCreamCone() {
        return mediumIceCreamCone;
    }

    public void setMediumIceCreamCone(double mediumIceCreamCone) {
        this.mediumIceCreamCone = mediumIceCreamCone;
    }

    public double getLargeIceCreamCone() {
        return largeIceCreamCone;
    }

    public void setLargeIceCreamCone(double largeIceCreamCone) {
        this.largeIceCreamCone = largeIceCreamCone;
    }

    public double getOneScoopIcecreamBowl() {
        return oneScoopIcecreamBowl;
    }

    public void setOneScoopIcecreamBowl(double oneScoopIcecreamBowl) {
        this.oneScoopIcecreamBowl = oneScoopIcecreamBowl;
    }

    public double getTwoScoopIcecreamBowl() {
        return twoScoopIcecreamBowl;
    }

    public void setTwoScoopIcecreamBowl(double twoScoopIcecreamBowl) {
        this.twoScoopIcecreamBowl = twoScoopIcecreamBowl;
    }

    public double getThreeScoopIcecreamBowl() {
        return threeScoopIcecreamBowl;
    }

    public void setThreeScoopIcecreamBowl(double threeScoopIcecreamBowl) {
        this.threeScoopIcecreamBowl = threeScoopIcecreamBowl;
    }

    @Override
    public String toString() {
        return "IceCreamPOS{" +
                "smallIceCreamCone=" + smallIceCreamCone +
                ", mediumIceCreamCone=" + mediumIceCreamCone +
                ", largeIceCreamCone=" + largeIceCreamCone +
                ", oneScoopIcecreamBowl=" + oneScoopIcecreamBowl +
                ", twoScoopIcecreamBowl=" + twoScoopIcecreamBowl +
                ", threeScoopIcecreamBowl=" + threeScoopIcecreamBowl +
                '}';
    }

    public static void main(String[] args) {
        IceCreamPOS iceCreamPOS = new IceCreamPOS();
        double total = iceCreamPOS.largeIceCreamCone + iceCreamPOS.twoScoopIcecreamBowl;
        iceCreamPOS.purchase();
        System.out.printf("%.2f", total);
        System.out.println();
        iceCreamPOS.complaints();
    }
}
