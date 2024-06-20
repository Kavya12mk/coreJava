package com.kavya.constructor;

public class MainBook
{
    public static void main(String[] args)
    {
        Book book = new Book();
        book.setTitle("Java");
        book.setAuthor("James");
        book.setIsbn("a");
        book.setPrice(250);
        System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.getIsbn()+" "+book.getPrice());

        Book book1=new Book("Hindi","abc","c");
        System.out.println(book1.getTitle()+" "+book1.getAuthor()+" "+book1.getIsbn()+" "+book1.getPrice());

        Book book2=new Book("English","abc","b",350);
        System.out.println(book2.getTitle()+" "+book2.getAuthor()+" "+book2.getIsbn()+" "+book2.getPrice());

    }
}
