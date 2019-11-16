package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        if (bookSet.size() == 0) return 0;
        Map<BookSignature, com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book> booksInMap = new HashMap<>();
        for (com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book book : bookSet) {
            booksInMap.put(new BookSignature(book.getSignature()),new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(),book.getTitle(), book.getPublicationYear()));
        }
        return medianPublicationYear(booksInMap);
    }
}
