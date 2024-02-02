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
        int[] nums = {1,2,3,4,4,3,2,1};
        int n=4;

        int[] wynik = przestawTablice.przestawTablice(nums, n);

        for(int i=0; i<wynik.length; i++) {
            System.out.print(wynik[i]);
            if(i < wynik.length - 1) {
                System.out.print(", ");
            }
        }

    }
}