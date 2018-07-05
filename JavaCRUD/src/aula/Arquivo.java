package aula;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Arquivo {
	
	
	public void inserir(String texto) throws IOException{		
		//Gravação
		FileWriter arq = new FileWriter("e:\\teste.txt", true); //true diz ao método que o próximo texto será acrescentado, não reescrito 
		PrintWriter gravarArq = new PrintWriter(arq);
					
		gravarArq.println(texto);
		
		arq.close();
		
	}
	
	public void leitura(String texto) throws IOException{
		//Leitura
		 FileReader arqleitura = new FileReader("e:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 i++;
	    	 if(linha.contains(texto)) {
	    		 System.out.println("linha: " + i + " | conteúdo: " + linha);
	    	 }
	    	 linha = lerArq.readLine();
	     }
	     arqleitura.close();
	}
	
	public void deletar (String texto) throws IOException{ //Recebe o texto a ser deletado
		//Strings para criação e exclusão dos arquivos .txt com o método File
		String arquivo = "e:\\teste.txt";
	    String arquivoTmp = "e:\\testetmp.txt";
	    
	    //este método exclui um registro de acordo com sua posição no array
	    
	    //Gravação
		FileWriter arq = new FileWriter(arquivoTmp, true); /* salva o que será escrito em um arquivo temporario.
															*true diz ao método que o próximo texto será acrescentado, não reescrito*/ 
		PrintWriter gravarArq = new PrintWriter(arq);
			
		//Leitura
		FileReader arqleitura = new FileReader(arquivo);
		BufferedReader lerArq = new BufferedReader(arqleitura);
		
		ArrayList <String> nome = new ArrayList();

	    String linha; 
	    
	    while ((linha = lerArq.readLine()) != null) { //variável linha recebe o valor lido com o método lerArq
	        if (!linha.contains(texto)) { //se linha conter o texto digitado...
	            nome.add(linha); //exclui o texto
	        }
	        linha = lerArq.readLine();
	    }
	    
	    for(int i = 0; i < nome.size() ; i++ ) {
			gravarArq.println(nome.get(i)); 
		}

	    lerArq.close();        
        gravarArq.close();

	     new File(arquivo).delete(); //deleta o arquivo antigo
	     new File(arquivoTmp).renameTo(new File(arquivo)); //renomeia o arquivo temporario com o mesmo nome do arquivo antigo

	}
	
	public void atualizar (String texto, String textNew) throws IOException{
		
		//Strings para criação de exclusão dos arquivos .txt com o método File
		String arquivo = "e:\\teste.txt";
	    String arquivoTmp = "e:\\testetmp.txt";
	    
	    //Gravação
		FileWriter arq = new FileWriter(arquivoTmp, true);/* salva o que será escrito em um arquivo temporario.
		 												   *true diz ao método que o próximo texto será acrescentado, não reescrito*/  
		PrintWriter gravarArq = new PrintWriter(arq);
			
		//Leitura
		FileReader arqleitura = new FileReader(arquivo);
		BufferedReader lerArq = new BufferedReader(arqleitura);
		
		String linha;
		
		ArrayList <String> nome = new ArrayList();
	     
	    while ((linha = lerArq.readLine()) != null) {
	    	if (linha.contains(texto)) {
	    		nome.add(textNew); //substitui o texto antigo pelo novo texto digitado
	        }
	    	linha = lerArq.readLine();
	    }

	    for(int i = 0; i < nome.size() ; i++ ) {
			gravarArq.println(nome.get(i)); 
		}
	    
	     lerArq.close();        
         gravarArq.close();

	     new File(arquivo).delete(); //deleta o arquivo antigo
	     new File(arquivoTmp).renameTo(new File(arquivo)); //renomeia o arquivo temporario com o mesmo nome do arquivo antigo
	          
	 }
		     
	public static void main(String args[]) throws Exception {
		
		Arquivo arq = new Arquivo();
		//arq.inserir("maria");
		arq.deletar("maria");
		//arq.atualizar("José", "Carol");
		//arq.leitura("Carlos");
	}	
}
