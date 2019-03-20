import java.util.regex.*;

public class Lab3 {
	public static void main(String[] args){
		String str = "However, the last day of the last month he takes her to a room she'd never set eyes on before. There was day nothing in it but a spinning-wheel and a stool. And says he: \"Now, my dear, here you\'ll be shut in to- morrow with some victuals and some flax, and if you haven\'t spun five skeins by the night, your head\'ll go off.";
		String [] sentenceList = str.split("\\.");
		String [] wordList = sentenceList[0].split("[,\\s]+");
		for(int i = 0; i < wordList.length; i++){
			if (  (str.substring(sentenceList[0].length()).toLowerCase()).matches("(.*)"+wordList[i].toLowerCase()+"(.*)" )){
				System.out.println(wordList[i].trim() + " is in text.");
			} else {
				System.out.println(wordList[i].trim() + " is NOT in text.");
			}
		}

	}
}
/* C3 = 2, type - String
C17 = 2, Знайти таке слово в першому реченні заданого тексту, якого не має в жодному з наступних. */
