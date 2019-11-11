package arrays.rodrigorodrigues;

public class ArrayPag69 {

	public static void main(String[] args) {

		int[] arrayNum = { 2, 9, 1, 5, 8, 3 };

		char[] arrayChar = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'x', 'z' };

		int aux;

		System.out.print("Array de números desordenado:" + arrayNum[0] + +arrayNum[1] + arrayNum[2] + arrayNum[3]
				+ arrayNum[4] + arrayNum[5]);

		for (int i = 0; i < arrayNum.length - 1; i++) {

			if (arrayNum[i] > arrayNum[i + 1]) {
				aux = arrayNum[i];
				arrayNum[i] = arrayNum[i + 1];
				arrayNum[i + 1] = aux;
			}
			for (int j = 0; j < arrayNum.length - 1; j++) {
				if (arrayNum[j] > arrayNum[j + 1]) {
					aux = arrayNum[j];
					arrayNum[j] = arrayNum[j + 1];
					arrayNum[j + 1] = aux;
				}
			}
		}

		System.out.print("\nArray de números ordenados:  " + arrayNum[0] + +arrayNum[1] + arrayNum[2] + arrayNum[3]
				+ arrayNum[4] + arrayNum[5]);

		System.out.print("\n\nArray de chars crescente:    ");
		for (int i = 0; i < arrayChar.length - 1; i++) {
			System.out.print("" + arrayChar[i] + arrayChar[i + 1] + arrayChar[i + 2]);
			i += 2;
		}

		char aux1;
		for (int i = 0; i < arrayChar.length - 1; i++) {

			if (arrayChar[i] < arrayChar[i + 1]) {
				aux1 = arrayChar[i];
				arrayChar[i] = arrayChar[i + 1];
				arrayChar[i + 1] = aux1;
			}
			for (int j = 0; j < arrayChar.length - 1; j++) {
				if (arrayChar[j] < arrayChar[j + 1]) {
					aux1 = arrayChar[j];
					arrayChar[j] = arrayChar[j + 1];
					arrayChar[j + 1] = aux1;
				}
			}
		}
		System.out.print("\nArray de chars descrescente: ");
		for (int i = 0; i < arrayChar.length - 1; i++) {
			System.out.print("" + arrayChar[i] + arrayChar[i + 1] + arrayChar[i + 2]);
			i += 2;
		}

	}
}
