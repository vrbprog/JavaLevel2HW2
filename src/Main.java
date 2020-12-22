public class Main {
    public static void main(String[] args) {
        int s = 0;
        String[][] matrix = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "ghghg"},
                {"1", "2", "3", "4"}
        };

        try {
            s = new TwoDimArray().getSum(matrix);
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println("Invalid data in cell[" + e.getI() +"]" + "[" + e.getJ() + "]");
        }

        System.out.println(s);

    }
}
