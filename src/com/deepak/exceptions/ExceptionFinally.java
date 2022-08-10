package com.deepak.exceptions;

/**
 @author narasimha.s
 Date 4/25/22
 */
public class ExceptionFinally {
    static boolean locked = false;
    static String lockedBy = null;
    public static void main(String[] args) {
        //commit(100);

        final Thread t1 = new Thread(() -> {
            commit(10);
        },"t1");
        final Thread t2 = new Thread(() -> {
            commit(10);
        }, "t2");
        t1.start();
        t2.start();
    }

    public static void commit(final int attempt) {
        try {
            final String threadName = Thread.currentThread().getName();
            if(attempt == 0){
                if (!lockedBy.equals(threadName))
                    System.out.println("failing because I did not get my turn... " + threadName);
                else {
                    System.out.println("Done at my last attempt");
                }
                locked = false;
                lockedBy = null;
                return;
            }
            if(locked == false)
            {
                locked = true;
                lockedBy = threadName;
                System.out.println("locked by "+threadName);
            }
            else{
                if(!lockedBy.equals(threadName))
                    throw new RuntimeException("exception waiting for lock...");
            }
            if(attempt >= 1){
                throw new RuntimeException("exception in business logic");
            }
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage()+" "+attempt+" by thread "+Thread.currentThread().getName() );
            commit(attempt-1);
        }
        finally {
            System.out.println("finally do this...."+ attempt+" by thread "+Thread.currentThread().getName());
        }
    }
}
