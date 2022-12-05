
public class Main{
    public static void main(String[] args) {
        ProcessTextFile file = new ProcessTextFile("src\\input.txt"); //membaca file input.txt

        System.out.println("Jumlah kata dari file input.txt sebelum diolah: "); //menampilkan pesan jumlah kata sebelum diolah
        file.countWord();

        //Cleaning data
        System.out.println(" ");
        file.removeDuplicate(); //menghapus kata yang duplikat

        System.out.println(" ");
        file.removePunctuation(); //menghapus tanda baca

        System.out.println(" ");
        file.removePrefix(); //menghilangkan awalan

        System.out.println(" ");
        file.writeFile(); //menulis file output.txt

        System.out.println("Jumlah kata dari file input.txt setelah diolah: ");
        file.countWord(); //menghitung jumlah kata setelah diolah
    }
}