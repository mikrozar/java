import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Tank {
    private int x, y;
    private int dir;
    private int fuel;
    private String model;
    private static int number = 0;
    static int fillFuel = 0;
    //коммент
    public void goForward(int i) {
        switch (dir) {
            case 0:
                x=checkFuel1(x, i);
                break;
            case 1:
                y=checkFuel1(y, i);
                break;
            case 2:
                x=checkFuel2(x, i);
                break;
            case 3:
                y=checkFuel2(y, i);
                break;
            default:
                break;
        }
    }

    public void printPosition() {
        System.out.println("The Tank " + model + " is at " + x +", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public int checkFuel1(int direction, int steps) {
        if ((steps<fuel)&&(steps>0)) {
            direction += steps;
            fuel-=steps;
        } else if (steps>0) {
            direction += fuel;
            fuel = 0;
        } else {
            direction -= fuel;
            fuel = 0;
        }
        return direction;
    }

    public void refill (String what) {
        Pattern pattern = Pattern.compile("([0-9]+)");
        if (what=="?") {
            System.out.println("В баке танка " + model + " " + fuel + " литров");
        } else {
            Matcher matcher = pattern.matcher(what);
            if (matcher.find()) {
                fillFuel = parseInt(matcher.group(1));
                fuel += fillFuel;
                System.out.println("Заправка танка " + model + " на " + fillFuel + " произведена. В баке " + fuel + " литров");
            }
        }
    }

    public int checkFuel2(int direction, int steps) {
        return checkFuel2(direction, -steps);
      /*if ((steps<fuel)&&(steps>0)) {
          direction -= steps;
          fuel-=steps;
      } else if (steps>0) {
          direction -= fuel;
          fuel = 0;
      } else {
          direction += fuel;
          fuel = 0;
      }
      return direction;*/
    }

    public Tank() {
        name();
        x = 0;
        y = 0;
        fuel = 100;
    }

    public Tank(int x, int y, int fuel) {
        name();
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public Tank(int x, int y) {
        name();
        this.x = x;
        this.y = y;
        fuel = 100;
    }

    public String name() {
        number++;
        return model = "T34-"+number;
    }

}
