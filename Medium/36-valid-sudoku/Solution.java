class Solution {
    public boolean isValidSudoku(char[][] board) {
    HashSet <String> seen = new HashSet<>();

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){

                char num = board[i][j];

                if ( num == '.') continue;

                String rowkey = "row" +  i  + num ;
                String colkey = "col" + j + num ;
                String boxkey = "box" + (i/3) * 3 + (j/3) + num;
                
                if(!seen.add(rowkey) || !seen.add(colkey) || !seen.add(boxkey)){
                    return false;
                }
            }
        }
        return true;
    }
}