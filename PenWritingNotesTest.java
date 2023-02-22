//monday work

public class PenWritingNotesTest {

	public static void main(String args[]) {
		
		Student1 student = new Student1();
		
		Book1 book = new Book1(150, "Ruled", "Classmate", "Medium", "Java");
		Pen1 pen = new Pen1("Reynolds", "Blue");
		
		Classroom1 classroom = new Classroom1("C++", 14, student);
		Notes1 myNotes = classroom.student.write(book, pen);
		
		System.out.println("Notes are ready.. "+myNotes);
		
	}
}

class StationaryItem1{
	
	float price;
}


class Pen1 extends StationaryItem1{
	
	String brand;
	String colour;
	

	public Pen1(String brand, String colour) {
		super();
		this.brand = brand;
		this.colour = colour;
	}


	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", colour=" + colour + "]";
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
		
}

/*
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
*/


class Book1 extends StationaryItem1{
	
	int pages;
	String type;// ruled/unruled
	String brand;
	String size;
	String subject;
	public Book1(int pages, String type, String brand, String size, String subject) {
		super();
		this.pages = pages;
		this.type = type;
		this.brand = brand;
		this.size = size;
		this.subject = subject;
	}
	
	
	@Override
	public String toString() {
		return "Book [pages=" + pages + ", type=" + type + ", brand=" + brand + ", size=" + size + ", subject="
				+ subject + "]";
	}


	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}

class Notes1{
	
	String subject;
	
	
	public Notes1() {
		
	}
	
	public Notes1(String subject) {
		super();
		this.subject = subject;
	}
	
	
	
	@Override
	public String toString() {
		return "Notes [subject=" + subject + "]";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}


class Student1{
	
	String studentName;
	
	//producesA			usesA
	Notes1 write(Book1 book, Pen1 pen) {
		
		
		System.out.println("Writing notes..");
		
		Notes1 notes = new Notes1();
		notes.setSubject(book.subject);
		
		
		//notes.setLanguage();
		//notes.setNumberOfPages();
		
		return notes;
	}


}


class Classroom1{
	
	String subject;
	int classroomNumber;
	
	
	
	public Classroom1(String subject, int classroomNumber, Student1 student) {
		super();
		this.subject = subject;
		this.classroomNumber = classroomNumber;
		this.student = student;
	}



	//hasA
	Student1 student = new Student1();
	
	
}
