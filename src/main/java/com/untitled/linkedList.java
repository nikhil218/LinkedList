package com.untitled;

public class linkedList<K>{

   public INode head;
   public INode tail;

   public linkedList(){
       this.head = null;
       this.tail = null;
   }

   public void append(INode newNode){
       if(this.head==null){
           this.head=newNode;
           this.tail=newNode;
       }else {
           INode tempNode = this.head;
           this.head = newNode;
           this.head.setNext(tempNode);
       }
   }

    public void add(INode newNode){
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

   public void pop(){
       if(head == null){
           System.out.println("list is empty");
       }
       else if(head == tail){
           head = tail = null;
       }
       else {
           INode tempNode = head.getNext();
           this.head = tempNode;
       }
   }

   public void popLast() {
       if(head == null){
           System.out.println("list is empty");
       }
       else if(head == tail){
           head = tail = null;
       }
       else {
           INode tempNode = head;
           while (tempNode.getNext() != tail){
               tempNode = tempNode.getNext();
           }
           tail = tempNode;
           tail.setNext(null);
       }
   }

    public void findNode(K value){

        int i=1;
        boolean flag=false;

        if (head == null){
            System.out.println("List is empty");
        }else {
            INode tempNode = head;
            while (tempNode != null){
                if (tempNode.getKey() == value){
                    flag=true;
                    break;
                }else {
                    i++;
                    tempNode = tempNode.getNext();
                }
            }
            if (flag){
                System.out.println(value+" is present at the : "+ i +" location in list");
            }else {
                System.out.println("value absent");
            }
        }
    }

    public void findNodeThenInsert(K valueToFind, K valueToInsert){

        if (head == null){
            System.out.println("List is empty");
        }else {
            INode tempNode = head;
            while (tempNode != null){
                if (tempNode.getKey() == valueToFind){
                    MyNode<K> newNode = new MyNode<>(valueToInsert);
                    newNode.setNext(tempNode.getNext());
                    tempNode.setNext(newNode);
                    break;
                }else {
                    tempNode = tempNode.getNext();
                }
            }
        }
    }

    public void findNodeThenDelete(K valueToFind){

       INode tempNode=head, prevNode=null;

       if (tempNode != null && tempNode.getKey() == valueToFind){
           head = tempNode.getNext();
           return;
       }

       while (tempNode != null && tempNode.getKey() != valueToFind){
           prevNode = tempNode;
           tempNode = tempNode.getNext();
       }

       if(tempNode==null){
           return;
       }

       prevNode.setNext(tempNode.getNext());
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
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.add(myFourthNode);
        System.out.println("nodes before");
        myLinkedList.printNodes();
        System.out.println("nodes after");
        myLinkedList.findNodeThenDelete(56);
        myLinkedList.printNodes();
   }
}
