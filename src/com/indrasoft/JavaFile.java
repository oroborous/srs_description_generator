package com.indrasoft;

import java.io.File;

public class JavaFile {
    private String fqcn;
    private String className;
    private String description;
    private Module module;
    private Purpose purpose;

    private boolean isJavaFile = false;

    public JavaFile(File file) {
        String fileName = file.getPath();
        int index = fileName.indexOf("com");
        if (index > -1 && fileName.toLowerCase().endsWith(".java")) {
            isJavaFile = true;
            fqcn = fileName.substring(index);
            index = fqcn.lastIndexOf('\\');

            if (index > -1) {
                fqcn = fqcn.replaceAll("\\\\", ".");
                className = fqcn.substring(index + 1);
            }
        }
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public Module getModule() {
        return module;
    }

    public void setFqcn(String fqcn) {
        this.fqcn = fqcn;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public void setJavaFile(boolean javaFile) {
        isJavaFile = javaFile;
    }

    public String getFqcn() {
        return fqcn;
    }

    public String getClassName() {
        return className;
    }

    public boolean isJavaFile() {
        return isJavaFile;
    }

    @Override
    public String toString() {
        return "JavaFile{" +
                "fqcn='" + fqcn + '\'' +
                ", module=" + module +
                ", purpose=" + purpose +
                '}';
    }
}
