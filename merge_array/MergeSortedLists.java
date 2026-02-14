import java.util.Scanner;

public class MergeSortedLists {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Merge two sorted linked lists
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    // Create linked list from array
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }

    // Print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first list
        System.out.print("Enter number of elements in first list: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first sorted list:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input for second list
        System.out.print("Enter number of elements in second list: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second sorted list:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Create linked lists
        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        // Merge lists
        ListNode merged = mergeTwoLists(list1, list2);

        System.out.println("Merged Sorted List:");
        printList(merged);

        scanner.close();
    }
}
