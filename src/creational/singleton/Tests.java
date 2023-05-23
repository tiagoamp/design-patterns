package creational.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @DisplayName("When getting instance, should return same object")
    @Test
    void test1() {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = Singleton.getInstance();
        assertSame(instanceOne, instanceTwo);
        assertEquals(instanceOne.hashCode(), instanceTwo.hashCode());
    }

    @DisplayName("When getting instance from multithread environment, should return same object")
    @Test
    void test2() {
        List<SingletonSync> list = IntStream.rangeClosed(1, 1000)
                .parallel()
                .mapToObj(i -> SingletonSync.getInstance()).toList();
        list.forEach(s -> assertAll(
                () -> assertSame(list.get(0), s),
                () -> assertEquals(list.get(0).hashCode(), s.hashCode())
        ));
    }

}
