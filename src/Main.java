import java.util.ArrayList;

class Test {
    private int _x;
    public Test() {
        _x = 0;
    }
    public Test(int x) {
        _x = x;
    }
    public int getX() {return _x;}
    public void setX(int x) {_x = x;}
}
class Test2 {
    private int _y;
    public Test2() {
        _y = 0;
    }
    public Test2(int y) {
        _y = y;
    }
    public int getY() {return _y;}
    public void setY(int y) {_y = y;}
}
class Stuff<T> {
    private T _thing;
    public Stuff() {_thing = null;}
    public Stuff(T t) {_thing = t;}
    public T getThing() {return _thing;}
    public void setThing(T t) {_thing = t;}
    public void print() {
        if(_thing != null) {
            System.out.println("Type: " + _thing.getClass().getName() + ", value: " + _thing);
        }
        else {
            System.out.println("null member variable");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Test> stuff = new ArrayList<>();
        Stuff<Test> stuffTest = new Stuff<Test>();
        stuffTest.setThing(new Test(5));
        stuffTest.print();
        System.out.println(stuffTest.getThing().getX());
    }
}