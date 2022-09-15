public class ShapePrinter {
    /*****     - WORST PRACTICE -    *****/
    // public void drawShape(Object shape){
    //     if (shape instanceof Rectangle) {
    //         System.out.println("Rectangle");
    //     }else if (shape instanceof Square) {
    //         System.out.println("Square");
    //     }
    // }


    /*****     - BEST PRACTICE -    *****/
    public void drawShape(Shape shape){
        shape.draw();
    }
        
       
    

    
}
