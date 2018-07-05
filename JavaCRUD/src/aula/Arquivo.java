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
		//Grava��o
		FileWriter arq = new FileWriter("e:\\teste.txt", true); //true diz ao m�todo que o pr�ximo texto ser� acrescentado, n�o reescrito 
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
	    		 System.out.println("linha: " + i + " | conte�do: " + linha);
	    	 }
	    	 linha = lerArq.readLine();
	     }
	     arqleitura.close();
	}
	
	public void deletar (String texto) throws IOException{ //Recebe o texto a ser deletado
		//Strings para cria��o e exclus�o dos arquivos .txt com o m�todo File
		String arquivo = "e:\\teste.txt";
	    String arquivoTmp = "e:\\testetmp.txt";
	    
	    //este m�todo exclui um registro de acordo com sua posi��o no array
	    
	    //Grava��o
		FileWriter arq = new FileWriter(arquivoTmp, true); /* salva o que ser� escrito em um arquivo temporario.
															*true diz ao m�todo que o pr�ximo texto ser� acrescentado, n�o reescrito*/ 
		PrintWriter gravarArq = new PrintWriter(arq);
			
		//Leitura
		FileReader arqleitura = new FileReader(arquivo);
		BufferedReader lerArq = new BufferedReader(arqleitura);
		
		ArrayList <String> nome = new ArrayList();

	    String linha; 
	    
	    while ((linha = lerArq.readLine()) != null) { //vari�vel linha recebe o valor lido com o m�todo lerArq
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
		
		//Strings para cria��o de exclus�o dos arquivos .txt com o m�todo File
		String arquivo = "e:\\teste.txt";
	    String arquivoTmp = "e:\\testetmp.txt";
	    
	    //Grava��o
		FileWriter arq = new FileWriter(arquivoTmp, true);/* salva o que ser� escrito em um arquivo temporario.
		 												   *true diz ao m�todo que o pr�ximo texto ser� acrescentado, n�o reescrito*/  
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
		//arq.atualizar("Jos�", "Carol");
		//arq.leitura("Carlos");
	}	
}
