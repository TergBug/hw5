package org.mycode;

public class Runner {
    public static void main( String[] args ) {
        if(args.length==0) {
            System.out.println("Missed argument");
            return;
        }
        switch (args[0]){
            case "rot":
                RotationLinkedList rotation = new RotationLinkedList();
                rotation.getWork();
                break;
            case "part":
                PartitionOfListByValue partition = new PartitionOfListByValue();
                partition.getWork();
                break;
            case "dup":
                RemoveDuplicates duplicates = new RemoveDuplicates();
                duplicates.getWork();
                break;
            case "convert":
                ConvertToBSTree convert = new ConvertToBSTree();
                convert.getWork();
                break;
            default:
                System.out.println("Missed argument");
        }
    }
}
