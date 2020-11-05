package com.fox.nest_recycler.models;
import java.util.List;

public class ParentItem {
    private String ParentItemTitle;
    private List<ChildItem> ChildItemList;

    public ParentItem(String ParentItemTitle, List<ChildItem> ChildItemList) {
        this.ParentItemTitle = ParentItemTitle;
        this.ChildItemList = ChildItemList;
    }

    // Getter and Setter methods
    // for each parameter
    public String getParentItemTitle() {
        return ParentItemTitle;
    }

    public void setParentItemTitle(String parentItemTitle) {
        ParentItemTitle = parentItemTitle;
    }

    public List<ChildItem> getChildItemList() {
        return ChildItemList;
    }

    public void setChildItemList(List<ChildItem> childItemList) {
        ChildItemList = childItemList;
    }
}

