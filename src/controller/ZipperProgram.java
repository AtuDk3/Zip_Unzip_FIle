package controller;

import common.Algorithsm;
import common.Library;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Menu;

public class ZipperProgram extends Menu<String>{
    static String[] mc = {"Compression", "Extraction","Exit"};
    
    private Library library;
    private Algorithsm algorithsm;
    
    public ZipperProgram() {
        super("========= Zipper program =========", mc);
        library = new Library();
        algorithsm = new Algorithsm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
            {
                try {
                    algorithsm.zipFile();
                } catch (IOException ex) {
                    Logger.getLogger(ZipperProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

            case 2:
            {
                try {
                    algorithsm.unzipFile();
                } catch (IOException ex) {
                    Logger.getLogger(ZipperProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

            case 3:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }   
    

}