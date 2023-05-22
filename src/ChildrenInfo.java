
import java.io.Serializable;


public class ChildrenInfo implements Serializable  {
    private static final long serialVersionUID = 1L;
 
    private String childUsername;
    private String childPassword; 

    public ChildrenInfo( String childUsername, String childPassword) {
      
        this.childUsername = childUsername;
        this.childPassword = childPassword;
    }

    @Override
    public String toString() {
        return "ChildrenInfo{" + "childUsername=" + childUsername + ", childPassword=" + childPassword + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChildrenInfo other = (ChildrenInfo) obj;
        
        return this.childUsername.equals(other.childUsername) && this.childPassword.equals(other.childPassword);
    }

}
