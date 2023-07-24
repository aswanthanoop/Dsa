public class wordSearch {
    class Solution {
        boolean visited[][];
        public boolean exist(char[][] board, String word) {
            int rows = board.length;
            int columns = board[0].length;
            visited = new boolean[rows][columns];
    
            for(int i = 0;i<rows;i++){
                for(int j = 0;j<columns;j++){
                    if(word.charAt(0) == board[i][j] && searchWord(i,j,0,word,board)){
                        return true;
                    }
    
                }
            }
            return false;
            
        }
        public boolean searchWord(int i,int j ,int index, String word, char[][] board){
            if(index == word.length()) return true;
    
            if(i<0 || i>= board.length || j<0 || j>= board[i].length || word.charAt(index) != board[i][j] || visited[i][j]){
                return false;
            }
            visited[i][j] = true;
    
            if(searchWord(i+1,j,index + 1, word,board) || searchWord(i-1,j,index + 1, word,board) || searchWord(i,j + 1,index + 1, word,board) || searchWord(i,j - 1,index + 1, word,board)){
                return true;
            }
            visited[i][j] = false;
            return false;
        }
    }
    
}
