package one.digitalinnovation;


public class No {
    private Object object;
    private No refNo;

    public No(){

    }

    public No(Object object){
        this.refNo = null;
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
