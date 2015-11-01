package cn.Lionel.domain;

public class CartItem {

	private Book book;
	private int quanlity = 0;
	private double price = 0;
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getQuanlity() {
		return quanlity;
	}
	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
		this .price = this.quanlity*book.getPrice();
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CartItem(Book book, int quanlity, double price) {
		super();
		this.book = book;
		this.quanlity = quanlity;
		this.price = price;
	}
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
