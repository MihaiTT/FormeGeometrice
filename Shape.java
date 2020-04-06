import java.util.Objects;

public class Shape {
     String text;
     String material;

    public Shape(){
    }
    public Shape(String text,String material){
        this.text=text;
        this.material=material;
    }
    public double getSize(){
        return -1;
    }
    @Override
    public String toString() {
        return "facut din "+this.material+", textul:"+this.text;
    }
    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)==true)
            return true;
        if(obj==null || this.getClass()!=obj.getClass())
            return false;
        Shape shObj=(Shape)obj;
        if(this.text.equals(shObj.text) && this.material.equals(shObj.material))
            return true;
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(text, material);
    }

}
