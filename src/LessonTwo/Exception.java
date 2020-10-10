package LessonTwo;

import java.util.Arrays;

public class Exception {
    public static void main(String[] args) {
        String string = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        transformatiomString(string);

    }

    public static void transformatiomString(String string) {
        String[][] mass3 = new String[4][4];
        String[] mass = string.split("\n");
        for (int i = 0; i < mass.length; i++) {
            String[] mass2 = mass[i].split(" ");
                for (int j = 0; j < mass2.length; j++) {
                    mass3[i][j] = mass2[j];
                System.out.println(mass3[i][j]);
            }
        }
        int[][] massInt = new  int[4][4];
        for (int j = 0; j <mass3.length; j++){
            for (int i = 0;i<mass3.length; j++){
                massInt[j][i]=

            }
        }
    }

}


