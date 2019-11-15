package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        if (bookSet.size() == 0) return 0;
        List<Integer> booksInOrder = new ArrayList<>();
        for (Book book : bookSet) {
            booksInOrder.add(book.getPublicationYear());
        }
        Collections.sort(booksInOrder);
        System.out.println(booksInOrder);
        if (bookSet.size() % 2 != 0) {
            return booksInOrder.get((int) ((booksInOrder.size()) / 2 ));
        } else return (booksInOrder.get((booksInOrder.size() -1) / 2) + booksInOrder.get((booksInOrder.size()-1)/2 + 1))/2;
    }
}
