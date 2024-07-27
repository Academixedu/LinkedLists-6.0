package selfPractise;
import java.util.*;
public class Person2 {
    String ss;
    boolean bb;
    float ff;
    public String getSs() {
        return ss;
    }
    public void setSs(String ss) {
        this.ss = ss;
    }
    public boolean isBb() {
        return bb;
    }
    public void setBb(boolean bb) {
        this.bb = bb;
    }
    public float getFf() {
        return ff;
    }
    public void setFf(float ff) {
        this.ff = ff;
    }
    public Person2(String ss, boolean bb, float ff) {
        this.ss = ss;
        this.bb = bb;
        this.ff = ff;
    }
    @Override
    public String toString() {
        return "Person2 [ss=" + ss + ", bb=" + bb + ", ff=" + ff + "]";
    }
    
}
