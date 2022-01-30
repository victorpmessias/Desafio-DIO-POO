package br.com.dio.desafio.dominio;

public  class Nivel {
    private static int niveis[] = new int[100];
    private static int nivel = 0;

    private static void init(Dev dev){
        setNiveisVetor();
        setNivel(dev);
    }

    private static void setNiveisVetor(){
        int exp = 100;

        for(int i = 0; i < 100; i++){
            exp += i+1 * 100 * 0.35;
            niveis[i] = exp;
        }
    }

        private static void setNivel(Dev dev){
            for(int i = 0; i<100; i++){
                if(dev.calcularTotalXp()<niveis[i]){
                    nivel = i+1;
                    break;
                } 
                
            }
    }

    public static int getNivel(Dev dev){
        init(dev);
        return nivel;
    }
}
