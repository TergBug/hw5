package org.mycode;

import java.util.ArrayList;
import java.util.TreeSet;

public class ConvertToBSTree {
    public TreeSet<Integer> convertToTree(ArrayList<Integer> list){
        if(list==null || list.size()==0) return null;
        return new TreeSet<>(list);
    }
}
