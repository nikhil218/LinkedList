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

    public void append(INode newNode){
        if(this.head==null){
            this.head=newNode;
            this.tail=newNode;
        }else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void insert(INode myNode, INode newNode){
       INode tempNode = myNode.getNext();
       myNode.setNext(newNode);
       newNode.setNext(tempNode);
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
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(56);
        MyNode<Integer> myThirdNode = new MyNode<>(30);
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        System.out.println("beforfe insert");
        myLinkedList.printNodes();
        myLinkedList.insert(mySecondNode, myThirdNode);
        System.out.println("after insert");
        myLinkedList.printNodes();
        //myLinkedList.append(myThirdNode);
        //myLinkedList.printNodes();
    }
}
