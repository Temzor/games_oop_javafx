package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.white.BishopWhite;

public class LogicTest {

    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = OccupiedCellException.class)
    public void getOccupiedCellExceptionTest()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.D2));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = FigureNotFoundException.class)
    public void getFigureNotFoundExceptionTest()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C2, Cell.H7);
    }

    @Test(expected = FigureNotFoundException.class)
    public void cleanFigureTest()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.clean();
        logic.move(Cell.C2, Cell.H7);
    }

        @Test(expected = OccupiedCellException.class)
        public void whenThrowOccupiedException()
        throws OccupiedCellException, FigureNotFoundException, ImpossibleMoveException {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.C1));
            logic.add(new BishopWhite(Cell.G5));
            logic.move(Cell.C1, Cell.G5);
        }
}