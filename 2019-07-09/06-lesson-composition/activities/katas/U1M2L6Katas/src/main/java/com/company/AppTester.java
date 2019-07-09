package com.company;

public class AppTester {

    public static void main(String[] args) {
        Chips FritoLays = new Chips("Fritos", "Coca-Cola");
        SodaPop DrPepper = new SodaPop("Dr.Pepper","Pepsi-Cola");
        Chocolate Marsbar = new Chocolate("Marsbar","Mars Candy Co.");
        Mints Thinmints = new Mints("Thinmints","Hershey's Candy Co.");
        Gum Trident = new Gum("Trident","Trident Gum Company");
        Popcorn Orville = new Popcorn("Orville","Orville Popcorn Co.");



        System.out.println(FritoLays);
        FritoLays.buy();
        FritoLays.purchase();
        FritoLays.complainItDidNotDrop();
        FritoLays.returnItem();

        System.out.println(DrPepper);
        DrPepper.buy();
        DrPepper.purchase();
        DrPepper.order();
        DrPepper.complainItDidNotDrop();
        DrPepper.thankWaitress();
        DrPepper.returnItem();

        System.out.println(Marsbar);
        Marsbar.buy();
        Marsbar.purchase();
        Marsbar.complainItDidNotDrop();
        Marsbar.returnItem();

        System.out.println(Thinmints);
        Thinmints.buy();
        Thinmints.complainItDidNotDrop();

        System.out.println(Trident);
        Trident.buy();
        Trident.complainItDidNotDrop();

        System.out.println(Orville);
        Orville.buy();
        Orville.complainItDidNotDrop();
    }

}
