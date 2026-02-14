class ListNode():
    def __init__(self, val=0,next=None):
        self.val=val
        self.next=next

def merge(l1,l2):
    d=ListNode()
    c=d

    while l1 and l2:
        if l1.val<=l2.val:
            c.next=l1
            l1=l1.next
        else:
            c.next=l2
            l2=l2.next
        c=c.next
    if l1:
        c.next=l1
    else:
        c.next=l2
    return d.next

def create_linked_list(arr):
    dummy = ListNode()
    current = dummy
    for num in arr:
        current.next = ListNode(num)
        current = current.next
    return dummy.next


# Helper function to print Linked List
def print_linked_list(head):
    result = []
    while head:
        result.append(head.val)
        head = head.next
    print(result)


# Example usage
list1 = create_linked_list(list(map(int,input().split())))
list2 = create_linked_list(list(map(int,input().split())))

merged = merge(list1, list2)

print_linked_list(merged)