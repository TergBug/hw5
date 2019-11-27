package org.mycode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {
    private RemoveDuplicates testedRemovingDuplicates = new RemoveDuplicates();
    private ArrayList<Integer> testedList = new ArrayList<>();
    private ArrayList<Integer> removedDuplicatesList = new ArrayList<>();
    private int newLength = 5;
    @Before
    public void setupLists(){
        Collections.addAll(testedList, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4);
        Collections.addAll(removedDuplicatesList, 0, 1, 2, 3, 4);
    }
    @Test
    public void shouldRemoveDuplicatesAndReturnNewLength(){
        assertEquals(newLength, testedRemovingDuplicates.removeDuplicatesInList(testedList));
        assertEquals(removedDuplicatesList, testedList.subList(0, newLength));
    }
    @Test
    public void shouldReturnMinusOneInExceptionCases(){
        assertEquals(-1, testedRemovingDuplicates.removeDuplicatesInList(null));
        assertEquals(-1, testedRemovingDuplicates.removeDuplicatesInList(new ArrayList<>()));
    }
}
