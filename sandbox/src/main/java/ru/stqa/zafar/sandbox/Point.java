package ru.stqa.zafar.sandbox;

public class Point {

  public static void main(String[] args) {

    Distance d = new Distance ();
    d.p1 = 8;
    d.p2 = 2;
    System.out.println(" расстояния между точками " + d.p1+ " и " +  d.p2+ " = " + distance(d));

  }

  public static double distance( Distance d) {
    return  d.p1 -  d.p2;
  }




}
