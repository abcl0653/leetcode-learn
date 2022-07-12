package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList876 {
    public ListNode solve(ListNode head) {

        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }

        return list.get(list.size()/2);
    }
}
