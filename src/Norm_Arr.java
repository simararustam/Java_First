public class Norm_Arr {
    public static void main(String[] args) {
        // 1
        String[] rainbow = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};

        for (String color : rainbow) {
            System.out.print(color);
            if (color != rainbow[rainbow.length - 1]) {
                System.out.print(", ");
            }
        }
        // 2
        System.out.println("\n------------10 rand numb in array----------------");

        int[] rand_arr = new int[10];

        for (int idx = 0; idx < rand_arr.length; idx++) {
            int random = (int)(Math.random() * 10);
            rand_arr[idx] = random;
            System.out.print(rand_arr[idx] + " ");
        }
    }
}
