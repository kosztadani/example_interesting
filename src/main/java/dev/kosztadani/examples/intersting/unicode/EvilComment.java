package dev.kosztadani.examples.intersting.unicode;

public class EvilComment {
    public static void main(String[] args) {
        // This comment is \u000a evil();
    }

    private static void evil() {
        System.out.println("Something evil has happened!");
    }
}
