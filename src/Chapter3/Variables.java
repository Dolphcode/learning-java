package Chapter3;

public class Variables {

    public static void main(String[] args) {

        //Variables are like cips that contain information, here are several types of variables which hold primitives
        //Primitives hold simple values

        //bytes can contain numbers -128 to 127
        byte myByte = 12;

        //shorts(not that kind) can contain -32768 to 32767
        short myShort = 1000;

        //ints can contain -2147483648 to 2147483647
        int myInt = 1000000;

        //longs can contain a very large number on the positive and negative end
        long myLong = 100000000000L;

        //floats are the floating point equivalent to ints regarding amount of bits that can be contained
        float myFloat = 10000.5F;

        //doubles are the floating point equivalent to longs regarding amount of bits that can be contained
        double myDouble = 100000000000.5;

        //chars can contain individual characters
        char myChar = 'j';

        //Keep in mind the compiler won't let you put the contents of a large cup(like an int) into a small cup(like a byte) even if it can fit
        //You can do the other way around
        //Also remember not to use keywords for variable names like byte, boolean, final, volatile, e.t.c.

        //In addition to primitive variables are object-reference variables which contain references to objects, take this for example:
        Dog mydog = new Dog();

        //Below is the setup for an array
        Dog corgi = new Dog();
        Dog labrador = new Dog();
        Dog chihuahua = new Dog();

        //And below are two arrays which are like trays of cups each holding a specific type of container only, the Dog array will hold dogs and the Integer array will hold Ints
        Dog[] dogs = {corgi, labrador, chihuahua};
        int[] integers = {4, 5, 6};

        //You can contain or refer to an object or value in a list by getting using its index ( {index0, index1, index2 ... indexn} )
        Dog myFavoriteDog = dogs[0];
        int five = integers[1];
        //Now myFavoriteDog is the corgi object and four is set to 5

        //for creating an array of object references you can also set the length and defining each individual object
        Dog[] myDogArray;
        myDogArray = new Dog[7];
        myDogArray[0] = new Dog();

    }

}
