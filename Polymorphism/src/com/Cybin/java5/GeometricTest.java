package com.Cybin.java5;
/**
 * @author Chen Yuanbin
 * @create 2022-03-31 16:34
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricObject geometricObject1=new Circle("black",2,3);
        GeometricObject geometricObject2=new MyRectangle("green",2,4,4);
          GeometricTest geometricTest=new GeometricTest();
          if(geometricTest.equalsArea(geometricObject1,geometricObject2))
          {
              System.out.println("面积相同");
          }else
          {
              System.out.println("面积不同");
              System.out.println("G1:"+geometricTest.displayGeometricObject(geometricObject1));
              System.out.println("G2:"+geometricTest.displayGeometricObject(geometricObject2));
          }
    }
    public  boolean equalsArea (GeometricObject geometricObject1,GeometricObject geometricObject2)
    {
        return (geometricObject1.findArea()==geometricObject2.findArea());
    }
    public double displayGeometricObject(GeometricObject geometricObject )
    {
        return  geometricObject.findArea();
    }
}
