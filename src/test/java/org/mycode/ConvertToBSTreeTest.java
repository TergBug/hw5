package org.mycode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class ConvertToBSTreeTest {
    private ConvertToBSTree testedConverter = new ConvertToBSTree();
    private ArrayList<Integer> testedArray = new ArrayList<>();
    private TreeSet<Integer> neededTree = new TreeSet<>();
    @Before
    public void setupArrayAndTree(){
        Collections.addAll(testedArray, 2, 6, 4, 8, 4, 3, 1, 2, 4);
        Collections.addAll(neededTree, 1, 2, 3, 4, 6, 8);
    }
    @Test
    public void shouldConvertArrayListToTreeSet(){
        assertEquals(neededTree, testedConverter.convertToTree(testedArray));
    }
    @Test
    public void shouldReturnMinusOneInExceptionCases(){
        assertNull(testedConverter.convertToTree(null));
        assertNull(testedConverter.convertToTree(new ArrayList<>()));
    }
}
