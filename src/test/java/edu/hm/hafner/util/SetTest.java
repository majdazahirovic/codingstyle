package edu.hm.hafner.util;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;

import static java.util.Arrays.*;
import static org.assertj.core.api.Assertions.*;

public class SetTest {

    HashSet<Integer> createHashSetFilled(final Integer... filled) {
        return new HashSet<>(asList(filled));
    }

    HashSet<Integer> createHashSetEmpty() {
        return new HashSet<>();
    }

    @Test
    void testAdd() {
        HashSet<Integer> testObjectAdd = createHashSetFilled();

        assertThat(testObjectAdd.add(1)).isTrue();
        assertThat(testObjectAdd.add(1)).isFalse();
        assertThat(testObjectAdd.add(2)).isTrue();
        assertThat(testObjectAdd.add(-1)).isTrue();
    }

    @Test
    void testClear() {
        HashSet<Integer> testObjectClear = createHashSetEmpty();

        testObjectClear.add(1);
        testObjectClear.add(2);
        testObjectClear.add(3);

        assertThat(testObjectClear).isNotEmpty();

        testObjectClear.clear();

        assertThat(testObjectClear).isEmpty();

    }

    @Test
    void testClone() {

        HashSet<Integer> testObjectClone = createHashSetFilled(1, 2, 3);
        HashSet<Integer> testObjectClone2 = (HashSet<Integer>) testObjectClone.clone();

        assertThat(testObjectClone).isEqualTo(testObjectClone2);

    }

    @Test
    void testContain() {

        HashSet<Integer> testObjectContain = createHashSetFilled(1, 2, 3);

        assertThat(testObjectContain.contains(1)).isTrue();
        assertThat(testObjectContain.contains(5)).isFalse();
        assertThat(testObjectContain.contains(0)).isFalse();
        assertThat(testObjectContain.contains(3)).isTrue();
        assertThat(testObjectContain.contains(null)).isFalse();

    }

    @Test
    void testIsEmpty() {

        HashSet<Integer> testObjectEmptyFilled = createHashSetFilled(1, 2, 3, 4);
        HashSet<Integer> testObjectEmpty = createHashSetEmpty();

        assertThat((testObjectEmptyFilled).isEmpty()).isFalse();
        assertThat((testObjectEmpty).isEmpty()).isTrue();

    }

    @Test
    void testSize() {
        HashSet<Integer> testObjectSize = createHashSetFilled(1, 2, 3, 4);
        assertThat(testObjectSize.size()).isEqualTo(4);
    }

    @Test
    void testIsRemove() {

        HashSet<Integer> testObjectRemove = createHashSetFilled(1, 2, 3, 4);

        assertThat(testObjectRemove.remove(1)).isTrue();
        assertThat(testObjectRemove.remove(6)).isFalse();
        assertThat(testObjectRemove.remove(null)).isFalse();
        assertThat(testObjectRemove.remove(3)).isTrue();

    }

}





