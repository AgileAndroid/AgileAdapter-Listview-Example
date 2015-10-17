package com.example.imtoss.agileadapterlistviewexample.ui.adapters.viewresolvers;

import android.view.View;
import android.widget.TextView;

import com.agileandroid.ui.adapters.recycler.holder.HolderRecycler;
import com.agileandroid.ui.adapters.view.resolver.ViewResolver;
import com.example.imtoss.agileadapterlistviewexample.R;

/**
 * Created by development on 17/10/15.
 */
public class ItemViewResolver extends ViewResolver {

    @Override
    protected HolderRecycler getHolder(View convertView) {
        return new ItemHolder(convertView);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.list_item_layout;
    }

    /**
     * The type Item holder.
     */
    public static final class ItemHolder extends HolderRecycler {

        /**
         * Gets title text view.
         *
         * @return the title text view
         */
        public TextView getTitleTextView() {
            return titleTextView;
        }

        /**
         * Gets content text view.
         *
         * @return the content text view
         */
        public TextView getContentTextView() {
            return contentTextView;
        }

        private TextView titleTextView;
        private TextView contentTextView;

        /**
         * Instantiates a new Recycler holder.
         *
         * @param itemView the item view
         */
        public ItemHolder(View itemView) {
            super(itemView);

            this.titleTextView = (TextView) itemView.findViewById(R.id.item_title);
            this.contentTextView = (TextView) itemView.findViewById(R.id.item_content);
        }
    }
}
