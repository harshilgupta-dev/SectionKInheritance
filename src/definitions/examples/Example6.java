/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 29/08/20
 *  Time: 3:15 PM
 *  File Name : Example6.java
 * */
package definitions.examples;

public class Example6 {
    public static void main(String[] args) {

    }
}

class Airplane {
    private int airplaneID;
    private int numberOfSeats;

    public Airplane(int airplaneID, int numberOfSeats) {
        this.airplaneID = airplaneID;
        this.numberOfSeats = numberOfSeats;
    }

    public int getAirplaneID() {
        return airplaneID;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void display() {
        System.out.println("airplaneID = " + airplaneID);
        System.out.println("numberOfSeats = " + numberOfSeats);
    }
}

class JetPlane {

}