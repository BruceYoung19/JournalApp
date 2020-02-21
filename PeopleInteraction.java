/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nurseapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Bruce
 */
public class PeopleInteraction {

    public PeopleInteraction() {
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

}
