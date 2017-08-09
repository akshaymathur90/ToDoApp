package edu.sjsu.todoapp.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import edu.sjsu.todoapp.R;
import edu.sjsu.todoapp.databinding.TodoListItemBinding;
import edu.sjsu.todoapp.models.ToDoItem;
import edu.sjsu.todoapp.viewmodels.ToDoItemViewModel;

/**
 * Created by akshaymathur on 8/7/17.
 */

public class ToDoItemAdapter extends RecyclerView.Adapter<ToDoItemAdapter.ToDoItemViewHolder> {
    private List<ToDoItem> mToDoItems;
    private Context mContext;


    public ToDoItemAdapter(List<ToDoItem> toDoItems, Context context) {
        mToDoItems = toDoItems;
        mContext = context;
    }

    @Override
    public ToDoItemAdapter.ToDoItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        TodoListItemBinding todoListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext())
                , R.layout.todo_list_item,parent,false);
        return new ToDoItemViewHolder(todoListItemBinding);
    }

    @Override
    public void onBindViewHolder(ToDoItemAdapter.ToDoItemViewHolder holder, int position) {
        TodoListItemBinding todoListItemBinding = holder.mBinding;
        todoListItemBinding.setTodoitem(new ToDoItemViewModel(mContext,mToDoItems.get(position)));

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ToDoItemViewHolder extends RecyclerView.ViewHolder{

        private TodoListItemBinding mBinding;
        public ToDoItemViewHolder(TodoListItemBinding todoListItemBinding) {
            super(todoListItemBinding.todoItemTitle);
            mBinding=todoListItemBinding;
        }
    }
}
