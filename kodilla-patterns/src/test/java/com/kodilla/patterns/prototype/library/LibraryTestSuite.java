package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Random;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Library 1");
        for (int i = 1; i < 10; i++){
            Random random = new Random();
            int r = random.nextInt(30);
            int s = random.nextInt(50);
            library.getBooks().add(new Book("Title "+i, "Author " + i, LocalDate.of(1950 + s,5,1+r)));
        }
        Book book = new Book("Title", "Author",LocalDate.of(2010,5,15));
        library.getBooks().add(book);

        System.out.println(library.getBooks());
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        }
            catch(CloneNotSupportedException e){
                System.out.println(e);
        }
          Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        }
        catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());
        //When
        library.getBooks().remove(book);
        //Then
        Assert.assertEquals(9,library.getBooks().size());
        Assert.assertEquals(9,clonedLibrary.getBooks().size());
        Assert.assertEquals(10,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(),clonedLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(),deepClonedLibrary.getBooks());
    }
}
