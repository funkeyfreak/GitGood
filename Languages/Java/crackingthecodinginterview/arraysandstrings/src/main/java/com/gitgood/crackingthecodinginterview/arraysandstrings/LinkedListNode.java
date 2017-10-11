package com.gitgood.crackingthecodinginterview.arraysandstrings;



public class LinkedListNode <T> extends Node<T> {
    protected LinkedListNode<T> next;
    public LinkedListNode<T> getNext(){
        return this.next;
    }
    public void setNext(LinkedListNode<T> next){
        this.next = next;
    }
    public LinkedListNode<T>  makeList(java.util.List<T> listOfItems) {
        java.util.Iterator<T> it = listOfItems.iterator();
        if(!it.hasNext()){
            return null;
        }
        LinkedListNode<T> head = new LinkedListNode<T>(it.next());
        LinkedListNode<T> prev = head;
        LinkedListNode<T> current;
        while (it.hasNext()) {
            current = new LinkedListNode<T>(it.next());
            prev.next = current;
            prev = current;
        }
        return head;
    }
    public LinkedListNode(java.util.List<LinkedListNode<T>> newList){
        java.util.Iterator<LinkedListNode<T>> it = newList.iterator();
        LinkedListNode<T> head = it.next();
        LinkedListNode<T> prev = head;
        LinkedListNode<T> current;
        while (it.hasNext()){
            current = it.next();
            prev.next = current;
            prev = current;
        }
        this.data = head.data;
        this.next = head.next;
    }

    public LinkedListNode(T data){
        this.data = data;
    }
    public LinkedListNode(){}

}
