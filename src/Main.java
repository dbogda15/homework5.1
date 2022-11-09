public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("задание 1");
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }


        System.out.println(" ");

        double[] decimal = {1.57, 7.654, 9.986};
        for (int a = 0; a < decimal.length; a++) {
            System.out.print(decimal[a] + " ");
        }

        System.out.println(" ");

        int[] weight = {54, 54, 52, 55, 54, 53, 52, 51, 51, 50};
        for (int b = 0; b < weight.length; b++) {
            System.out.print(weight[b] + " ");
        }


        //задание 2
        System.out.println("\nЗадание 2");
        int numbersComma[] = new int[3];
        for (int a = 0; a < numbersComma.length; a++) {
            numbersComma[a] = a + 1;
            if (numbersComma[a] <= numbersComma.length - 1) {
                System.out.print(numbersComma[a] + ", ");
            } else {
                System.out.print(numbersComma[a] + " ");
            }
        }
        System.out.println(" ");

        double[] decimalComma = {1.57, 7.654, 9.986};
        for (int j = 0; j < decimalComma.length;j ++) {
            if (j < decimalComma.length - 1) {
                System.out.print(decimalComma[j] + ", ");
            } else {
                System.out.print(decimalComma[j] + " ");
            }
        }

        System.out.println(" ");

        int[] weightComma = {54, 54, 52, 55, 54, 53, 52, 51, 51, 50};
        for (int b = 0; b < weightComma.length; b++) {
        if (b < weightComma.length - 1) {
            System.out.print(weightComma[b] + ", ");
        } else {
        System.out.print(weightComma[b] + " ");
           }
        }


        //задание 3
        System.out.println("\nЗадание 3");
        int numbersMirror[] = new int[3];
        for (int a = numbersMirror.length - 1; a >= 0; a--) {
            if (a > 0) {
                System.out.print(numbersComma[a] + ", ");
            } else {
                System.out.print(numbersComma[a] + " ");
            }
        }
        System.out.println();

        double[] decimalMirror = {1.57, 7.654, 9.986};
        for (int j = decimalMirror.length - 1; j >= 0; j --) {
            if (j > 0) {
                System.out.print(decimalMirror[j] + ", ");
            } else {
                System.out.print(decimalMirror[j] + " ");
            }
        }

        System.out.println(" ");

        int[] weightMirror = {54, 54, 52, 55, 54, 53, 52, 51, 51, 50};
        for (int b = weightMirror.length - 1; b >= 0; b --) {
            if (b > 0) {
                System.out.print(weightMirror[b] + ", ");
            } else {
                System.out.print(weightMirror[b] + " ");
            }
        }

        //Задание 4
        System.out.println("\nЗадание 4");
        int [] array = {1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array [i] + 1;
                System.out.print(array[i] + " ");
        }
            else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
