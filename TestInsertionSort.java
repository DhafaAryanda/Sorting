import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestInsertionSort {
    public static void main(String[] args) throws IOException {
        
        List<String> listOfStrings = new ArrayList<String>();;
        String[] array;

        BufferedReader bf = new BufferedReader(new FileReader("sgb-words.txt"));
        
        String line = bf.readLine();
    
        // checking for end of file
        while (line != null) {
            listOfStrings.add(line);
            line = bf.readLine();
        }
        
        // closing bufferreader object
        bf.close();

        //casting ArrayList to Array
        array = listOfStrings.toArray(new String[0]);
        TimeInterval ti = new TimeInterval();

        ti.startTiming();
        SortArray.insertionSort(array);
        ti.endTiming();

        for (String str : array) {
            System.out.println(str);
        }
        System.out.println("Waktu Pengurutan InsertionSort :" + ti.getElapsedTime());

    }

}
