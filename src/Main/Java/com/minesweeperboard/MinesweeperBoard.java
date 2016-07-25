package Java.com.minesweeperboard;

/**
 * Created by tejasvig on 7/23/2016.
 */
public class MinesweeperBoard {

    String field[][];
    String row,column;

    public void drawField(String input_row_column) {

        String fieldValues[] = input_row_column.split(" ");
        row = fieldValues[0];
        column = fieldValues[1];
        validate(fieldValues, row, column);
    }

    private void validate(String[] fieldValues, String row, String column) {
        if (row.matches("\\d+") && column.matches("\\d+") && (fieldValues.length == 2)) {
            field = new String[Integer.parseInt(row)][Integer.parseInt(column)];
        } else {
            throw new InvalidFieldException();
        }
    }

    public void insertFieldValues(String[][] myField) {


            if (field.length == myField.length)
            {
                field = myField;

            }
            else
            {

                throw new InvalidFieldValuesException();

            }



         /*for(int i=0;i<field.length;i++)
            {
                for (int j = 0; j <field[i].length; j++)
                {
                    System.out.print(field[i][j]);
                }
                System.out.println();
            }*/

}



    public void CalculateOutput(String[][] myField) {

        int solution[][] = new int[10][10];

        for (int i = 0; i <myField.length; i++) {
            for (int j = 0; j <= myField[i].length; j++) {
                solution[i][j] = 0;
            }
        }
        System.out.println(row+" "+column);
        for(int i=0;i<field.length;i++)
        {
            for (int j = 0; j <field[i].length; j++)
            {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i <myField.length; i++)
            for (int j = 0; j < myField[i].length; j++)
                for (int k = i ; k <i + 1; k++)
                    for (int m = j; m <j + 1; m++) {
                        if (myField[k][m]!="*")
                          solution[i][j]++;
                    }



        for (int i = 0; i <myField.length; i++) {
            for (int j = 0; j < myField[i].length; j++) {
                System.out.print(solution[i][j]);
            }
            System.out.println();
        }
    }


    public class InvalidFieldException extends RuntimeException{
    }

    public class InvalidFieldValuesException extends RuntimeException{
    }
}

