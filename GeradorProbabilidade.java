public class GeradorProbabilidade {
    public int CalcularProbabilidade(Double porcentagem){
        int p = (int)(Math.random()*porcentagem);
        return p;
    }
}
