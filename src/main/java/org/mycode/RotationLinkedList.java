package org.mycode;

import java.util.LinkedList;

public class RotationLinkedList {
    private final static String messageGreeting = "--- Rotation of linked list ---";
    private final static String messageValue = "Enter number of rotational steps (positive integer): ";
    public LinkedList<Integer> rotateLinkedList(LinkedList<Integer> list, int stepsOfRotate){
        if(list == null || list.size()==0 || stepsOfRotate<0) return null;
        for (int i = 0; i < stepsOfRotate; i++) list.offerFirst(list.pollLast());
        return list;
    }
    public void getWork(){
        UsersInput input = new UsersInput();
        LinkedList<Integer> list = (LinkedList<Integer>) input.inputList(1, messageGreeting);
        int value = input.inputValue(messageValue, false);
        input.showOldList(list);
        list = rotateLinkedList(list, value);
        input.showNewList(list);
    }
}
