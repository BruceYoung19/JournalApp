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
            //NOT SURE WHETHER THE CORRECT MESSAGE NEED TO CHECK WITH Bruce
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

     public String getTime()
     {
       Date today = Calendar.getInstance().getTime();
       SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyyy HH:mm");
       String formattedDate = formatter.format(today);
       return formattedDate;
     }

     public void getData()
     {
       //Getting the Users Name
       System.out.println("What is your name?");
       name = scan.nextLine();
       System.out.println("Name:" + name);

       //Getting the entryNumber
       System.out.println("What is your entryNumber?");
       entryNumber = scan.nextInt();
       System.out.println("Entry Number:" + entryNumber);

       // DO NOT REMOVE THIS
       // THIS IS TO RESOLVE AN ERROR IN THE SCANNER
       scan.nextLine();

       //Getting the dialog
       System.out.println("What is your dialog?");
       dialog = scan.nextLine();
       System.out.println("dialog:" + dialog);

       //getting Time and date
       timeAndDate = getTime();
       System.out.println("Time:" + timeAndDate);
     }

     public void writeData() throws IOException {
      try {
        FileWriter fw = new FileWriter("Journal.csv", true);
        fw.append(name);
        fw.append(",");

        //Converting the entryNumber to string before  Writing text into File
        String cEntryNumber = String.valueOf(entryNumber);

        fw.append(cEntryNumber);
        fw.append(",");

        fw.append(dialog);
        fw.append(",");

        fw.append(timeAndDate);
        fw.append("\n");

        WritingToFile();
        fw.flush();
        fw.close();
     } catch (FileNotFoundException e) {
          //  CREATED ERROR MESSAGE TO HELP DETERMINE WHICH PART OF CODE IS ACTUALLY BREAKING
          System.out.println("Could  NOT write data into file");
      }

 }
}

class NurseAppCompileTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        File source = new File("Journal.csv");
        PeopleInteraction pi = new PeopleInteraction();
        if(source.exists() != true)
        {
          //CREATING THE FILES NEEDED FOR THE PROGRAM
          System.out.println("Sorry missing some components need to generated");
          pi.CreateFile();
        }else if(source.exists() == true)
        {
          // Need to change this message once protype is done
          System.out.println("File Exists");
        }

        pi.FileSetup();
        pi.getData();
        pi.writeData();
    }

}
