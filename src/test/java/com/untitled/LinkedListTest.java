package com.untitled;

import org.junit.Test;
import org.junit.Assert;

public class LinkedListTest {
    @Test
    public void testTocheckIfNewNodesAreAddedToTop() {

        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        linkedList myLinkedList = new linkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);

    }
}
