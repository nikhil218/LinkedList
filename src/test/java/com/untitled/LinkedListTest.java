package com.untitled;

import org.junit.Test;
import org.junit.Assert;

public class LinkedListTest {
    @Test
    public void checkIf3GivenNumbersFormALinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);

        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                        mySecondNode.getNext().equals(myThirdNode);

        Assert.assertTrue(result);

    }
}
