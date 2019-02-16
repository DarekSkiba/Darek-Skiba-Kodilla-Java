package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    //1 book in hands
    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> booksInHandsOf = new ArrayList<LibraryUser>();
        if (booksInHandsOf()) == 1 ) return LibraryUser();

    //no books in hands

    List<Book> booksInHandsOf = new ArrayList<LibraryUser>();
        if (booksInHandsOf()) == 0 ) return LibraryUser();

    //5 books in hands
    List<Book> booksInHandsOf = new ArrayList<LibraryUser>();
        if (booksInHandsOf()) == 5) return LibraryUser();
}
}

}