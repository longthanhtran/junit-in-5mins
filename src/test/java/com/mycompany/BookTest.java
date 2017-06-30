package com.mycompany;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BookTest {

    @Test
    public void testBookClassProperty() {
        Book book = new Book("jUnit tutorials");

        assertThat(book, hasProperty("name"));
    }

    @Test
    public void testClassPropertyInList() {
        List<Book> listOfBook = Arrays.asList(
            new Book("Java in Action"),
            new Book("Spring in Action")
        );

        assertThat(listOfBook, containsInAnyOrder(
            hasProperty("name", is("Spring in Action")),
            hasProperty("name", is("Java in Action"))
        ));
    }
}