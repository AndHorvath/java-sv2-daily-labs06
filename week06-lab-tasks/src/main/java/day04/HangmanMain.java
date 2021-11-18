package day04;

import java.util.Scanner;

public class HangmanMain {

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        String wordToFind = "alma";
        String wordFound = "____";
        int chances = 8;

        do {
            System.out.println("Itt tartasz: " + wordFound);
            System.out.println("Ennyi tipped van még: " + chances);
            System.out.println("Mi a következő tipped?");

            wordFound = updateWordFound(wordToFind, wordFound, sc.nextLine());
            chances -= !wordFound.equals(wordToFind) ? 1 : 0;
        } while (!wordFound.equals(wordToFind) && chances > 0);

        if (wordFound.equals(wordToFind)) {
            System.out.println("Ügyes!");
        } else {
            System.out.println("Vesztettél.");
        }
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }
}