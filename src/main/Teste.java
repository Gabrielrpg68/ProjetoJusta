package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine();
		
		//Posições das Chaves e Valores
		List<Integer> posicaoKey = new ArrayList<>();
		List<Integer> posicaoValue = new ArrayList<>();

		//For que encontra a posição das chaves
		int posicao2 = 0;
        for (int i = 3; i > 0; i--) {
          	posicaoKey.add(string.indexOf("key", posicao2));
        	posicao2 = posicaoKey.get(posicaoKey.size()-1) + 1;
        }
        //For que encontra a posição dos Valores
        int posicao3 = 0;
        for (int i = 3; i > 0; i--) {
          	posicaoValue.add(string.indexOf("value", posicao3));
        	posicao3 = posicaoValue.get(posicaoValue.size()-1) + 1;
        }
        
        //Lista de pessoas para adicionar a chave de cada pessoa.
        List<String> pessoa = new ArrayList<>();
        
        //For que usa a posição das palavras "key" e "value" para encontrar a chave e valor na string
        
        int cont = 0;
        for (int i = 0; i < 3; i++) {
        	String key = string.substring(posicaoKey.get(i) + 5, posicaoValue.get(i) - 2);
        	String value = string.substring(posicaoValue.get(i) + 7, posicaoValue.get(i) + 9);
        	int value2 = Integer.parseInt(value);
        	if (value2 < 29) {
        		cont++;
        		pessoa.add(key);
        	}
        }
        
        //Output do numero de pessoas e suas Strings
        System.out.print(cont + " pessoa(s): ");
        for (String nome : pessoa) {
        	System.out.print(nome + ",");
        };
        
  
        
        
 	}

}
