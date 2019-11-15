package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian(){
        //Given
        Set<Book>books = new HashSet<>();
        books.add(new Book("Dostojewski", "Zbrodnia i kara", 1985, "AOB232315"));
        books.add(new Book("Rowling", "Harry Potter", 2010, "BAO151548"));
        books.add(new Book("Matrin", "Game of Thrones", 2015, "WAR1472582"));
        MedianAdapter adapter = new MedianAdapter();
        System.out.println(books);
        //When
        int median = adapter.publicationYearMedian(books);
        System.out.println();
        System.out.println(median);
        //Then
        Assert.assertEquals(2010, median);

    }
}
