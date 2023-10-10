package org.example;

public class Main {

    public static void main(String[] args) {
       Participant[] participants = {
               new Cat(2,400,"Барбоскин"),
               new Human(2, 350, "Электродед"),
               new Robot(7, 100, "Кузьмич"),
               new Robot(7, 100, "Леха"),
               new Robot(7, 900, "Сяоми"),

       };
      Challenge[] challenges = {
              new RunningRoad(RoadLenght.LOW),
              new RunningRoad(RoadLenght.HIGH),
              new RunningRoad(RoadLenght.LOW),
              new RunningRoad(RoadLenght.HIGH),
//              new Wall(WallHeight.LOW),
//              new RunningRoad(RoadLenght.MEDIUM),
//              new RunningRoad(RoadLenght.MEDIUM),
//              new Wall(WallHeight.HIGH),
//              new RunningRoad(RoadLenght.HIGH),
//              new Wall(WallHeight.LOW),
//              new Wall(WallHeight.HIGH),
//              new Wall(WallHeight.HIGH)
      };

      for(Participant p: participants) {
          for (Challenge c: challenges) {
              if (!c.isCan(p)) break;
          }
      }
    }
}