 public class Scope {
    int a =10;
    void b(){
     int a = 20;
     System.out.println(a);
     System.out.println(this.a);
    } 
    public static void main(String[] args){
     Scope s = new Scope();
     s.b();
    }
 } 
    

