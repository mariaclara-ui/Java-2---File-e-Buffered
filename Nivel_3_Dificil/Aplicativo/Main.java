package File_e_Buffered.Nivel_3_Dificil.Aplicativo;

import File_e_Buffered.Nivel_3_Dificil.Entidades.Desenvolvedor;
import File_e_Buffered.Nivel_3_Dificil.Entidades.Designer;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter bwAprovados = new BufferedWriter(new FileWriter("aprovados_hackathon.txt"));

            BufferedWriter bwPendencias = new BufferedWriter(new FileWriter("pendencias_inscricao.txt"));


            FileReader fr = new FileReader("inscricoes_brutas.txt");
            BufferedReader bf = new BufferedReader(fr);

            String linha;
            while ((linha = bf.readLine()) != null) {
                try {
                    String[] dados = linha.split(";");
                    if (dados.length != 5) {
                        bwPendencias.write(linha);
                        bwPendencias.newLine();
                    } else {
                        if (dados[0].equals("D")) {

                            Desenvolvedor desenvolvedor = new Desenvolvedor(dados[1], Integer.parseInt(dados[2]), dados[3], dados[4]);

                            bwAprovados.write(desenvolvedor.toString());
                            bwAprovados.newLine();

                        } else if (dados[0].equals("G")) {

                            Designer designer = new Designer(dados[1], Integer.parseInt(dados[2]), dados[3], dados[4]);

                            bwAprovados.write(designer.toString());
                            bwAprovados.newLine();

                        } else {

                            bwPendencias.write(linha);
                            bwPendencias.newLine();
                        }
                    }

                }catch(Exception e){
                    bwPendencias.write(linha);
                    bwPendencias.newLine();
                }
            }
                bwAprovados.close();
                bwPendencias.close();

                bf.close();
        }catch(IOException e){
                System.out.println(e.getMessage());
        }

    }
}

