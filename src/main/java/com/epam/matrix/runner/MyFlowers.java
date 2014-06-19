package main.java.com.epam.matrix.runner;

import main.java.com.epam.matrix.Flowers.*;

/**
* Created by Anatoliy_Goncharov on 18.06.2014.
*/
public class MyFlowers {


	public void myFlowers() {
		Bouquet myBouquet = new Bouquet();
		myBouquet.addFlower(new BigRose());
		myBouquet.addFlower(new MidRose());
		myBouquet.addFlower(new SmallRose());
		myBouquet.addFlower(new Lily());
		myBouquet.addFlower(new RareLily());
		System.out.println (myBouquet.priceIs());

	}

}
