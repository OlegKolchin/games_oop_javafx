package ru.job4j.chess.firuges.black;


import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        assertThat(bishop.position(), is(Cell.A1));
    }

    @Test
    public void copy() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        assertThat(bishop.copy(Cell.A3).position(), is(Cell.A3));

    }

    @Test
    public void wayC1toG5() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell array[] = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishop.way(Cell.G5), is(array));

    }

    @Test
    public void wayB6toE3() {
        BishopBlack bishop = new BishopBlack(Cell.B6);
        Cell array[] = new Cell[]{Cell.C5, Cell.D4, Cell.E3};
        assertThat(bishop.way(Cell.E3), is(array));
    }


    @Test(expected = IllegalStateException.class)
    public void throwExceptionWhenC1ToE8() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        bishop.way(Cell.E8);
    }
    @Test
    public void wayC1toA3() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] array = new Cell[]{Cell.B2, Cell.A3};
        assertThat(bishop.way(Cell.A3), is(array));
    }

    @Test(expected = IllegalStateException.class)
    public void throwExceptionWhenC8ToA5() {
        BishopBlack bishop = new BishopBlack(Cell.C8);
        bishop.way(Cell.A5);
    }

    @Test
    public void wayC8toA6() {
        BishopBlack bishop = new BishopBlack(Cell.C8);
        Cell[] array = new Cell[]{Cell.B7, Cell.A6};
        assertThat(bishop.way(Cell.A6), is(array));
    }
}

