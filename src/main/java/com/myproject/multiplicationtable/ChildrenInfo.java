package com.myproject.multiplicationtable;

import java.io.Serializable;

public class ChildrenInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String childUsername;
    private String childPassword;

    public ChildrenInfo(String childUsername, String childPassword) {

        this.childUsername = childUsername;
        this.childPassword = childPassword;
    }

    public ChildrenInfo() {

    }

    public String getChildUsername() {
        return childUsername;
    }

    public String getChildPassword() {
        return childPassword;
    }

    public void setChildUsername(String childUsername) {
        this.childUsername = childUsername;
    }

    public void setChildPassword(String childPassword) {
        this.childPassword = childPassword;
    }

    @Override
    public String toString() {
        return "ChildrenInfo{" + "childUsername=" + childUsername + ", childPassword=" + childPassword + '}';
    }

    // needed for LoginPage line 179
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {                    // do they have the same referance
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {   // their class is different
            return false;
        }
        ChildrenInfo other = (ChildrenInfo) obj;

        return this.childUsername.equals(other.childUsername) && this.childPassword.equals(other.childPassword);
    }

}
