public class Main{
    public static void main(String[] args) {
        ProcessTextFile file = new ProcessTextFile("src\\input.txt");
        file.removeDuplicate();
        System.out.println(" ");
        file.removePunctuation();
        System.out.println(" ");
        file.countWord();
        System.out.println(" ");
        file.removePrefix();
        System.out.println(" ");
        file.writeFile();
    }
}