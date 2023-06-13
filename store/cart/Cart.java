package com.store.cart;

import com.store.item.Book;

import java.util.ArrayList;

public class Cart implements CartInterface {

    public ArrayList<CartItem> mCartItem = new ArrayList<CartItem>();

    public static int mCartCount = 0;
    public Cart() {

    }

    @Override
    public void printBookList(ArrayList<Book> booklist) {
        for (int i = 0; i < booklist.size(); i++) {
            Book bookitem = booklist.get(i);
            System.out.println(bookitem.getBookId() + " | ");
            System.out.println(bookitem.getName() + " | ");
            System.out.println(bookitem.getUnitPrice() + " | ");
            System.out.println(bookitem.getProducer() + " | ");
            System.out.println(bookitem.getDescription() + " | ");
            System.out.println(bookitem.getCategory() + " | ");
            System.out.println(bookitem.getReleaseDate());
            System.out.println("");}

    }

    @Override
    public boolean isCartInBook(String bookId) {
        boolean flag = false;

        for (int i = 0; i < mCartItem.size(); i++) {
            if (bookId.equals(mCartItem.get(i).getBookID())) {
                mCartItem.get(i).setQuantity(mCartItem.get(i).getQuantity() + 1);
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public void insertBook(Book book) {

        CartItem bookitem = new CartItem(book);
        mCartItem.add(bookitem);
        mCartCount = mCartItem.size();
    }

    @Override
    public void removeCart(int numId) {
        mCartItem.remove(numId);
        mCartCount = mCartItem.size();

    }

    @Override
    public void deleteBook() {
        mCartItem.clear();
        mCartCount = 0;
    }
    public void printCart(){
        System.out.println("장바구니 상품 목록: ");
        System.out.println("----------------------------------");
        System.out.println("     제품ID \t|    수량 \t|    합계");

        for (int i = 0; i < mCartItem.size(); i++) {
            System.out.println("   " + mCartItem.get(i).getBookID() + "\t| ");
            System.out.println("   " + mCartItem.get(i).getQuantity() + "\t|");
            System.out.println("   " + mCartItem.get(i).getTotalPrice());
            System.out.println("  ");
        }
        System.out.println("--------------------------------------");
    }

    public ArrayList<CartItem> getmCartItem(){
        return mCartItem;
    }
    public void setmCartItem(ArrayList<CartItem> mCartItem){
        this.mCartItem = mCartItem;
    }

}
