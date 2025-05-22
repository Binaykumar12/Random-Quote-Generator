package project_op;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomQuoteGenerator {
    // Array of quotes
    private static String[] quotes = {
            "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
            "The way to get started is to quit talking and begin doing. - Walt Disney",
            "Life is what happens when you're busy making other plans. - John Lennon",
            "You only live once, but if you do it right, once is enough. - Mae West",
            "The purpose of our lives is to be happy. - Dalai Lama",
            "Get busy living or get busy dying. - Stephen King",
            "You have within you right now, everything you need to deal with whatever the world can throw at you. - Brian Tracy",
            "Believe you can and you're halfway there. - Theodore Roosevelt",
            "The only impossible journey is the one you never begin. - Tony Robbins",
            "In the end, we will remember not the words of our enemies, but the silence of our friends. - Martin Luther King Jr."
    };

    private static Random random = new Random();
    private static ArrayList<String> favoriteQuotes = new ArrayList<>();


    private static void generateQuote() {
        // Generate a random index to select a quote
        int index = random.nextInt(quotes.length);
        System.out.println("\nQuote: \"" + quotes[index] + "\"");
    }


       // Add quotes to favorites
    private static void addToFavorites(Scanner scanner) {
        System.out.print("Enter the quote you want to add to favorites: ");
        String currentQuote = scanner.nextLine();

        if (currentQuote.isEmpty()) {
            System.out.println("No quote entered!");
        } else if (favoriteQuotes.contains(currentQuote)) {
            System.out.println("Quote is already a favorite!");
        } else {
            favoriteQuotes.add(currentQuote);
            System.out.println("Quote added to favorites!");
        }
    }



       // Show the favorite quotes
    private static void showRandomFavorite() {
        if (favoriteQuotes.isEmpty()) {
            System.out.println("No favorite quotes yet!");
            return;
        }

        int index = random.nextInt(favoriteQuotes.size());
        String favoriteQuote = favoriteQuotes.get(index);
        System.out.println("Favorite Quote: " + favoriteQuote);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;


        do {
            System.out.println("\n*** Welcome To Random Quote Generator ***");
            System.out.println("1. Generate Random Quote");
            System.out.println("2. Add Current Quote to Favorites");
            System.out.println("3. Show Random Favorite Quote");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    generateQuote();
                    break;
                case 2:
                    addToFavorites(scanner);
                    break;
                case 3:
                    showRandomFavorite();
                    break;
                case 4:
                    System.out.println("Thank you for using the Random Quote Generator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }


}
