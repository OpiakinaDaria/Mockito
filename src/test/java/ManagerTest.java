import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerTest {

    @Test
    void findAll() {
        String movie1 = "Movie1";
        String movie2 = "Movie2";
        String movie3 = "Movie3";
        String movie4 = "Movie4";
        String movie5 = "Movie5";
        Manager manager = new Manager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
        };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {
        String movie1 = "Movie1";
        String movie2 = "Movie2";
        String movie3 = "Movie3";
        String movie4 = "Movie4";
        String movie5 = "Movie5";
        Manager manager = new Manager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void add() {
        String movie1 = "Movie1";
        String movie2 = "Movie2";
        String movie3 = "Movie3";
        String movie4 = "Movie4";
        String movie5 = "Movie5";
        Manager manager = new Manager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
        };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}

