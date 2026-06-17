package File_e_Buffered.Nivel_1_facil.Aplicativo;
import File_e_Buffered.Nivel_1_facil.Entidades.Musica;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Musica>playlist=new ArrayList<>();

        playlist.add(new Musica("I Said I Love You First... And You Said It Back ","Selena Gomes",2025));
        playlist.add(new Musica("Nirvana","Lonely day",2006));
        playlist.add(new Musica("Sorry","Justin Bieber",2015));
        playlist.add(new Musica("Estilo cachorro","Racionais",2002));


        try {

            FileWriter fw=new FileWriter("minha_playlist.txt");
            BufferedWriter bw= new BufferedWriter(fw);
            for (Musica musica : playlist) {
                bw.write(musica.toString());
                bw.newLine();
            }

            bw.close();

            System.out.println("Arquivo salvo");
        }catch (IOException e){
            System.out.println("ERRO");
        }
        try {
            FileReader fr = new FileReader("minha_playlist.txt");
            BufferedReader br= new BufferedReader(fr);

            String linha;
            while ((linha=br.readLine()) != null){
                System.out.println(linha);
            }
            br.close();
        }catch (IOException e){
            System.out.println(e.getMessage());

        }

    }

}
