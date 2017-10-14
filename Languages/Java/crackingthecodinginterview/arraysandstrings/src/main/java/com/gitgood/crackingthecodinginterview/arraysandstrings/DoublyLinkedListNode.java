package com.gitgood.crackingthecodinginterview.arraysandstrings;


public class DoublyLinkedListNode<T> extends LinkedListNode<T> {
    protected LinkedListNode<T> prev;

    public LinkedListNode<T> getPrev(){
        return this.prev;
    }
    public void setPrev(LinkedListNode<T> prev){
        this.prev = prev;
    }

    @Override
    public DoublyLinkedListNode<T>  makeList(java.util.List<T> listOfItems) {
        java.util.Iterator<T> it = listOfItems.iterator();
        if(!it.hasNext()){
            return null;
        }
        DoublyLinkedListNode<T> head = new DoublyLinkedListNode<T>(it.next());
        DoublyLinkedListNode<T> prev = head;
        DoublyLinkedListNode<T> current;
        while (it.hasNext()) {
            current = new DoublyLinkedListNode<T>(it.next());
            prev.next = current;
            current.prev = prev;
            prev = current;
        }
        return head;
    }

    public DoublyLinkedListNode(java.util.List<DoublyLinkedListNode<T>> newList){
        java.util.Iterator<DoublyLinkedListNode<T>> it = newList.iterator();
        DoublyLinkedListNode<T> head = it.next();
        DoublyLinkedListNode<T> prev = head;
        DoublyLinkedListNode<T> current;
        while(it.hasNext()){
            current = it.next();
            prev.next = current;
            current.prev = prev;
            prev = current;
        }
        this.data = head.data;
        this.prev = head.prev;
        this.next = head.next;
    }

    public DoublyLinkedListNode(T data){
        this.data = data;
    }

    public DoublyLinkedListNode(){

    }
}
