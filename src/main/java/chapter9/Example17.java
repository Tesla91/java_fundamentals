package main.java.chapter9;

// An exception for queue-empty errors.
class QueueEmptyException extends Exception {

    public String toString() {
        return "\nQueue is empty.";
    }
}