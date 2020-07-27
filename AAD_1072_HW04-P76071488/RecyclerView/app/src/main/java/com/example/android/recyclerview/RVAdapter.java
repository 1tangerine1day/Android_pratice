package com.example.android.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.WordViewHolder>  {

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView title;
        public final TextView txt;
        final RVAdapter mAdapter;


        public WordViewHolder(View itemView, RVAdapter adapter) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            txt = itemView.findViewById(R.id.txt);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int mPosition = getLayoutPosition();
            String element = mWordList.get(mPosition);
//            mWordList.set(mPosition, "Clicked! " + element);
//            mAdapter.notifyDataSetChanged();

            Intent newAct = new Intent(context.getApplicationContext(), TextActivity.class);
            newAct.putExtra("EXTRA_SESSION_ID", "This is the ingredients of " + element);
            context.startActivity(newAct);

        }
    }

    private final LinkedList<String> mWordList;
    private LayoutInflater mInflater;
    Context context;

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    public RVAdapter(Context context,
                           LinkedList<String> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
        this.context=context;
    }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent,
                                             int viewType) {
        View mItemView = mInflater.inflate(R.layout.recipe_item,
                parent, false);

        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.title.setText(mCurrent);
        holder.txt.setText("This is a short description of Recipe " + position);
    }

}


