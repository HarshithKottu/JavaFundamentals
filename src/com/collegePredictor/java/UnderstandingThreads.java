package com.collegePredictor.java;

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Sleep for half a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AlphabetThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Alphabet: " + c);
            try {
                Thread.sleep(500); // Sleep for half a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class UnderstandingThreads {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        AlphabetThread alphabetThread = new AlphabetThread();

        numberThread.start();
        alphabetThread.start();
    }
}
