package main.vitaliykyq;

public class Main {

    public static void main(String[] args) {

    	/* Задание */
		/* Создать несколько предложений, используя все типы данных */

		byte King = 18; //max 127
	    short AgeTurtle = 344; //max 32767
		int AgeTurtleInHour = AgeTurtle * 365 * 24; //max 2147483647
		long Eggs = AgeTurtle * 365 * 4; //max 2147483647
		double WeightTurtle = 248.4;
		boolean AliveTurtle = false;
		String NameTurtle = "Алагба";
		float LenghtCarapace = 123.4f;
		char symbol = ';';

		/* String + char */ System.out.println("Имя черепахи: " + NameTurtle + symbol);
		/* boolean + char */ System.out.println("Живая: " + AliveTurtle + symbol);
		/* short  + char */ System.out.println("Возраст: " + AgeTurtle + symbol);
		/* int  + char */ System.out.println("Прожила " + AgeTurtleInHour + " часов" + symbol);
		/* double  + char */ System.out.println("Вес черепахи: " + WeightTurtle + " кг"  + symbol);
		/* float  + char */ System.out.println("Длинна панциря: " + LenghtCarapace + " см"  + symbol);
		/* long  + char */ System.out.println("За свою жизнь черепаха отложила " + Eggs + " яиц"  + symbol);
		/* String + byte  + char */ System.out.println(NameTurtle + " пережила царствование " + King + " королей Обгомошо"  + symbol);

		/* --------------------------------------------------------------------------------------------------------------------------- */
		System.out.println("\n\n");

		/* Задание */
		/* Проверка является ли СЛОВО палиндромом */

		//Ввод нужного слова
		String word = "Слс";

		//Булевая переменная, в которую записывается, является ли слово палиндромом
		boolean Pal = true;

		//Делаем все буквы в слове маленькими
		word = word.toLowerCase();

		//Проходимся по циклу до количества букв в слове
		for(int i = 0; i < word.length(); i++) {
			//Проверяем начало и конец слова(сужаемся постоянно)
			if (word.charAt(i) != word.charAt(word.length() - i - 1)){
				//Как только у нас разные буквы, значит мы записываем, что это слово не является палиндромом, и останавливаем цикл(нету смысла проверять дальше)
				Pal = false;
				break;
			}
		}

		//Выводим определённое сообщение, в зависимости от того, чему равна переменная Pal
		if(Pal) System.out.println("Слово: \"" + word +"\" является полиндромом");
		else System.out.println("Слово: \"" + word +"\" НЕ является полиндромом");


		/* --------------------------------------------------------------------------------------------------------------------------- */
		System.out.println("\n\n");

		/* Задание */
		/* Проверка является ли ФРАЗА палиндромом */


		String SomeWords = "А вижу, жиeва.";

		//Булевая переменная, в которую записывается, является ли слово палиндромом
		boolean Pal2 = true;

		//Создаем новую переменную, с которой будем проделывать все действия
		String SomeWordsNew = SomeWords;

		String SomeWordsNew2 = "";


		int method = 2;

		//Делаем все буквы в слове маленькими
		SomeWordsNew = SomeWordsNew.toLowerCase();

		if(method == 1) {
			//Удаляем все пробелы с новой строки
			SomeWordsNew = SomeWordsNew.replace(" ", "");

			//Заменяем(удаляем) все символы на ничего(Можно было бы их всунуть в массив, и пройтись циклом, но так нагляднее)
			SomeWordsNew = SomeWordsNew.replace(",", "");
			SomeWordsNew = SomeWordsNew.replace("!", "");
			SomeWordsNew = SomeWordsNew.replace("-", "");
			SomeWordsNew = SomeWordsNew.replace(".", "");
			SomeWordsNew = SomeWordsNew.replace("?", "");
			SomeWordsNew = SomeWordsNew.replace(";", "");
			SomeWordsNew = SomeWordsNew.replace("'", "");

		}else if(method == 2){
			for (int i = 0; i < SomeWordsNew.length(); i++) {
				if(SomeWordsNew.charAt(i) != ' ' && SomeWordsNew.charAt(i) != ',' && SomeWordsNew.charAt(i) != '.' && SomeWordsNew.charAt(i) != '!'
				&& SomeWordsNew.charAt(i) != '-' && SomeWordsNew.charAt(i) != '?' && SomeWordsNew.charAt(i) != ';')
					SomeWordsNew2 += SomeWordsNew.charAt(i);
			}
			SomeWordsNew = SomeWordsNew2;
		}

		//Проходимся по циклу до количества букв в слове
		for(int i = 0; i < SomeWordsNew.length(); i++) {
			//Проверяем начало и конец слова(сужаемся постоянно)
			if (SomeWordsNew.charAt(i) != SomeWordsNew.charAt(SomeWordsNew.length() - i - 1)){
				//Как только у нас разные буквы, значит мы записываем, что это слово не является палиндромом, и останавливаем цикл(нету смысла проверять дальше)
				Pal2 = false;
				break;
			}
		}

		//Выводим определённое сообщение, в зависимости от того, чему равна переменная Pal
		if(Pal2) System.out.println("Фраза: \"" + SomeWords +"\" является полиндромом");
		else System.out.println("Фраза: \"" + SomeWords +"\" НЕ является полиндромом");
    }
}
