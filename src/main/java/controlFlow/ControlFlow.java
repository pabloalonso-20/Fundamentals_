package controlFlow;

public class ControlFlow {

    public String myMethod(int input) {
        if (input == 2) {
            return "true";
        } else if (input == 3)
            return "3 is may favorite number";
        else if (input == 4)
            return "4 is my fave number";
        else {
            return "false";
        }
    }


    public String switchMethod(int input) {
        switch (input) {
            case 1:
                return "that's one";
            case 2:
                return "that's two";
            case 3:
                System.out.println("you need a break");
                break;
            case 4:
                return "that's four";
            default:
                return "default";
        }
        return "other default";
    }

    public String forMethod(){

        int[] ints = {1, 2, 3, 4, 5};


        for(int i = 0; i < 5; i++){
            System.out.println("I am in a for loop!");
        }

        outer:
        for(int el : ints){
            inner:
            for(int element : ints) {

                System.out.println(element);
                if (el == 3) {
//                    continue;
                    break inner;
                }
                System.out.println("i am after continue");
            }

            System.out.println("I am outside of the inner for loop");
        }


        return "nothing";
    }

//    public static void main(String[] args){
//
//        System.out.println("Hello World");
//        myMethod(2);
//
//    }
}
