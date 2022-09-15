public class Squre extends Rectangel {

    @Override
    public void setHight(int hight) {
      
        super.setHight(hight);
        super.setWidth(hight);
    }

    @Override
    public void setWidth(int width) {
      
        super.setWidth(width);
        super.setHight(width);
    }
}
