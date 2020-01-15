package com.indrasoft;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryReader {
    private List<JavaFile> javaFileList;

    public DirectoryReader(File baseDir) {
        javaFileList = new ArrayList<>();
        processDirectory(baseDir);
    }

    private void processDirectory(File directory) {
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                processDirectory(file);
            } else {
                JavaFile jf = new JavaFile(file);
                if (jf.isJavaFile()) {
                    javaFileList.add(jf);
                    jf.setModule(Module.getModule(jf.getFqcn()));
                    jf.setPurpose(Purpose.getPurpose(jf.getFqcn()));
                }
            }
        }
    }

    public List<JavaFile> getJavaFileList() {
        return javaFileList;
    }
}
