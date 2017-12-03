package chapter8.section4;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Description: 多态的效果
 * CreateTime: 2017/11/30 16:38
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class Shapes {

    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        int shapeCount = 5;
        Shape[] s = new Shape[shapeCount];
        for (int i = 0; i < shapeCount; i++) {
            s[i] = gen.next();
        }
        for (Shape shp : s) {
            shp.draw();
            shp.erase();
            shp.printMsg();
        }
    }
}

class Shape {

    public void draw() {

    }

    public void erase() {

    }

    public void printMsg() {
        print("printMsg");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        print("Circle.draw");
    }

    @Override
    public void erase() {
        print("Circle.erase");
    }
}

class Square extends Shape {

    @Override
    public void draw() {
        print("Square.draw");
    }

    @Override
    public void erase() {
        print("Square.erase");
    }

    @Override
    public void printMsg() {
        print("Square.printMsg");
    }
}

class Triangle extends Shape {

    @Override
    public void draw() {
        print("Triangle.draw");
    }

    @Override
    public void erase() {
        print("Triangle.erase");
    }
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        print("Rectangle.draw");
    }

    @Override
    public void erase() {
        print("Rectangle.erase");
    }

    @Override
    public void printMsg() {
        print("Rectangle.printMsg");
    }
}

class RandomShapeGenerator {
    //工厂

    private Random rand = new Random(1);

    Shape next() {
        switch (rand.nextInt(4)) {
            default:
                print("other");
            case 0:
                print(0);
                return new Circle();
            case 1:
                print(1);
                return new Square();
            case 2:
                print(2);
                return new Triangle();
            case 3:
                print(3);
                return new Rectangle();
        }
    }
}