package cpmparable_equal;

import java.util.Comparator;

public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    // Constructors

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    // Getters

    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    // Setters

    // Comparator for sorting by rating and profit
    public static Comparator<Movie> ratingAndProfitComparator = Comparator
            .comparing(Movie::getRating)
            .thenComparingDouble(movie -> movie.getCollectionAmount() - movie.getBudget())
            .reversed(); // Sorting in descending order of profit

    // Comparator for sorting by year released and rating
    public static Comparator<Movie> yearAndRatingComparator = Comparator
            .comparingInt(Movie::getYearReleased)
            .thenComparingDouble(Movie::getRating);

    // Example usage
    public static void main(String[] args) {
        // Creating movies
        Movie movie1 = new Movie(2000, 8.5, 50.0, 120.0);
        Movie movie2 = new Movie(2010, 7.8, 80.0, 150.0);
        Movie movie3 = new Movie(2005, 9.0, 30.0, 100.0);

        // Sorting by rating and profit
        System.out.println("Sorting by Rating and Profit:");
        int result1 = Movie.ratingAndProfitComparator.compare(movie1, movie2);
        int result2 = Movie.ratingAndProfitComparator.compare(movie2, movie3);
        int result3 = Movie.ratingAndProfitComparator.compare(movie1, movie3);

        System.out.println("Comparison Result 1: " + result1);
        System.out.println("Comparison Result 2: " + result2);
        System.out.println("Comparison Result 3: " + result3);

        // Sorting by year released and rating
        System.out.println("\nSorting by Year Released and Rating:");
        int result4 = Movie.yearAndRatingComparator.compare(movie1, movie2);
        int result5 = Movie.yearAndRatingComparator.compare(movie2, movie3);
        int result6 = Movie.yearAndRatingComparator.compare(movie1, movie3);

        System.out.println("Comparison Result 4: " + result4);
        System.out.println("Comparison Result 5: " + result5);
        System.out.println("Comparison Result 6: " + result6);
    }
}
