package Blatt8.ExerciseSheet.src.firstJavaExercise;

public class MyCounter {
    private int n;

    public MyCounter(int n) {
        assert n >= 0 : "MyConter expects a non-negative value!";
        this.n = n;
    }

    public void countToN() {
        for (int i = 0; i <= this.n; i++) {
            System.out.println(i);
        }
    }
}
