import java.io.*;


public class LeitorArquivo{
    
    public void lerArquivo(String arquivo){
        try{
            BufferedReader br = new BufferedReader(new FileReader("escalacao.txt"));
            while(br.ready()){
                String linha = br.readLine();
                System.out.println(linha);
            }
        } catch(IOException ioe){
			ioe.printStackTrace();
		} 
    }
}