//isA hasA

import java.time.LocalDate;

public class MultiLevelInheritance2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shop shop = new Shop();
		
		Pen myPen = new Pen();
		myPen.setPen("Parker");
		myPen.refill.ink.setInk("Blue", "Gel",100);
		myPen.refill.nib.setNib("Steel", "Cone", 0.4f);
		myPen.refill.setRefill(3); //setting the length
		
		myPen.showPen();
		
		System.out.println("======");
		
		FourColoursPen fcp = new FourColoursPen();
		fcp.setPen("Raynolds");
		fcp.refill.ink.setInk("Blue", "Gel",100);
		fcp.refill.nib.setNib("Steel", "Cone", 06f);
		fcp.refill.setRefill(3); //setting the length
		
		fcp.refill2.ink.setInk("Black", "Gel",100);
		fcp.refill2.nib.setNib("Steel", "Cone", 0.6f);
		fcp.refill2.setRefill(3); //setting the length
		
		fcp.refill3.ink.setInk("Green", "Gel",100);
		fcp.refill3.nib.setNib("Steel", "Cone", 0.6f);
		fcp.refill3.setRefill(3); //setting the length
		
		fcp.refill4.ink.setInk("Red", "Gel",100);
		fcp.refill4.nib.setNib("Steel", "Cone", 0.6f);
		fcp.refill4.setRefill(3); //setting the length
		
		fcp.showFourColoursPen();
		
		
	}

}

class Shop{
	
	String name;
	String address;
}

class GroceryShop extends Shop{
	
	GroceryItem item1 = new GroceryItem();
}

class ShoeShop extends Shop{
	
	
}

class StationaryShop extends Shop{
	
	StationaryItem sItem1 = new StationaryItem();
}


class Item{
	
	float price;
	String name;
	float weight;
	LocalDate manufacturedDate;
}

class GroceryItem extends Item{
	
	float quantity;//kg
}

class Shoe extends Item{
	
	
}

class StationaryItem extends Item{
	
	
}

class Pen extends StationaryItem{
	
	String brand;
	Refill refill = new Refill();
	
	void setPen(String br) {
		brand=br;
	}
	
	void showPen() {
		System.out.println("Pen brand : "+brand);
		System.out.println("Refill    : "+refill);
	}
}

class Nib
{
	String metalType;
	String shape;
	float size;
	
	public void  setNib(String metalType, String shape, float size) {
		
		this.metalType = metalType;
		this.shape = shape;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Nib [metalType=" + metalType + ", shape=" + shape + ", size=" + size + "]";
	}
	
	
}

class Ink
{
	String color;
	String type;
	int inkLevel;
	
	
	public void setInk(String color, String type, int level) {
		
		this.color = color;
		this.type = type;
		this.inkLevel = level;
	}


	@Override
	public String toString() {
		return "Ink [color=" + color + ", type=" + type + ", inkLevel=" + inkLevel + "]";
	}

	
}

class Refill
{
	
	Ink ink = new Ink();
	Nib nib = new Nib();
	
	int length;

	public void setRefill(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Refill [ink=" + ink + ", nib=" + nib + ", length=" + length + "]";
	}
	
	
}

class FourColoursPen extends Pen
{
	Refill refill2 = new Refill();
	Refill refill3 = new Refill();
	Refill refill4 = new Refill();
	
	void showFourColoursPen() {
		super.showPen();
		System.out.println("Refill2    : "+refill2);
		System.out.println("Refill3    : "+refill3);
		System.out.println("Refill4    : "+refill4);

	}

}

class Book extends StationaryItem{
	
	
}