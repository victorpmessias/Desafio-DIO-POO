

public class teste {
    
    public static void main(String[] args) {
        int exp = 100;
        int n = 2800;
        int niveis[] = new int[100];
        for(int i = 1; i < 101; i++){
            exp += i * 100 * 0.35;
            niveis[i-1] = exp;
        }

        for(int i = 0; i<100; i++){
            if(n<niveis[i]){
                int nivel = i+1;
                System.out.println(nivel);
                break;
            }
        }
    }
}
