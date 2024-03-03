/*4. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
inteiro, converta para binário. Entrada limitada a 2000.
• O Código deve apresentar, em formato de comentário, como foi definida a condição de
parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;

* Considere usar a saída da função recursiva como String
** Para converter uma variável inteira para String, fazer:
int n = 10;
String s = String.valueOf(n);
*/

package recursividade_lista_3.controller;

public class E04_Controller {
	public E04_Controller() {
		super();
	}

	public StringBuffer dec_to_bin(int value) {
		StringBuffer strBuff = new StringBuffer();
		// CONDIÇÃO DE PARADA
		// Se o valor for maior que 0 continua concatenando os restos das divisões
		// por 2 até que o valor da divisão chegue a 0, indicando o final
		// do processo de conversão
		if (value > 0) {
			// Concatena o resto da divisão por 2
			int resto = value % 2;
			strBuff.append(resto);
			// Concatena com o resultado da próxima chamada da função
			// Passando o resultado da divisão do valor por 2 como parâmetro
			// para prosseguir para obter o próximo bit
			return strBuff.append(dec_to_bin(value / 2));
		}
		return strBuff;
	}
	
	public StringBuffer inverterString(StringBuffer inValue, int start, int end) {
		// Mesma função de inversão de string da E03_Controller.java 
		StringBuffer localBuffer = new StringBuffer();
		if (start >= 0) {
			localBuffer.append(inValue.substring(start, end));
			return localBuffer.append(inverterString(inValue, start - 1, end - 1));
		}
		return localBuffer;
	}
}
