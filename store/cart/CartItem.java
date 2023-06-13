package com.store.cart;

import com.store.item.Book;

public class CartItem {
//    private String[] itemBook = new String[7];
    private Book itemBook;
    private String bookID;
    private int quantity;
    private int totalPrice;

    public CartItem(){

    }

    public CartItem(Book booklist) {
        this.itemBook = booklist;
        this.bookID = booklist.getBookId();
        this.quantity = 1;
        updateTotalPrice();
    }
    public Book getItemBook(){
        return itemBook;
    }

    public void setItemBook(Book itemBook) {
        this.itemBook = itemBook;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
        this.updateTotalPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.updateTotalPrice();
    }
    public void updateTotalPrice(){
//        totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
        totalPrice = this.itemBook.getUnitPrice() * this.quantity;
    }
}
