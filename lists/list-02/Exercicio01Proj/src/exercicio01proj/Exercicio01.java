package exercicio01proj;

public class Exercicio01 {

    public static void main(String[] args) {
        int c=0;
        while((c++)<11){
            for(int i=0;i<12-c;i++){
                System.out.print("t");
            }
            System.out.println();
        }
    }
    
}
