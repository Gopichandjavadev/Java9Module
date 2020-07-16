package easytext;

import easytextcli.PrintDoc;

public class Main {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //if (args.length == 1) {
        for (String arg : args) {
            System.out.println(arg);
        }
            System.out.println("Please provide file name "+args.length);
        //}
            
        PrintDoc doc = new PrintDoc();
        doc.print();
    }
}
