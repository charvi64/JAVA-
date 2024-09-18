package week9;

import java.util.*;

class Movie implements Comparable<Movie> {
 private double rating;
 private String name;
 private int year;

 
 public Movie(String name, double rating, int year) {
     this.name = name;
     this.rating = rating;
     this.year = year;
 }

 public double getRating() {
     return rating;
 }

 public String getName() {
     return name;
 }

 public int getYear() {
     return year;
 }

 @Override
 public int compareTo(Movie otherMovie) {
     return this.year - otherMovie.year;
 }

 @Override
 public String toString() {
     return "Movie{name='" + name + "', rating=" + rating + ", year=" + year + "}";
 }
}

public class MovieSorter {
 public static void main(String[] args) {
	 
     List<Movie> movies = new ArrayList<>();
     movies.add(new Movie("The Shawshank Redemption", 9.3, 1994));
     movies.add(new Movie("The Godfather", 9.2, 1972));
     movies.add(new Movie("The Dark Knight", 9.0, 2008));
     movies.add(new Movie("12 Angry Men", 8.9, 1957));

     Collections.sort(movies);

     System.out.println("Movies sorted by year of release:");
     for (Movie movie : movies) {
         System.out.println(movie);
     }
 }
}

