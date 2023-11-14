package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;



    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        for (Block b : blocks) {
            if (b.getColor().equals(color)) {
                return Optional.of(b);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> blockList = new ArrayList<>();
        for (Block b : blocks) {
            if (b.getMaterial().equals(material)) {
                blockList.add(b);
            }

        }
        return blockList;
    }

    @Override
    public int count() {
        int size = blocks.size();
        return size;

    }



}
