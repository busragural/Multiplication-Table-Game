
import java.io.Serializable;


public class ChildrenInfo implements Serializable  {
     private static final long serialVersionUID = 1L;
    
    private String childUsername;
    private String childPassword; 

    public ChildrenInfo(String childUsername, String childPassword) {
        this.childUsername = childUsername;
        this.childPassword = childPassword;
    }

    @Override
    public String toString() {
        return "ChildrenInfo{" + "childUsername=" + childUsername + ", childPassword=" + childPassword + '}';
    }

}
