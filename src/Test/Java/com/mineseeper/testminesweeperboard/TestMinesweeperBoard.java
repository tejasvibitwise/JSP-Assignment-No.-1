package Java.com.mineseeper.testminesweeperboard;

import Java.com.minesweeperboard.MinesweeperBoard;
import org.junit.Test;

/**
 * Created by tejasvig on 7/23/2016.
 */
public class TestMinesweeperBoard {

    @Test

    public void isTheFieldValid_CorrectValues()
    {
        //given

        MinesweeperBoard minesweeperBoard=new MinesweeperBoard();

        //when

        minesweeperBoard.drawField("4 4");


        //then

    }

    @Test(expected = MinesweeperBoard.InvalidFieldException.class)

    public void isTheFieldValid_WrongValues()
    {
        //given

        MinesweeperBoard minesweeperBoard=new MinesweeperBoard();

        //when
        minesweeperBoard.drawField("a b");

        //then



    }


    @Test(expected = MinesweeperBoard.InvalidFieldException.class)

    public void isTheFieldValid_WrongCount()
    {
        //given

        MinesweeperBoard minesweeperBoard=new MinesweeperBoard();

        //when
        minesweeperBoard.drawField("a b 3 4");
        //then


    }


    @Test//(expected = MinesweeperBoard.InvalidFieldValuesException.class)

    public void isTheFieldInputValid_CorrectInput()
    {
        //given

        MinesweeperBoard minesweeperBoard=new MinesweeperBoard();
        String myField[][]={
                {"*",".","."},
                {".",".","."},
                {".","*","."},
                {"*",".","."},
                {".",".","."},
                {".","*","."}

        };


        //when

        minesweeperBoard.drawField("6 3");
        minesweeperBoard.insertFieldValues(myField);

        //then

    }


    @Test(expected = MinesweeperBoard.InvalidFieldValuesException.class)

    public void isTheFieldInputValid_WrongInput()
    {
        //given

        MinesweeperBoard minesweeperBoard=new MinesweeperBoard();
        String myField[][]={
                {"*",".","."},
                {".",".","."},
                {".","*","."},
                {"*",".","."},
                {".",".","."},
                {".","*","."}

        };


        //when

        minesweeperBoard.drawField("3 3");
        minesweeperBoard.insertFieldValues(myField);

        //then

    }


@Test

    public void isItGivingCorrectOutput()
{
    //given
    MinesweeperBoard minesweeperBoard=new MinesweeperBoard();
    String myField[][]= {
            {"*", ".", ".","."},
            {".", ".", ".","."},
            {".", "*", ".","."},
            {".", ".", ".","."},

    };

    //when

    minesweeperBoard.drawField("4 4");
    minesweeperBoard.insertFieldValues(myField);
    minesweeperBoard.CalculateOutput(myField);
    //then
}




}
