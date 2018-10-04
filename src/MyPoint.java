import java.lang.Math;
public class MyPoint {

    private int xVal;
    private int yVal;

    public MyPoint() {
        this.xVal = 0;
        this.yVal = 0;
    }

    public MyPoint(int xVal, int yVal) {
        setxVal(xVal);
        setyVal(yVal);
    }



    //public int getxVal() {
   //     return xVal;
   // }

    //public int getyVal() {
    //    return yVal;
   // }



    public void setxVal(int xVal) {
        this.xVal = xVal;
    }

    public void setyVal(int yVal) {
        this.yVal = yVal;
    }



    public void moveHorizontally(int xUnits)
    {
        xVal += xUnits;
    }

    public void moveVertically(int yUnits)
    {
        yVal += yUnits;
    }

    public void translate(int xUnits,int yUnits)
    {
        //xVal += xUnits;
        //yVal += yUnits;

        moveHorizontally(xUnits);
        moveVertically(yUnits);
    }

    public double distanceFromOrigin()
    {
        return Math.sqrt((xVal*xVal)+(yVal*yVal));
    }


    @Override
    public String toString() {
        return xVal+","+yVal ;
    }
}
