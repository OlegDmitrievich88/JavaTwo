package LessonFive;

public class Potok {
    static final int size = 10000000;
    static final int h = size / 2;
   // private static Object mon = new Object();
    //float[] arr = new float[size];

    public static void main(String[] args){
        float[] arr = new float[size];
        for (int i = 0; i< arr.length; i++){
            arr[i] = 1;
           // System.out.print(arr[i]);
        }
        long a = System.currentTimeMillis();
        marr(arr);
//        for (int i = 0; i< arr.length; i++){
//            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//        }
        long b = System.currentTimeMillis();
        long time = b - a;
        System.out.println(time);

        a = System.currentTimeMillis();
        twopotok(arr);
        b = System.currentTimeMillis();
        time = b - a;
        System.out.println(time);

    }

    public static void twopotok(float[] arr) {
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                marr(arr1);
            }
        };
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                marr(arr2);
            }
        };
        new Thread(r, "mass1").start();
        new Thread(r1,"mass2").start();

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
    }

    private synchronized static void marr(float[] arr) {

        for (int i = 0; i< arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        //System.out.print(arr[i]);
        }
    }
}
