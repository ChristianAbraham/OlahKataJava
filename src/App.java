import java.io.*;

class ProcessTextFile {
    private String dataText = "";
    //read txt file
    public ProcessTextFile(String path){
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

    public void removeDuplicate(){
        String[] data = this.dataText.split(" ");
        String result = "";
        for (int i = 0; i < data.length; i++) {
            if (!result.contains(data[i]))
                result = result.concat(data[i] + " ");
        }
        this.dataText = result.toLowerCase();
        System.out.println(this.dataText);
    }

    public void removePunctuation(){
        String result = "";
        for (int i = 0; i < this.dataText.length(); i++) {
            if (Character.isLetter(this.dataText.charAt(i)) || Character.isSpaceChar(this.dataText.charAt(i)))
                result = result.concat(String.valueOf(this.dataText.charAt(i)));
        }
        this.dataText = result;
        System.out.println(this.dataText);
    }

    public void countWord(){
        String[] data = this.dataText.split(" ");
        System.out.println("Number of words: " + data.length);
    }

    public void writeFile(){
        try {
            File file = new File("src\\output.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(this.dataText);
            bw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}

class Main{
    public static void main(String[] args) {
        ProcessTextFile file = new ProcessTextFile("src\\Cerpen.txt");
        file.removeDuplicate();
        System.out.println(" ");
        file.removePunctuation();
        System.out.println(" ");
        file.countWord();
    }
}