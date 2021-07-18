package Move;



public class Move {

    private  int id;
    private  String w;
    private  String s;
    private  String a;
    private  String d;

    public Move(){
        this.id = id;
        this.w = w;
        this.s = s;
        this.a = a;
        this.d = d;
    }

    public static void add(Move loader) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }
    public String getS() {
        return s;
    }

    public  void setS(String s) {
        this.s = s;
    }
    public String getA() {
        return a;
    }

    public  void setA(String a) {
        this.a = a;
    }

    public String getD() {
        return d;
    }

    public  void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return  "ID"+ id + "\n W" + w +"\n S" + s + "\n A" + a + "\n D" + d;
    }
}
