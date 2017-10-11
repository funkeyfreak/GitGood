package com.gitgood.crackingthecodinginterview.arraysandstrings;

public abstract class Node<T> {
    //TODO make private
    protected T data;
    public T get(){
        return data;
    }
    public void set(T data){
        this.data = data;
    }
    public Node(T data){
        this.data = data;
    }
    public Node(){

    }
}
