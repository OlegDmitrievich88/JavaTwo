package LessonTwo;



public class Exception {
    public static void main(String[] args) {
        String string = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        String[][] mass3 = new String[4][4];
        int[][] massInt = new  int[4][4];
        transformatiomString(string, mass3);
       System.out.println(massInt(mass3));

    }

    public static String transformatiomString(String string, String [][] mass3) {
        String[] mass = string.split("\n");
        try {
            for (int i = 0; i < mass.length; i++) {
                String[] mass2 = mass[i].split(" ");
                for (int j = 0; j < mass2.length; j++) {
                    mass3[i][j] = mass2[j];
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        return string;
    }

    public static int massInt(String[][] mass3) {
        int[][] massInt = new  int[4][4];
        for (int j = 0; j < mass3.length; j++){
            for (int i = 0; i< mass3.length; i++){
                try {
                    massInt[j][i]= Integer.parseInt(mass3[j][i]);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i< massInt.length; i++){
            for (int j = 0; j< massInt.length; j++){
               sum += massInt[i][j];
            }
        }
        sum = sum/2;
        return sum;
    }

}


