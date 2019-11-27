package org.mycode;

import java.util.*;

public class UsersInput {
    private final static String messageRuleOfEnteringList = "Rules: <integer number to insert element | null to finish inserting>";
    private final static String messageEnterList = "Enter element: ";
    private final static String messageOldList = "Old list: ";
    private final static String messageNewList = "New list: ";
    private final static String messageTreeSet = "Tree: ";
    private final static String messageWrongInput = "!Follow rules!";
    private final static String patternNumsOrNull = "(-?\\d+)|(null)";
    private final static String patternNumsCanBeNegative = "-?\\d+";
    private final static String patternNums = "\\d+";
    /**
     * Input list from console by user.
     * @param typeOfList If 0 - ArrayList, if 1 - LinkedList
     * @param messageGreeting First greeting message
     * @return List
     */
    public List<Integer> inputList(int typeOfList, String messageGreeting){
        List<Integer> numList;
        switch (typeOfList){
            case 0:
                numList = new ArrayList<>();
                break;
            case 1:
                numList = new LinkedList<>();
                break;
            default: return null;
        }
        System.out.println(messageGreeting);
        System.out.println(messageRuleOfEnteringList);
        String input;
        while (!(input = validation(patternNumsOrNull, messageEnterList, messageWrongInput)).equals("null") || numList.size()==0){
            if(!input.equals("null")) numList.add(Integer.parseInt(input));
        }
        return numList;
    }
    public int inputValue(String messageValue, boolean canBeNegative){
        return Integer.parseInt(validation(canBeNegative ? patternNumsCanBeNegative : patternNums, messageValue, messageWrongInput));
    }
    public void showOldList(List<Integer> oldList){
        System.out.print(messageOldList);
        oldList.forEach(element -> System.out.print(element+" "));
        System.out.println();
    }
    public void showNewList(List<Integer> newList){
        System.out.print(messageNewList);
        newList.forEach(element -> System.out.print(element+" "));
        System.out.println();
    }
    public void showTreeSet(TreeSet<Integer> tree){
        System.out.print(messageTreeSet);
        tree.forEach(el -> System.out.print(el+" "));
        System.out.println();
    }
    private String validation(String pattern, String shownText, String shownTextIfWrong){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(shownText);
            if(!scanner.hasNext(pattern)){
                if(scanner.hasNext()) scanner.next();
                System.out.println(shownTextIfWrong);
                continue;
            }
            return scanner.next();
        }while (true);
    }
}
