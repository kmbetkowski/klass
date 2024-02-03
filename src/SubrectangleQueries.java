public class SubrectangleQueries{
    int[][] ractangle;
    SubrectangleQueries(int[][] ractangle) {
        this.ractangle = ractangle;
    }
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i=row1; i<= row2; i++) {
            for(int j=col1; i<= col2; j++) {
                ractangle[i][j] = newValue;
            }
        }
    }
    public int getValue(int row, int col) {
        return ractangle[row][col];
    }
}
