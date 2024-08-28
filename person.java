public class person {
    private int a;
    private String s;
    private Long k;
    private double d;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }
    public Long getK() {
        return k;
    }
    public void setK(Long k) {
        this.k = k;
    }
    public double getD() {
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }
    public person(int a, String s, Long k, double d) {
        this.a = a;
        this.s = s;
        this.k = k;
        this.d = d;
    }
    @Override
    public String toString() {
        return "person [a=" + a + ", s=" + s + ", k=" + k + ", d=" + d + "]";
    }
    
}
