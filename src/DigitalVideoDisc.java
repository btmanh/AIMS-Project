
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float price;
	
	public DigitalVideoDisc(String title, String category, String director, int length, float price) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.price = price;
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	public DigitalVideoDisc(String category, String title) {
		super();
		this.category = category;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
