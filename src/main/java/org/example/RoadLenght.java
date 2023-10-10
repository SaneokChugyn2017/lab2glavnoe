package org.example;

public enum RoadLenght {
    LOW("Короткая дистанция", 50), MEDIUM("Средняя дистанция", 100), HIGH("Длинная дистанция", 300);
    private String title;
    private  int lenght;
    RoadLenght(String title, int lenght) {
        this.title = title;
        this.lenght = lenght;
    }

    public String getTitle() {
        return title;
    }

    public int getLenght() {
        return lenght;
    }
}