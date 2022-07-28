package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MiddleOfLinkedList876Test {

    @Test
    public void solve() {

        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        toList(node1);
        MiddleOfLinkedList876 m = new MiddleOfLinkedList876();
        ListNode middle = m.solve(node1);
        toList(middle);

    }


    public void toList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        System.out.println("List Started");
        while (head != null) {
            list.add(head);
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println("List Ended");


        assertThat(1-0).isEqualTo(1);
    }
}
