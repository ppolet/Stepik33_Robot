package stepik33_robot;

public class Robot {
    int x;
    int y;
    Direction direction;
    
    public Robot (int x, int y, Direction direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    
    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        if(direction == Direction.UP) {direction = Direction.LEFT;}
        else if(direction == Direction.RIGHT) {direction = Direction.UP;}
        else if(direction == Direction.DOWN) {direction = Direction.RIGHT;}
        else if(direction == Direction.LEFT) {direction = Direction.DOWN;}
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }    
}
