public class Main {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "отель", "пятизвездочный", "машина", "дерево", "самурай", "компютер", "доска", "снег", "тел", "номер"};
        String[] wordListwo = {"камера", "плита", "носки", "люди", "БМВ", "такси", "шапка", "дождь", "клава", "шнур", "штанга", "мышь"};
        String[] wordListThree = {"курица", "фазан", "собака", "ребенок", "кот", "танцы", "девушка", "тест", "снг"};

        int oneLength = wordListOne.length;
        int twoLength = wordListwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Все что нам нужно это: " + phrase);
    }
}