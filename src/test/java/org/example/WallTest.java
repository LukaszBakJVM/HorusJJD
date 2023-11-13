package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {

    private List<Block>list = List.of(new CompositeBlock("white","wood"),
            new CompositeBlock("red","metal"),new CompositeBlock("black","metal")
    ,new CompositeBlock("white","paper"));
    private Wall wall =new Wall(list);

    @Test
    void findBlockByColor() {
        Optional<Block> white = wall.findBlockByColor("whi");
        assertEquals(Optional.empty(),white);
    }
    @Test
    void findBlockByColorExist() {
        Optional<Block> white = wall.findBlockByColor("white");
        assertEquals("white",white.get().getColor());
    }

    @Test
    void findBlocksByMaterial() {
        List<Block> woo = wall.findBlocksByMaterial("woo");
        assertEquals(0,woo.size());

    }
    @Test
    void findBlocksByMaterialExist() {
        List<Block> metal = wall.findBlocksByMaterial("metal");
        assertEquals(2,metal.size());

    }

    @Test
    void count() {
        int count = wall.count();
        assertEquals(4,count);
    }
}