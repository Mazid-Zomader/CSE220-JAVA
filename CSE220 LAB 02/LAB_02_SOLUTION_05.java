// Task05: Alternate Merge
public class LAB_02_SOLUTION_05 {

    public static Node alternateMerge( Node head1, Node head2 ){
        
        //You're supposed to create a new Singly Linked List in this method

        //TODO

        //remove the following line when you're ready to return
        Node temp1 = head1;
        Node temp2 = head2;
        Node head = new Node(temp1.elem, null);
        temp1 = temp1.next;
        Node tail = head;
        while (temp2 != null) {
            tail.next = new Node(temp2.elem, null);
            tail = tail.next;
            if (temp1 == null) {
                break;
            } else {
                tail.next = new Node(temp1.elem, null);
                tail = tail.next;
            }
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{1,2,6,8,11});
        Node head2 = LinkedList.createList(new Integer[]{5,7,3,9,4});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        Node result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4
        System.out.println();
        
        System.out.println("\n==============Test Case 2=============");
        head1 = LinkedList.createList(new Integer[]{5,3,2,-4});
        head2 = LinkedList.createList(new Integer[]{-4,-6,1});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4
        System.out.println();

        System.out.println("\n==============Test Case 3=============");
        head1 = LinkedList.createList(new Integer[]{4,2,-2,-4});
        head2 = LinkedList.createList(new Integer[]{8,6,5,-3});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 4 -> 8 -> 2 -> 6 -> -2 -> 5 -> -4 -> -3");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 4 -> 8 -> 2 -> 6 -> -2 -> 5 -> -4 -> -3
        System.out.println();
    }
}
