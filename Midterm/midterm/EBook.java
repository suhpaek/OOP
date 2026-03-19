package midterm;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class EBook extends Book{
    private String filetype;
    private String link;

    @Override
    public void taking() {
        System.out.println("We are closed");
    }

    public void taking(String filetype) {
        System.out.println("Books with " + filetype + "file type are not easy to read");
    }
}
