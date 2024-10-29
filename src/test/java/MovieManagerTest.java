import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

    @Test
    public void noMovies() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkOneMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("БЛАДШОТ");

        String[] expected = {"БЛАДШОТ"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkSevenMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("БЛАДШОТ");
        manager.addMovie("ВПЕРЁД");
        manager.addMovie("ОТЕЛЬ БЕЛГРАД");
        manager.addMovie("ДЖЕНТЛЬМЕНЫ");
        manager.addMovie("ЧЕЛОВЕК-НЕВИДИМКА");
        manager.addMovie("ТРОЛЛИ. МИРОВОЙ ТУР");
        manager.addMovie("НОМЕР ОДИН");

        String[] expected = {"БЛАДШОТ", "ВПЕРЁД", "ОТЕЛЬ БЕЛГРАД", "ДЖЕНТЛЬМЕНЫ", "ЧЕЛОВЕК-НЕВИДИМКА", "ТРОЛЛИ. МИРОВОЙ ТУР", "НОМЕР ОДИН"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkReversBeforeLimitMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("ДЖЕНТЛЬМЕНЫ");
        manager.addMovie("ЧЕЛОВЕК-НЕВИДИМКА");
        manager.addMovie("ТРОЛЛИ. МИРОВОЙ ТУР");
        manager.addMovie("НОМЕР ОДИН");

        String[] expected = {"НОМЕР ОДИН", "ТРОЛЛИ. МИРОВОЙ ТУР", "ЧЕЛОВЕК-НЕВИДИМКА", "ДЖЕНТЛЬМЕНЫ"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkReversLimitMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("ОТЕЛЬ БЕЛГРАД");
        manager.addMovie("ДЖЕНТЛЬМЕНЫ");
        manager.addMovie("ЧЕЛОВЕК-НЕВИДИМКА");
        manager.addMovie("ТРОЛЛИ. МИРОВОЙ ТУР");
        manager.addMovie("НОМЕР ОДИН");

        String[] expected = {"НОМЕР ОДИН", "ТРОЛЛИ. МИРОВОЙ ТУР", "ЧЕЛОВЕК-НЕВИДИМКА", "ДЖЕНТЛЬМЕНЫ", "ОТЕЛЬ БЕЛГРАД"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkReversAfterLimitMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("БЛАДШОТ");
        manager.addMovie("ВПЕРЁД");
        manager.addMovie("ОТЕЛЬ БЕЛГРАД");
        manager.addMovie("ДЖЕНТЛЬМЕНЫ");
        manager.addMovie("ЧЕЛОВЕК-НЕВИДИМКА");
        manager.addMovie("ТРОЛЛИ. МИРОВОЙ ТУР");
        manager.addMovie("НОМЕР ОДИН");

        String[] expected = {"НОМЕР ОДИН", "ТРОЛЛИ. МИРОВОЙ ТУР", "ЧЕЛОВЕК-НЕВИДИМКА", "ДЖЕНТЛЬМЕНЫ", "ОТЕЛЬ БЕЛГРАД"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkReversNewLimitMovies() {
        MovieManager manager = new MovieManager(7);

        manager.addMovie("БЛАДШОТ");
        manager.addMovie("ВПЕРЁД");
        manager.addMovie("ОТЕЛЬ БЕЛГРАД");
        manager.addMovie("ДЖЕНТЛЬМЕНЫ");
        manager.addMovie("ЧЕЛОВЕК-НЕВИДИМКА");
        manager.addMovie("ТРОЛЛИ. МИРОВОЙ ТУР");
        manager.addMovie("НОМЕР ОДИН");

        String[] expected = {"НОМЕР ОДИН", "ТРОЛЛИ. МИРОВОЙ ТУР", "ЧЕЛОВЕК-НЕВИДИМКА", "ДЖЕНТЛЬМЕНЫ", "ОТЕЛЬ БЕЛГРАД", "ВПЕРЁД", "БЛАДШОТ" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}