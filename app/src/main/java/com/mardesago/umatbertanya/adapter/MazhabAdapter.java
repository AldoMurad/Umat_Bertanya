package com.mardesago.umatbertanya.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.webkit.WebView;
import android.widget.TextView;

import com.mardesago.umatbertanya.R;
import com.mardesago.umatbertanya.activity.DetailMazhabActivity;
import com.mardesago.umatbertanya.model.mazhab;

import net.cachapa.expandablelayout.ExpandableLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Dwi Randy Herdinanto on 11/3/2017.
 */

public class MazhabAdapter extends RecyclerView.Adapter<MazhabAdapter.ViewHolder> {
    private static final int UNSELECTED = -1;

    private RecyclerView recyclerView;
    private List<mazhab> items;
    private int selectedItem = UNSELECTED;

    public MazhabAdapter(RecyclerView recyclerView, List<mazhab> items) {
        this.recyclerView = recyclerView;
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mazhab, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, ExpandableLayout.OnExpansionUpdateListener {
        private ExpandableLayout expandableLayout;
        private TextView expandButton;
        private WebView isi_mazhab;

        public ViewHolder(View itemView) {
            super(itemView);

            expandableLayout = itemView.findViewById(R.id.expandable_layout);
            expandableLayout.setInterpolator(new OvershootInterpolator());
            expandableLayout.setOnExpansionUpdateListener(this);
            expandButton = itemView.findViewById(R.id.expand_button);
            isi_mazhab = itemView.findViewById(R.id.isi_mazhab);

            expandButton.setOnClickListener(this);
        }

        public void bind() {
            int position = getAdapterPosition();
            boolean isSelected = position == selectedItem;

            expandButton.setText(items.get(position).getImmNama());
            expandButton.setSelected(isSelected);
            expandableLayout.setExpanded(isSelected, false);


            //isi_mazhab.getSettings().setJavaScriptEnabled(true);
            isi_mazhab.setBackgroundColor(Color.TRANSPARENT);
            isi_mazhab.loadData(items.get(getAdapterPosition()).getIsiMazhab(), "text/html", "UTF-8");
        }

        @Override
        public void onClick(View view) {
            ViewHolder holder = (ViewHolder) recyclerView.findViewHolderForAdapterPosition(selectedItem);
            if (holder != null) {
                holder.expandButton.setSelected(false);
                holder.expandableLayout.collapse();
            }

            int position = getAdapterPosition();
            if (position == selectedItem) {
                selectedItem = UNSELECTED;
            } else {
                expandButton.setSelected(true);
                expandableLayout.expand();
                selectedItem = position;
            }
        }

        @Override
        public void onExpansionUpdate(float expansionFraction, int state) {
            //Log.d("ExpandableLayout", "State: " + state);
            try{
                if (state == ExpandableLayout.State.EXPANDING) {
                    recyclerView.smoothScrollToPosition(getAdapterPosition());
                }
            }catch (Exception e){

            }
        }
    }
}
