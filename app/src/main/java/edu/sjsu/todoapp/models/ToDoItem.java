package edu.sjsu.todoapp.models;

/**
 * Created by akshaymathur on 8/7/17.
 */

public class ToDoItem {

    private String mItemName;
    private String mItemDescription;
    private String mDateCreated;
    private String mDateEdited;
    private String mDateDue;
    private int mID;
    private String mAssignedTo;

    public ToDoItem(String itemName, String itemDescription, String dateCreated, String dateEdited, String dateDue, int ID, String assignedTo) {
        mItemName = itemName;
        mItemDescription = itemDescription;
        mDateCreated = dateCreated;
        mDateEdited = dateEdited;
        mDateDue = dateDue;
        mID = ID;
        mAssignedTo = assignedTo;
    }

    public String getItemName() {
        return mItemName;
    }

    public void setItemName(String itemName) {
        mItemName = itemName;
    }

    public String getItemDescription() {
        return mItemDescription;
    }

    public void setItemDescription(String itemDescription) {
        mItemDescription = itemDescription;
    }

    public String getDateCreated() {
        return mDateCreated;
    }

    public void setDateCreated(String dateCreated) {
        mDateCreated = dateCreated;
    }

    public String getDateEdited() {
        return mDateEdited;
    }

    public void setDateEdited(String dateEdited) {
        mDateEdited = dateEdited;
    }

    public String getDateDue() {
        return mDateDue;
    }

    public void setDateDue(String dateDue) {
        mDateDue = dateDue;
    }

    public int getID() {
        return mID;
    }

    public void setID(int ID) {
        mID = ID;
    }

    public String getAssignedTo() {
        return mAssignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        mAssignedTo = assignedTo;
    }
}
