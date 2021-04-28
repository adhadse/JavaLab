/**
 * Mar, 4
 */

package javalab;

interface Mar04Interface {
    void do_something();
}

class Mar04 implements Mar04Interface {
    @Override
    public void do_something() {
        System.out.println("Done Something");
    }

    public void do_something(String data) {
        // overloaded method
        System.out.println("Done Something " + data);
    }

}
class Mar04Derived extends Mar04 {
    @Override
    public void do_something() {
        // Override function
        System.out.println("Done Something with override function");
    }
}
