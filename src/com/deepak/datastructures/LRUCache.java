/*
package com.deepak.datastructures;

*/
/**
 @author narasimha.s
 Date 3/17/22
 *//*

public class LRUCache<K, V> {

    Node head, tail;

    private static class Node<K,V> {
        K key;
        V value;
        Node next;
        Node prev;

        Node(final K key, final V value, final Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public void add(final K key, final V value){
        this.head = new Node(key, value, this.head);
        if(this.tail == null) {
            this.tail = this.head;
        }
    }


    final Node evict(){
        final Node nodeToEvict = this.tail;
        if(this.tail != null){
            if(this.tail.prev != null){
                this.tail = this.tail.prev;
                this.tail.prev = null;
                return nodeToEvict;
            }
            this.tail = null;
            this.head = null;
            return nodeToEvict;
        }
    }

}
*/
