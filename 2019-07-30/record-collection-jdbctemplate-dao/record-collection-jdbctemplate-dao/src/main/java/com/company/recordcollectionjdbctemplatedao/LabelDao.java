package com.company.recordcollectionjdbctemplatedao;


import java.util.List;

public interface LabelDao {

    Label addLabel(Label label);

    Label getLabel(int id);

    List<Label> getAllLabels();

    void updateLabel(Label label);

    void deleteLabel(int id);

}

