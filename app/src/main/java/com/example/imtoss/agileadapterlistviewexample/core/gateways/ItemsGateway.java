package com.example.imtoss.agileadapterlistviewexample.core.gateways;

import com.example.imtoss.agileadapterlistviewexample.core.dto.ItemDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by development on 17/10/15.
 */
public class ItemsGateway {

    /**
     * Get items list.
     *
     * @return the list
     */
    public static List<ItemDTO> getItems(){

        List<ItemDTO> itemDTOList = new ArrayList<>();

        for(int i = 0; i < 90; i++){
            itemDTOList.add(new ItemDTO("Title for " + i, " Content for " + i));
        }

        return itemDTOList;
    }
}
