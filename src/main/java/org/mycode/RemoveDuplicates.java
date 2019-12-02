package org.mycode;

import java.util.ArrayList;

public class RemoveDuplicates {
    public int removeDuplicatesInList(ArrayList<Integer> list){
        if(list == null || list.size()==0) return -1;
        int tail = list.size()-1;
        for(int i = 0; i<=tail; i++){
            for (int j = i+1; j <=tail; j++) {
                if(list.get(i)==list.get(j)){
                    exchangeElements(list, j, tail--);
                    for (int indexForShift = tail; indexForShift > j; indexForShift--) exchangeElements(list, j, indexForShift);
                    j--;
                }
            }
        }
        return tail+1;
    }
    private void exchangeElements(ArrayList<Integer> list, int index1, int index2){
        list.set(index1, list.get(index1)+list.get(index2));
        list.set(index2, list.get(index1)-list.get(index2));
        list.set(index1, list.get(index1)-list.get(index2));
    }
}
