package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        // Forma manual de abrir e fechar Streams
        String path = "c:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String linha = br.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally{
            try{ 
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }    
        }
    }
}
