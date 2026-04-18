package outros;
public class Teste {
    public static void main(String[] args) {
        int [] v = {1,5,8,4,9,0};
        busca(v);
        
    }

    public static int busca(int []v){
        int maior = 0;
        for(int i = 0; i < v.length; i++){
            if (v[i] > v[maior]) {
                maior = i;
            }
        }
        return maior;
        // System.out.println(v[maior]);

    }
    

}
