
package cache;

import java.sql.Timestamp;

public class Cache {
    private Object[] result;
    private Timestamp tempexp;

    public Cache(Object[] result, Timestamp temp) {
        this.result = result;
        this.tempexp = temp;
    }

    public Cache() {
    }

    public Object[] getResult() {
        return result;
    }

    public void setResult(Object[] result) {
        this.result = result;
    }

    public Timestamp getTempexp() {
        return tempexp;
    }

    public void setTempexp(Timestamp tempexp) {
        this.tempexp = tempexp;
    }
    
    
    
}

