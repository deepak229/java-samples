/*
package com.deepak.threads;

import java.util.concurrent.ExecutorService;

*/
/**
 @author narasimha.s
 Date 3/30/22
 *//*

public class ThreadExample implements Runnable{

    private final Thread parenThread;
    public ThreadExample(final String name) {
        this(name, null);
    }
    public ThreadExample(final String name, final Thread parenThread) {
        Thread.currentThread().setName(name);
        this.parenThread = parenThread;
    }

    private static ExecutorService s;

    @Override
    public void run() {
        System.out.println(getExecutorService() +" by thread: "+ Thread.currentThread().getName());
    }

    */
/*public static synchronized ExecutorService getExecutorService(){
        if(s == null){
            s =
        }
        return s;
    }*//*


    public static void main(final String[] args) {

        Thread[] ts = new Thread[1000];
        for(int i=0;i<1000;i++){
            final ThreadExample te1 = new ThreadExample("Thread"+i);
            final Thread t = new Thread(te1);
            ts[i] = t;
        }

        for(Thread t: ts){
            t.start();
        }
    }
}
*/
