/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 29/08/20
 *  Time: 10:26 AM
 *  File Name : Example3.java
 * */
package definitions.examples;

public class Example3 {
    public static void main(String[] args) {

    }
}
class A1 {
    public int i, j;

    void setValue(int x, int y) {
        i = x;
        j = y;
        System.out.println("i = " + i + ", j = " + j);
    }

    public int sum(int x, int y) {
        int sum = i + j;
        return sum;
    }
}
class B1 extends A1 {

}