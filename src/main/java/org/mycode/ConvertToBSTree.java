package org.mycode;

import java.util.ArrayList;
import java.util.TreeSet;

public class ConvertToBSTree {
    private final static String messageGreeting = "--- Convert to binary search tree ---";
    public TreeSet<Integer> convertToTree(ArrayList<Integer> list){
        if(list==null || list.size()==0) return null;
        return new TreeSet<>(list);
    }
    public void getWork(){
        UsersInput input = new UsersInput();
        ArrayList<Integer> list = (ArrayList<Integer>) input.inputList(0, messageGreeting);
        input.showOldList(list);
        input.showTreeSet(convertToTree(list));
    }
}
