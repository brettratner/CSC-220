/**                                                                                                                                          /**
 *Brett Ratner
 *CSC220-02
 *Lab12
 */

/**
 * this class has two private integers one is the x location point and the other 
 * is the y location point 
 */

public class RatnerBrett_Point {

    private int pointX;
    private int pointY;
   
    /**
     * Constructor
     */
    public RatnerBrett_Point(int pointX, int pointY){
        this.pointX = pointX;
        this.pointY = pointY;
       
    }
   
    /**
     *  the x point mutator
     */
    public void setPointX(int x){
        this.pointX = x;
    }
   
    /**
     * the x point accessor
     */
     public int getPointX(){
         
         return this.pointX;
     }
     
     /**
      * the y point mutator
      */
      public void setPointY(int y){
          this.pointY = y;
      }

      /**
       * the y point accessor
       */
      public int getPointY(){
         
        return this.pointY;
      }
     /**
      * returns the x point and the y point
      */
      public String toString(){
       
          return "x point = " + this.pointX + "\ty point = " + this.pointY;
      }
     
    /**
     *Unit testing for the Point class
     * */
        /*public static void main(String[] args){
          Scanner scan = new Scanner(System.in);
     
      RatnerBrett_Point point = new RatnerBrett_Point(0,0);
     
     

    System.out.println("enter  in the x and y points");
   
    point.pointX = scan.nextInt();
    point.pointY = scan.nextInt();
   
   
    System.out.println(point.toString());
    }
*/
}
