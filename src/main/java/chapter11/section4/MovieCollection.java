package chapter11.section4;

import java.util.*;
import static net.mindview.util.Print.print;

/**
 * Description:
 * CreateTime: 2017/12/9 17:12
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class MovieCollection {
    private static final MovieGenerator MNG = new MovieGenerator();
    private String[] setArray(String[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = MNG.next();
        }
        return array;
    }
    private Collection<String> setCollection(Collection<String> collection) {
        for(int i = 0; i < 5; i++) {
            collection.add(MNG.next());
        }
        return collection;
    }
    public static void main(String[] args) {
        MovieCollection mc = new MovieCollection();
        print(Arrays.toString(mc.setArray(new String[5])));
        print(mc.setCollection(new ArrayList<>()));
        print(mc.setCollection(new LinkedList<>()));
        print(mc.setCollection(new HashSet<>()));
        print(mc.setCollection(new LinkedHashSet<>()));
        print(mc.setCollection(new TreeSet<>()));
    }
}

enum Movie {

    CASABLANCA("Casablanca", 0),
    MEMENTO("Memento", 1),
    THE_GODFATHER("The Godfather", 2),
    SNOW_WHITE("Snow White", 3);

    private String name;
    private int index;

    Movie(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (Movie movie : Movie.values()) {
            if (movie.index == index) {
                return movie.name;
            }
        }
        return null;
    }
}

class MovieGenerator {

    private int index;

    public String next() {
        String r = Movie.getName(index);
        index = (index + 1) % Movie.values().length;
        return r;
    }
}
