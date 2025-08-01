package Basic;

class Calculate {

    //create a method
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}

public class OopsBasic {
    public static void main(String[] args) {
        Calculate obj = new Calculate();//create obj of calculator class
        int r1 = obj.add(10, 20); // call the method using object

        
    }
}
