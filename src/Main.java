public class Main{
    public static void main(String[] args) {
        ProcessTextFile file = new ProcessTextFile("src\\Cerpen.txt");
        file.removeDuplicate();
        System.out.println(" ");
        file.removePunctuation();
        System.out.println(" ");
        file.countWord();
        System.out.println(" ");
        file.removePrefix();
        file.writeFile();
    }
}