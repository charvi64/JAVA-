package maxmin;

public class Main {

    public static void main(String[] args) {
        
        Integer[] intArray = {1, 5, 3, 9, 2};
        String[] stringArray = {"apple", "banana", "peach", "cherry", "kiwi"};
        Character[] charArray = {'a', 'z', 'c', 'm', 'b'};
        Float[] floatArray = {1.5f, 2.7f, 3.9f, 0.2f, 4.6f};
        
        MaxMinImpl<Integer> intMaxMin = new MaxMinImpl<>();
        MaxMinImpl<String> stringMaxMin = new MaxMinImpl<>();
        MaxMinImpl<Character> charMaxMin = new MaxMinImpl<>();
        MaxMinImpl<Float> floatMaxMin = new MaxMinImpl<>();
        
        
        
        System.out.println("Integer Array: Max = " + intMaxMin.findMax(intArray));
        System.out.println("integer Array: min = " + intMaxMin.findMin(intArray));
        System.out.println("String Array: Max = " + stringMaxMin.findMax(stringArray));
        System.out.println("String Array: Min = " + stringMaxMin.findMin(stringArray));
        System.out.println("Character Array: Max = " + charMaxMin.findMax(charArray));
        System.out.println("Character Array: MIn = " + charMaxMin.findMin(charArray));
        System.out.println("Float Array: Max = " + floatMaxMin.findMax(floatArray));
        System.out.println("Float Array: Min = " + floatMaxMin.findMin(floatArray));
    }
}