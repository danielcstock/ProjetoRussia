public class Placar {
    private Time TimeA, TimeB;
    int GolsTimeA = 0, GolsTimeB = 0;
    int AmarelosTimeA = 0, VermelhosTimeA = 0, AmarelosTimeB = 0, VermelhosTimeB = 0;


    Placar(Time TimeA, Time TimeB){
        try{
            this.TimeA = TimeA;
            this.TimeB = TimeB;
        } catch (Exception excecao){
            throw excecao;
        }
    }

    public void setPlacarTimeA(int gols){
        this.GolsTimeA = gols;
    }

    public void setPlacarTimeB(int gols){
        this.GolsTimeB = gols;
    }

    public void setCartoesTimeA(int amarelos, int vermelhos){
        this.AmarelosTimeA = amarelos;
        this.VermelhosTimeA = vermelhos;
    }

    public void setCartoesTimeB(int amarelos, int vermelhos){
        this.AmarelosTimeB = amarelos;
        this.VermelhosTimeB = vermelhos;
    }

    public int getPlacarTimeA(){
        return this.GolsTimeA;
    }

    public int getPlacarTimeB(){
        return this.GolsTimeB;
    }

    public int getAmarelosTimeA(){
        return this.AmarelosTimeA;
    }

    public int getVermelhosTimeA(){
        return this.VermelhosTimeA;
    }

    public int getAmarelosTimeB(){
        return this.AmarelosTimeB;
    }

    public int getVermelhosTimeB(){
        return this.VermelhosTimeB;
    }
}