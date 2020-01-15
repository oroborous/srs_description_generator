package com.indrasoft;

import javax.swing.*;
import java.io.*;
import java.util.List;

public class ClassDescriptionGenerator {

    private static final String WORKSPACE = "C:\\Users\\moogi\\eclipse-workspace";

    public ClassDescriptionGenerator() throws IOException {
        File file = new File("classDescriptions.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        PrintWriter pr = new PrintWriter(br);

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(WORKSPACE));
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int response = fileChooser.showDialog(null, "Choose base directory");
        if (response == JFileChooser.APPROVE_OPTION) {
            File baseDirectory = fileChooser.getSelectedFile();
            DirectoryReader reader = new DirectoryReader(baseDirectory);

            List<JavaFile> javaFileList = reader.getJavaFileList();

            String project = baseDirectory.toString().substring(baseDirectory.toString().lastIndexOf('\\') + 1);

            for (JavaFile jf : javaFileList) {
//                if (jf.getModule() == null || jf.getPurpose() == null)
//                    System.out.println(jf);
                String desc = jf.getPurpose() == null ? "  " : jf.getPurpose().getDescription();
                desc = desc.substring(0, 1).toUpperCase() + desc.substring(1);
                String moduleName = jf.getModule() == null ? "  " : jf.getModule().getModuleName();
                String line = project + "\t" + jf.getFqcn() + "\t" + moduleName + "\t" + desc;
                System.out.println(line);
                pr.write(line + "\n");
            }
        }

        pr.flush();
        pr.close();
    }

    public static void main(String[] args) throws IOException {
        new ClassDescriptionGenerator();
    }

}
