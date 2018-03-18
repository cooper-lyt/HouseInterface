package cc.coopersoft.house.sale.data;

import java.io.Serializable;

/**
 * Created by cooper on 18/10/2017.
 */
public class Word implements Serializable {

    private String id;

    private String name;

    public Word() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
