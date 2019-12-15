package Chapter4.Dog;

public class Dog {

    //Define variables of this class, these are the state of the dog class
    //Some behaviors are affected by state, like how bark() is affected by size
    int size;
    String name;

    //define the "bark" method. This is a behavior which depends on the state
    //We can also send a number of barks into the method(parameters)
    void bark(int numOfBarks) {

        //Define the variable message in which a message or bark type will be stored
        String msg;

        //Based on the size we get a different bark from the dog
        if (size > 60) {
            msg = "Wooof! ";
        } else if (size > 14) {
            msg = "Ruff! ";
        } else {
            msg = "Yip! ";
        }

        //While the bark count is not 0, run this
        while (numOfBarks > 0) {
            System.out.print(msg);
            numOfBarks = numOfBarks - 1;
        }

        //New line so the next line the programmer or user prints doesn't print on the same line
        System.out.println("");
    }

    //Let's define a value returning method for our dog called, is pooping, because you obviously need to know if your dog is pooping
    boolean isPooping() {

        //The dog is ppoping about 45% of the time
        int rand = (int) ( Math.random()  * 100 );

        if (rand <= 45) {
            return true;
        } else {
            return false;
        }

    }

}
