package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

    @Test
    void ShouldShowAfisha() {

        MovieManager manager = new MovieManager();

        Movie first = new Movie(1, "Бладшот", ",боевик");
        Movie second = new Movie(2, "Вперед", "мультфильм");
        Movie third = new Movie(3, "Отель Белгард", "комедия");
        Movie fourth = new Movie(4, "Джентельмены", "боевик");
        Movie fifth = new Movie(5, "Человек-невидимка", "ужасы");
        Movie sixth = new Movie(6, "Тролли.Мировой тур", "мультфильм");
        Movie seventh = new Movie(7, "Номер Один", "комедия");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Movie[] actual = manager.showMovies();
        Movie[] expected = new Movie[]{seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void ShouldShow7LastMovies() {

        MovieManager manager = new MovieManager();

        Movie first = new Movie(1, "Бладшот", ",боевик");
        Movie second = new Movie(2, "Вперед", "мультфильм");
        Movie third = new Movie(3, "Отель Белгард", "комедия");
        Movie fourth = new Movie(4, "Джентельмены", "боевик");
        Movie fifth = new Movie(5, "Человек-невидимка", "ужасы");
        Movie sixth = new Movie(6, "Тролли.Мировой тур", "мультфильм");
        Movie seventh = new Movie(7, "Номер Один", "комедия");
        Movie eighth = new Movie(8, "1+1", "комедия");
        Movie ninth = new Movie(9, "Пусть говорят", "ужасы");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);


        Movie[] actual = manager.showMovies();
        Movie[] expected = new Movie[]{ninth, eighth, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    void ShouldShowSelectedQuantityMovies() {

        MovieManager manager = new MovieManager(3);

        Movie first = new Movie(1, "Бладшот", ",боевик");
        Movie second = new Movie(2, "Вперед", "мультфильм");
        Movie third = new Movie(3, "Отель Белгард", "комедия");
        Movie fourth = new Movie(4, "Джентельмены", "боевик");
        Movie fifth = new Movie(5, "Человек-невидимка", "ужасы");
        Movie sixth = new Movie(6, "Тролли.Мировой тур", "мультфильм");
        Movie seventh = new Movie(7, "Номер Один", "комедия");
        Movie eighth = new Movie(8, "1+1", "комедия");
        Movie ninth = new Movie(9, "Пусть говорят", "ужасы");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);


        Movie[] actual = manager.showMovies();
        Movie[] expected = new Movie[]{ninth, eighth, seventh};

        assertArrayEquals(expected, actual);
    }
    @Test
    void ShouldShowWhenMoviesUnder7() {
        MovieManager manager = new MovieManager ();
        Movie first = new Movie(1, "Бладшот", ",боевик");
        Movie second = new Movie(2, "Вперед", "мультфильм");
        Movie third = new Movie(3, "Отель Белгард", "комедия");
        Movie fourth = new Movie(4, "Джентельмены", "боевик");
        Movie fifth = new Movie(5, "Человек-невидимка", "ужасы");


        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);


        Movie[] actual = manager.showMovies();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}

