import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author Bruce
 */

 class PeopleInteraction {
     Scanner scan = new Scanner(System.in);
     String name;
     int entryNumber;
     String dialog;
     String timeAndDate;

     public PeopleInteraction() {
       name = "";
       entryNumber = 0;
       dialog = "";
       timeAndDate = "";

     }

     public void CreateFile() {
         String FileName = "Journal.csv";
         File f = new File(FileName);
     }

     public void FileSetup() throws IOException {
         try {
             FileWriter fw = new FileWriter("Journal.csv", true);
             fw.append("Name");
             fw.append(",");

             fw.append("Entry Number:");
             fw.append(",");

             fw.append("Entry Text:");
             fw.append(",");

             fw.append("Time and Date:");
             fw.append("\n");

             WritingToFile();
             fw.flush();
             fw.close();
         } catch (FileNotFoundException e) {
             System.err.println("This File has not been found");
         }
     }

     public void CountEntry() {
     }

     public void WritingToFile() throws IOException {
         try {
             FileWriter peoplein = new FileWriter("Journal.csv", true);
             String words;

         } catch (FileNotFoundException e) {
             System.out.println();
         }
     }

     public void getTime()
     {
       Date today = Calendar.getInstance().getTime();
       SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy HH:mm");
       String formattedDate = formatter.format(today);
       System.out.println(formattedDate);
     }

     public void getData()
     {
       System.out.println("What is your name?");
       name = scan.hasNextLine();
       System.out.println("Name:" + name);
     }

 }

class NurseAppCompileTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        PeopleInteraction pi = new PeopleInteraction();
        pi.CreateFile();
        pi.FileSetup();
        pi.getData();
    }

}