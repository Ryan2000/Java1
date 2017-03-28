/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Movie;

import java.util.ArrayList;

/**
 *
 * @author ryanhoyda
 */
public class Library {  //Main class 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Movie m1 = new Movie("Shawshank");
        Movie m2 = new Movie();
        Movie m3 = new Movie("", Movie.GENRE.DRAMA);

        ArrayList<Movie> movies = new ArrayList<>(); //create array list of movie objects
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        for (Movie m : movies) {
            System.out.println(m);
        }
        Person p1 = new Person("p1");
        m1.setDirector(p1);

        m3.setDirector(new Person("m3_director"));
        m3.addCast(new Person("m3_cast_1"));

        Person p2 = new Person("p2");
        m1.addCast(p2);
        m3.addCast(p2);
        boolean starring = m1.stars(p2);
        System.out.println(starring);
        System.out.println(m3.stars(p1));
        
        
    }

}
