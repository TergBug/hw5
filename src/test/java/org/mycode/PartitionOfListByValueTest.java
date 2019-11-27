package org.mycode;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.LinkedList;

public class PartitionOfListByValueTest {
    private PartitionOfListByValue testedPartition = new PartitionOfListByValue();
    private LinkedList<Integer> testedList = new LinkedList<>();
    private LinkedList<Integer> partitionedList = new LinkedList<>();
    private int value = 3;
    @Before
    public void setupLists(){
        Collections.addAll(testedList, 1, 4, 3, 0, 5, 2);
        Collections.addAll(partitionedList, 1, 0, 2, 4, 3, 5);
    }
    @Test
    public void shouldPartitionList(){
        assertEquals(partitionedList, testedPartition.partitionOfLinkedList(testedList, value));
    }
    @Test
    public void shouldReturnNullInExceptionCases(){
        assertNull(testedPartition.partitionOfLinkedList(null, value));
        assertNull(testedPartition.partitionOfLinkedList(new LinkedList<Integer>(), value));
    }
}
