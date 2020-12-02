import java.util.LinkedList;

public class LinkedListQuiz {
    public static void main(String[] args) {
        ListNode current = firstNode;
        ListNode previous = null;
        while (current != null){
            if(current.getValue().equals(val)){
                if(current.equals(firstNode)){
                    firstNode = current.getNext();
                    previous = current;
                }
                else{
                    previous.setNext(current.getNext());
                }
            }
            else{
                previous = current;
            }
            current = current.getNext();
        }
    }
}
