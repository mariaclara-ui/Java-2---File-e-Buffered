package File_e_Buffered.Nivel_2_Medio.Aplicativo;

import File_e_Buffered.Nivel_2_Medio.Entidades.Atirador;
import File_e_Buffered.Nivel_2_Medio.Entidades.LutadorCorpoACorpo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("personagens_db.csv");
            BufferedReader bf= new BufferedReader(fr);
            String linha;

            while ((linha=bf.readLine())!=null){
                String[] dados= linha.split(";");

                if (dados[0].equals("L")){
                    LutadorCorpoACorpo lutadorCorpoACorpo= new LutadorCorpoACorpo(dados[1],Integer.parseInt(dados[2]), dados[3]);
                    System.out.println(lutadorCorpoACorpo);
                }else if (dados[0].equals("A")){
                    Atirador atirador = new Atirador(dados[1],Integer.parseInt(dados[2]),dados[3]);
                    System.out.println(atirador);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
