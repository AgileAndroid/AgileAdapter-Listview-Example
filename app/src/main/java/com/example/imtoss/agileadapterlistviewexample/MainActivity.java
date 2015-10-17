package com.example.imtoss.agileadapterlistviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.agileandroid.ui.adapters.AgileAdapter;
import com.agileandroid.ui.adapters.view.dto.AgileAdapterDTO;
import com.example.imtoss.agileadapterlistviewexample.core.dto.ItemDTO;
import com.example.imtoss.agileadapterlistviewexample.core.gateways.ItemsGateway;
import com.example.imtoss.agileadapterlistviewexample.ui.adapters.interactors.ItemInteractor;
import com.example.imtoss.agileadapterlistviewexample.ui.adapters.populators.ItemPopulator;
import com.example.imtoss.agileadapterlistviewexample.ui.adapters.viewresolvers.ItemViewResolver;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView)findViewById(R.id.list_view);

        ItemViewResolver itemViewResolver = new ItemViewResolver();
        ItemPopulator itemPopulator = new ItemPopulator();
        ItemInteractor itemInteractor = new ItemInteractor();

        AgileAdapterDTO agileAdapterDTO
                = new AgileAdapterDTO(itemViewResolver, itemPopulator, itemInteractor);

        List<ItemDTO> itemDTOList = ItemsGateway.getItems();

        AgileAdapter agileAdapter
                = new AgileAdapter(itemDTOList, agileAdapterDTO);

        listView.setAdapter(agileAdapter);
    }
}
