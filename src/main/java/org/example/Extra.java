package org.example;

public interface Extra {
    default boolean superRun(String name) {
        System.out.println("Робот " + name + " пробежал с допингом");
        Robot.superRunCount--;
        return true;
    }
}
