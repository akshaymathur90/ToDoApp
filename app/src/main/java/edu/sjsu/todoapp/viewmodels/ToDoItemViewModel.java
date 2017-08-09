package edu.sjsu.todoapp.viewmodels;

import android.content.Context;
import android.databinding.BaseObservable;

import edu.sjsu.todoapp.models.ToDoItem;

/**
 * Created by akshaymathur on 8/9/17.
 */

public class ToDoItemViewModel extends BaseObservable {

    private Context mContext;
    private ToDoItem mToDoItem;

    public ToDoItemViewModel(Context context, ToDoItem toDoItem) {
        mContext = context;
        mToDoItem = toDoItem;
    }

    public String getItemTitle(){
        return mToDoItem.getItemName();
    }
}
