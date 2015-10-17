package com.example.imtoss.agileadapterlistviewexample.ui.adapters.populators;

import com.agileandroid.ui.adapters.recycler.builder.AgileRecyclerBuilder;
import com.agileandroid.ui.adapters.view.populator.Populator;
import com.example.imtoss.agileadapterlistviewexample.core.dto.ItemDTO;
import com.example.imtoss.agileadapterlistviewexample.ui.adapters.viewresolvers.ItemViewResolver;

/**
 * Created by development on 17/10/15.
 */
public class ItemPopulator extends Populator {

    @Override
    public void populate(AgileRecyclerBuilder agileRecyclerBuilder) {

        final ItemViewResolver.ItemHolder itemHolder
                = (ItemViewResolver.ItemHolder)agileRecyclerBuilder.getHolderRecycler();

        final ItemDTO itemDTO = (ItemDTO)agileRecyclerBuilder.getItem();

        itemHolder.getTitleTextView().setText(itemDTO.getTitle());
        itemHolder.getContentTextView().setText(itemDTO.getContent());
    }
}
