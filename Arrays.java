// The size of the array is set when it is created.
// The data type and scale of the array cannot be changed in perspective.
class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = new int[100];         // array of numbers for 100 cells
        String[] strings = new String[10];    // string array of 10 cells
        Person[] people = new Person[5];      // array of Person class objects

        strings[0] = "Hello";                 // assign a value to the first cell
        strings[1] = "Diana";              // assign a value to the second cell

        System.out.println(strings[0] + " " + strings[1]);   // get values by index

        //Fast  initialization array
        //During fast initialization, the size of the array is not specified - the size will be determined automatically in accordance with the number of elements transferred to the array.
        int[] numbersFast = new int[]{1, 2, 3, 4, 5};

        int[] numbersNoNew = {1, 2, 3, 4, 5};      // not new words new

        String[] stringsFast = {"Hello", "world!"};
        System.out.println(stringsFast[0]+" "+stringsFast[1]);   // get values by index

        //Copy Array System.arraycopy()
        System.arraycopy(numbersFast, 0, numbersNoNew, 1, numbersNoNew.length-1);
    }
}

class Person {
    // Add some fields and methods
}
