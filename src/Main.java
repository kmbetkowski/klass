class przestawTablice {
    public static int[] przestawTablice(int[] nums, int n) {
        int[] wynik = new int[2*n];

        for (int i=0; i<n; i++) {
            wynik[i*2] = nums[i];
            wynik[i*2+1] = nums[i+n];
        }
    return wynik;
    }
}

public class Main {
    public static void main(String[] args) {
