package com.untitled;

public class linkedList{

   public INode head;
   public INode tail;

   public linkedList(){
       this.head = null;
       this.tail = null;
   }

   public void add(INode newNode){
       if(this.tail==null){
           this.tail=newNode;
       }
       if(this.head==null){
           this.head=newNode;
       }else {
           INode tempNode = this.head;
           this.head = newNode;
           this.head.setNext(tempNode);
       }
   }

   public void printNodes(){

       if (head == null){
           System.out.println("List is empty");
       }else {
           INode tempNode = head;
           while (tempNode != null){
               System.out.println(tempNode.getKey());
               tempNode = tempNode.getNext();
           }
       }
   }

    public static void main(String[] args) {

        linkedList myLinkedList = new linkedList();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printNodes();
    }
}
