import dept.Subject;
import dept.CSE;
import dept.ECE;
import dept.CE;
import dept.ME;


public class Main {
    public static void main(String[] args) {
        Subject cse = new CSE();
        Subject ece = new ECE();
        Subject me = new ME();
        Subject ce = new CE();
        
        cse.display_subjects();
        System.out.println();
        ece.display_subjects();
        System.out.println();
        me.display_subjects();
        System.out.println();
        ce.display_subjects();
    }
}
