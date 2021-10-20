import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Converter {


    private String stringToOutput = "";
    private File file;
    private PrintWriter out;

    public Converter(){

    }

    private void createFile() throws FileNotFoundException {
        file = new File("Test.json");
        out = new PrintWriter(file);

        out.print("[");

    }

    public boolean convert(Person p) throws FileNotFoundException {
        String tmp = "";
        if(out == null){
            createFile();
        }

        if(stringToOutput.length() > 0){

        if(String.valueOf(stringToOutput.charAt(stringToOutput.length()-1)).equals("}")){
            tmp += ",";
        }
        }

        stringToOutput += "{\"name:\":\"" +p.getName() +"\",\"age\":"+p.getAge()+"}";
        tmp = tmp+"{\"name:\":\"" +p.getName() +"\",\"age\":"+p.getAge()+"}";

        out.print(tmp);

        return true;
    }

    public void endStream(){
        out.print("]");
        out.close();
    }
}
