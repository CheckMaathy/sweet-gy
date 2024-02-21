package com.github.checkmaathy.controllers;

import com.github.checkmaathy.models.InventoryItemDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    @PutMapping("/inventory")
    public void updateInventory(@RequestBody List<InventoryItemDTO> itemList) {
        // TODO: Adjust calling useCase
        itemList.stream().forEach(item -> item.description());
    }

    @GetMapping("/{itemId}")
    public InventoryItemDTO checkItem(@PathVariable(name = "itemId") String itemId) {
        // TODO: Adjust calling useCase
        return new InventoryItemDTO(itemId, "3", "Mousse de Limão");
    }

}
