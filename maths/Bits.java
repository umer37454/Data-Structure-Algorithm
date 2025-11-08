package maths;

public class Bits {
    public static void main(String[] args) {
        System.out.println(isOdd(5));
        System.out.println(bruteFindUnique(new int[]{5, 4, 3, 4, 6, 7, 3, 5, 7}));
        System.out.println(findUnique(new int[]{5, 4, 3, 4, 6, 7, 3, 5, 6}));
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static int bruteFindUnique(int[] array) {
        int unique = -1;
        boolean flag = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if(array[i] == array[j]) {
                        flag = false;
                    }
                }
            }

            if(flag) {
                unique = array[i];
            } else {
                flag = true;
            }
        }

        return unique;
    }
    
    public static int findUnique(int[] array) {
        int unique = 0;
        
        for (int n : array) {
            unique = unique ^ n;
        }
        return unique;
    }
}
