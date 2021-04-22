
package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        Figure bishopBlack = new BishopBlack(Cell.D4);
        Cell checkPosition = bishopBlack.position();
        assertThat(checkPosition, is(Cell.D4));
    }

    @Test
    public void copy() {
        Figure bishopBlack = new BishopBlack(Cell.D4);
        Figure copy = bishopBlack.copy(Cell.D4);
        assertThat(copy.position(), is(Cell.D4));
    }

    @Test
    public void way() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
}