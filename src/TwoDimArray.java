public class TwoDimArray {
    private int sum;

    public int getSum(String[][] twoDimArray){
        sum = 0;
        if(twoDimArray.length < 4 ){
            throw new MyArraySizeException("Size main array less 4");
        }else if(twoDimArray.length >4 ){
            throw new MyArraySizeException("Size main array more 4");
        }else{
            for (int i = 0; i < 4; i++) {
                if(twoDimArray[i].length < 4 ){
                    throw new MyArraySizeException(String.format("Size %d nested array less 4", i+1));
                }else if(twoDimArray[i].length > 4 ){
                    throw new MyArraySizeException(String.format("Size %d nested array more 4", i+1));
                }else{
                    for (int j = 0; j < 4; j++) {
                        try {
                            sum += Integer.parseInt(twoDimArray[i][j]);
                        }catch (NumberFormatException e){
                            throw new MyArrayDataException(e.getMessage(),i,j);
                        }
                    }
                }
            }
        }
        return sum;
    }
}
