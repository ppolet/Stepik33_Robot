/*
На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. 
Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. 
Ваша задача — привести робота в заданную точку игрового поля.
Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна)

Пример:
В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:

robot.turnRight();
robot.stepForward();
robot.stepForward();
robot.stepForward();

---------------------------
public static void moveRobot(Robot robot, int toX, int toY) {
    robot.stepForward(); // your implementation here
}
---------------------------

P.S. Если вам понравилось это задание, то вам может прийтись по душе игра Robocode, в которой надо написать алгоритм управления танком. 
Алгоритмы, написанные разными людьми, соревнуются между собой.
 */
package stepik33_robot;

public class Stepik33_Robot {

    public static void main(String[] args) {
       Robot robot = new Robot(0,0,Direction.UP);
       
       int toX = 3;
       int toY = 5;
       
       //-----------------------------------
       
       //---X---
       if(robot.getX() != toX){
           if(robot.getX() > toX){          //turn LEFT
               if(robot.getDirection() == Direction.RIGHT){
                   robot.turnLeft();
                   robot.turnLeft();
               } else if(robot.getDirection() == Direction.UP){
                   robot.turnLeft();
               } else if(robot.getDirection() == Direction.DOWN){
                   robot.turnRight();
               }
           } else {                         //turn RIGHT
               if(robot.getDirection() == Direction.LEFT){
                   robot.turnLeft();
                   robot.turnLeft();
               } else if(robot.getDirection() == Direction.UP){
                   robot.turnRight();
               } else if(robot.getDirection() == Direction.DOWN){
                   robot.turnLeft();
               }
           }

           int stepCounts = Math.abs(robot.getX() - toX);
           for(int i = 0; i < stepCounts; i++){
               robot.stepForward();
           }
       }
       
       //---Y---
       if(robot.getY() != toY){
           if(robot.getY() > toY){          //turn DOWN
               if(robot.getDirection() == Direction.UP){
                   robot.turnLeft();
                   robot.turnLeft();
               } else if(robot.getDirection() == Direction.LEFT){
                   robot.turnLeft();
               } else if(robot.getDirection() == Direction.RIGHT){
                   robot.turnRight();
               }
           } else {                         //turn UP
               if(robot.getDirection() == Direction.DOWN){
                   robot.turnLeft();
                   robot.turnLeft();
               } else if(robot.getDirection() == Direction.LEFT){
                   robot.turnRight();
               } else if(robot.getDirection() == Direction.RIGHT){
                   robot.turnLeft();
               }
           }
           
           int stepCounts = Math.abs(robot.getY() - toY);
           for(int i = 0; i < stepCounts; i++){
               robot.stepForward();
           }
       }
       
        System.out.println("Robot: " + robot.getX() + ":" + robot.getY());
    }
    
}
