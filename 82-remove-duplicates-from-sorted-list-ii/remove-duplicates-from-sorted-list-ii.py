# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head
        prev = dummy
        current = head

        while current:
        # Check if it's a duplicate group
            if current.next and current.val == current.next.val:
                dup_val = current.val
            # Skip all nodes with this duplicate value
                while current and current.val == dup_val:
                    current = current.next
                prev.next = current  # skip the whole duplicate group
            else:
                prev = current
                current = current.next

        return dummy.next