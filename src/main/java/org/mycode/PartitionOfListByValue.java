package org.mycode;

import java.util.LinkedList;
import java.util.ListIterator;

public class PartitionOfListByValue {
    private final static String messageGreeting = "--- Partition of linked list to less and greater/equal than value ---";
    private final static String messageValue = "Enter key value (integer): ";
    public LinkedList<Integer> partitionOfLinkedList(LinkedList<Integer> list, int value){
        if(list == null || list.size()==0) return null;
        ListIterator<Integer> listIter = list.listIterator();
        int pointToMove = -1;
        int index = 1;
        while (listIter.hasNext()){
            index++;
            int currentNum = listIter.next();
            if(currentNum>=value && pointToMove==-1){
                pointToMove = index;
            }
            else if(currentNum<value && pointToMove!=-1){
                for(int i = 0; i<=index-pointToMove; i++) listIter.previous();
                listIter.add(currentNum);
                for(int i = 0; i<=index-pointToMove; i++) listIter.next();
                listIter.remove();
                pointToMove++;
            }
        }
        return list;
    }
    public void getWork(){
        UsersInput input = new UsersInput();
        LinkedList<Integer> list = (LinkedList<Integer>) input.inputList(1, messageGreeting);
        int value = input.inputValue(messageValue, true);
        input.showOldList(list);
        list = partitionOfLinkedList(list, value);
        input.showNewList(list);
    }
}
