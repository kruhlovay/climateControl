public class AreaDeterminant {
private int length;
private int width;
    public AreaDeterminant(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea(AreaDeterminant areaDeterminant){
       int area = areaDeterminant.length * areaDeterminant.width;
        System.out.println(area);
        return area;

    }
}
