package edu.hm.hafner.util;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;

import static java.util.Arrays.*;
import static org.assertj.core.api.Assertions.*;

public class SetTest {

    HashSet<Integer> creatHashSetFilled(final Integer... filled) {
        return new HashSet<>(asList(filled));
    }

    HashSet<Integer> createHashSetEmpty() {
        return new HashSet<>();
    }


    @Test
    void testAdd(){
        HashSet<Integer> testObjectAdd = creatHashSetFilled();

        assertThat(testObjectAdd.add(1)).isTrue();
        assertThat(testObjectAdd.add(1)).isFalse();
    }
    void testClear(){}
    void testClone(){}
    void testContain(){}
    void testIsEmpty(){}
    void testSize(){}
    void testIsRemove(){}





}





