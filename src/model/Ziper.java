package model;

public class Ziper {
    private String srcFolder, disFolder, nameFile;

    public Ziper() {
    }

    public Ziper(String srcFolder, String disFolder, String nameFile) {
        this.srcFolder = srcFolder;
        this.disFolder = disFolder;
        this.nameFile = nameFile;
    }

    public String getSrcFolder() {
        return srcFolder;
    }

    public void setSrcFolder(String srcFolder) {
        this.srcFolder = srcFolder;
    }

    public String getDisFolder() {
        return disFolder;
    }

    public void setDisFolder(String disFolder) {
        this.disFolder = disFolder;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }
}
