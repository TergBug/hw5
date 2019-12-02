package org.mycode;

import java.util.LinkedList;

public class RotationLinkedList {
    public LinkedList<Integer> rotateLinkedList(LinkedList<Integer> list, int stepsOfRotate){
        if(list == null || list.size()==0 || stepsOfRotate<0) return null;
        for (int i = 0; i < stepsOfRotate; i++) list.offerFirst(list.pollLast());
        return list;
    }
}
