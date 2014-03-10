package view;

import java.util.ArrayList;
import java.util.List;

public class Model {
    
    private String test1;
    private String test2;

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public String getTest2() {
        return test2;
    }
    
    
    public List<Model> getListModels() {
        List<Model> listModels = new ArrayList<Model>();
        
        Model model = null;
        for (int i = 0; i <= 100; i++) {
            model = new Model();
            model.setTest1("Test " + i);
            model.setTest2("Test " + i);
            listModels.add(model);
        }
        
        return listModels;
    }


}
