import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DFACheckBasic {
    static final String INPUT_FILE_NAME = "input.txt";

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("DFACheckBasic: No input file specified");
        } else {
            
            try {
                List<String> fileStream = Files.readAllLines(Paths.get(args[0]));
                int noOfLines = fileStream.size();
    
                DFA dfaArr[] = new DFA[noOfLines];
                int index = 0;
    
                for (String string : fileStream) {
                    dfaArr[index] = new DFA(string);
                    System.out.print(string + " ");
        
                    if (dfaArr[index].getAcceptability()) {
                        System.out.println("accepted");
                    } else {
                        System.out.println("rejected");
                    }
        
                    index++;
                }
            } catch (FileNotFoundException e) {
                System.err.println("DFACheckBasic: The file " + args[0] + " could not be found");
            } catch (IOException e){
                System.err.println("DFACheckBasic: The file " + args[0] + " could not be opened");
            }
        }
        

        
    }
}
