package org.example;

public class Robot implements Participant, Extra{
    int maxHeight;
    int maxLenght;
    String name;

    static int superRunCount = 2;

    public Robot(int maxHeight, int maxLenght, String name) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println("Робот " +this.name + " пробежал " + dist + " м");
            return true;
        }
        else if (superRunCount != 0) {
            return superRun(name);
        }
        else System.out.println("Робот " +this.name + " не смог пробежать " + dist + " м и выбывает");
        return false;
    }
    @Override
    public boolean jump(int height) {
        if (height<= maxHeight) {
            System.out.println("Робот "+ this.name+ " перепрыгнул " + height  +" м");
            return true;
        }
        else {
            System.out.println("Робот "+ this.name+ " не смог перепрыгнуть " + height  +" м и выбывает");
            return false;
        }
    }

}
