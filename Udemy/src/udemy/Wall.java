package udemy;

public class Wall {
    // write your code here
    double width,height;
    Wall(){
        
    }
    Wall(double width,double height){
        if(width<0)
        width=0;
        if(height<0)
        height=0;
        
        this.width=width;
        this.height=height;
    }
    public void setWidth(double width){
        if(width<0)
        width=0;
        this.width=width;
    }
    public void setHeight(double height){
        if(height<0)
        height=0;
        this.height=height; 
    }
    
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){
        double Area=height*width;
        return Area;
    }

public static void main(String []args)
{
	Wall wall=new Wall(5,4);
	System.out.println("area= "+wall.getArea());
	
	}}