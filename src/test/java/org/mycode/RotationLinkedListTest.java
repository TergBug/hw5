package org.mycode;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class RotationLinkedListTest {
    private RotationLinkedList testedRotationLinkedList = new RotationLinkedList();
    private LinkedList<Integer> testedList = new LinkedList<>();
    private LinkedList<Integer> rotatedList = new LinkedList<>();
    private int steps = 3;
    @Before
    public void setupLists(){
        Collections.addAll(testedList, 1, 2, 3, 4, 5);
        Collections.addAll(rotatedList, 3, 4, 5, 1, 2);
    }
    @Test
    public void shouldRotateLinkedList(){
        assertEquals(rotatedList, testedRotationLinkedList.rotateLinkedList(testedList, steps));
    }
    @Test
    public void shouldReturnNullInExceptionCases(){
        assertNull(testedRotationLinkedList.rotateLinkedList(null, steps));
        assertNull(testedRotationLinkedList.rotateLinkedList(new LinkedList<Integer>(), steps));
        assertNull(testedRotationLinkedList.rotateLinkedList(testedList, -1));
    }
}
