package org.example;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;



    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
       return blocks.stream()
               .filter(e->e.getColor().equals(color))
               .findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
       return blocks.stream()
               .filter(m->m.getMaterial().equals(material))
               .toList();
    }

    @Override
    public int count() {
        int size = blocks.size();
        return size;

    }



}
