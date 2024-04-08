package com.example.edvinasvencevicius_2praktika;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleUnitTest {

    @Test
    public void CountWords_Text() {
        String text = "Test phrase";
        int expectedWordCount = 5;
        assertEquals(expectedWordCount, WordCounter.countWords(text));
    }

    @Test
    public void CountWords_EmptyText() {
        String text = "";
        int expectedWordCount = 0;
        assertEquals(expectedWordCount, WordCounter.countWords(text));
    }

    @Test
    public void CountWords_Spaces() {
        String text = "     ";
        int expectedWordCount = 0;
        assertEquals(expectedWordCount, WordCounter.countWords(text));
    }

    @Test
    public void CountWords_Tabs() {
        String text = "\t\t\t\t\t";
        int expectedWordCount = 0;
        assertEquals(expectedWordCount, WordCounter.countWords(text));
    }

    @Test
    public void CountCharacters_Text() {
        String text = "Test phrase";
        int expectedCharacterCount = 19;
        assertEquals(expectedCharacterCount, WordCounter.countCharacters(text));
    }

    @Test
    public void CountCharacters_EmptyText() {
        String text = "";
        int expectedCharacterCount = 0;
        assertEquals(expectedCharacterCount, WordCounter.countCharacters(text));
    }
}
