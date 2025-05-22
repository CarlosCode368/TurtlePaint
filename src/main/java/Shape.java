abstract class Shape implements IDrawable{
    protected Turtle turtle;
    protected int xPosition;
    protected int yPosition;
    protected String colorName;
    protected int borderWidth;

    public void draw(){
        //child classes will override this
    }
    Shape(Turtle turtle, int xPosition, int yPosition, String colorName, int borderWidth, int width, int height){
        //NOTE no height, width or radius as not all shaped have these.
        this.turtle=turtle;
        this.xPosition=xPosition;
        this.yPosition=yPosition;
        this.colorName=colorName;
        this.borderWidth=borderWidth;
    }
}
