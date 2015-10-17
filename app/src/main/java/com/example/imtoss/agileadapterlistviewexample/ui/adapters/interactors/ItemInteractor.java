package com.example.imtoss.agileadapterlistviewexample.ui.adapters.interactors;

import android.view.View;
import android.widget.Toast;

import com.agileandroid.ui.adapters.recycler.builder.AgileRecyclerBuilder;
import com.agileandroid.ui.adapters.view.interactor.Interactor;
import com.example.imtoss.agileadapterlistviewexample.core.dto.ItemDTO;
import com.example.imtoss.agileadapterlistviewexample.ui.adapters.viewresolvers.ItemViewResolver;

/**
 * Created by development on 17/10/15.
 */
public class ItemInteractor extends Interactor {

    @Override
    public void setInteraction(final AgileRecyclerBuilder agileRecyclerBuilder) {

        final ItemViewResolver.ItemHolder itemHolder
                = (ItemViewResolver.ItemHolder)agileRecyclerBuilder.getHolderRecycler();

        final ItemDTO itemDTO = (ItemDTO)agileRecyclerBuilder.getItem();

        itemHolder.getTitleTextView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        agileRecyclerBuilder.getContext(),
                        itemDTO.getTitle() + " clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
