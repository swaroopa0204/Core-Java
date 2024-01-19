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

    // Getters and Setters

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(double collectionAmount) {
        this.collectionAmount = collectionAmount;
    }

    // Comparator for sorting by rating and profit
    public static Comparator<Movie> ratingAndProfitComparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            // Compare movies based on rating
            int ratingComparison = Double.compare(movie1.getRating(), movie2.getRating());

            // If ratings are equal, compare based on profit (collectionAmount - budget)
            if (ratingComparison == 0) {
                double profit1 = movie1.getCollectionAmount() - movie1.getBudget();
                double profit2 = movie2.getCollectionAmount() - movie2.getBudget();
                return Double.compare(profit1, profit2);
            }

            return ratingComparison;
        }
    };

    // Comparator for sorting by year released and rating
    public static Comparator<Movie> yearAndRatingComparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            // Compare movies based on year released
            int yearComparison = Integer.compare(movie1.getYearReleased(), movie2.getYearReleased());

            // If release years are equal, compare based on rating
            if (yearComparison == 0) {
                return Double.compare(movie1.getRating(), movie2.getRating());
            }

            return yearComparison;
        }
    };

    // Example usage
    public static void main(String[] args) {
        // Creating movies
        Movie movie1 = new Movie(2000, 8.5, 50.0, 120.0);
        Movie movie2 = new Movie(2010, 7.8, 80.0, 150.0);
        Movie movie3 = new Movie(2005, 9.0, 30.0, 100.0);

        // Sorting by rating and profit
        int result1 = Movie.ratingAndProfitComparator.compare(movie1, movie2);
        int result2 = Movie.ratingAndProfitComparator.compare(movie2, movie3);
        int result3 = Movie.ratingAndProfitComparator.compare(movie1, movie3);

        System.out.println("Sorting by Rating and Profit:");
        System.out.println("Comparison Result 1: " + result1);
        System.out.println("Comparison Result 2: " + result2);
        System.out.println("Comparison Result 3: " + result3);

        // Sorting by year released and rating
        int result4 = Movie.yearAndRatingComparator.compare(movie1, movie2);
        int result5 = Movie.yearAndRatingComparator.compare(movie2, movie3);
        int result6 = Movie.yearAndRatingComparator.compare(movie1, movie3);

        System.out.println("\nSorting by Year Released and Rating:");
        System.out.println("Comparison Result 4: " + result4);
        System.out.println("Comparison Result 5: " + result5);
        System.out.println("Comparison Result 6: " + result6);
    }
}
