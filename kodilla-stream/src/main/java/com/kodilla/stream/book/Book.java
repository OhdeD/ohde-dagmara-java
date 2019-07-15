package com.kodilla.stream.book;

public final class Book {
    private final String author;
    private final String title;
    private final int yearOfPubliacation;

    public Book(final String author, final String title, final int yearOfPubliacation) {
        this.author = author;
        this.title = title;
        this.yearOfPubliacation = yearOfPubliacation;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPubliacation;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPubliacation=" + yearOfPubliacation +
                '}';
    }
}
