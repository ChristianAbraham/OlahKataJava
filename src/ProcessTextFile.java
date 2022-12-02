import java.io.*;

public class ProcessTextFile {
    private String dataText = "";

    //membaca txt file
    public ProcessTextFile(String path){
        //mencoba untuk membaca file dengan exception handling
        try {
            File file = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                this.dataText = this.dataText.concat(" " + st);
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    //menghapus kata yang duplikat
    public void removeDuplicate(){
        String[] data = this.dataText.split(" ");
        String result = "";
        for (int i = 0; i < data.length; i++) {
            if (!result.contains(data[i]))
                result = result.concat(data[i] + " ");
        }
        this.dataText = result.toLowerCase();
        System.out.println("Duplicate removed"); //menampilkan pesan bahwa kata duplikat telah dihapus
    }

    //menghapus tanda baca
    public void removePunctuation(){
        String result = "";
        for (int i = 0; i < this.dataText.length(); i++) {
            if (Character.isLetter(this.dataText.charAt(i)) || Character.isSpaceChar(this.dataText.charAt(i)))
                result = result.concat(String.valueOf(this.dataText.charAt(i)));
        }
        this.dataText = result;
        System.out.println("Punctuation removed"); //menampilkan pesan bahwa punctuation telah dihapus
    }

    //Menghilangkan awalan 
    public void removePrefix(){
        String[] prefix = {"di", "meng", "ke", "memper", "mem", "ber", "ter", "per", "men",  "diper", "keter", "peng", "pen", "pem", "meny", "mengge",};
        String[] data = this.dataText.split(" ");
        String result = "";
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < prefix.length; j++) {
                if (data[i].startsWith(prefix[j]))
                    data[i] = data[i].substring(prefix[j].length());
            }
            result = result.concat(data[i] + " ");
        }
        this.dataText = result;
        System.out.println("Prefix removed"); //menampilkan pesan bahwa prefix sudah dihilangkan
    }

    //menghitung jumlah kata
    public void countWord(){
        String[] data = this.dataText.split(" ");
        System.out.println("Number of words: " + data.length);
    }

    //menulis ke hasil proses ke file output.txt
    public void writeFile(){
        //mencoba untuk menulis file dengan exception handling
        try {
            File file = new File("src\\output.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(this.dataText);
            bw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("File written"); //menampilkan pesan bahwa file berhasil ditulis
    }

}

