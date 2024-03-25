package com.example.edvinasvencevicius_2praktika;

public class WordCounter {
    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) return 0;
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
    public static int countCharacters(String text) {
        if (text == null) return 0;
        return text.length();
    }
}

