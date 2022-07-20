package company.util;

import company.entitiy.info.AdditionalInfo;

public class Faculty extends AdditionalInfo {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public Faculty() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
