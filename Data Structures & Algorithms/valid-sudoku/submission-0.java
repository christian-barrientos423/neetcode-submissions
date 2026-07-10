class Solution {
    public boolean isValidSudoku(char[][] board) {
    //check rows
    for(int x = 0; x < board.length; x++) {
        HashSet<Character> set = new HashSet<>();
        for(int y = 0; y < board[0].length; y++) {
            char number = board[x][y];
            if (number == '.') {
                continue;
            }
            if (set.contains(number)) {
                return false;
            }
            set.add(number);
        }
    }
    //check columns
    for(int y = 0; y < board[0].length; y++) {
        HashSet<Character> set = new HashSet<>();
        for(int x = 0; x < board.length; x++) {
            char number = board[x][y];
            if (number == '.') {
                continue;
            }
            if (set.contains(number)) {
                return false;
            }
            set.add(number);
        }
    }

    //check square
    for(int x = 0; x < board.length; x = x + 3 ) {
        for(int y = 0; y < board[0].length; y = y + 3) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char number = board[x + i][y + j];
                    if (number == '.') {
                        continue;
                    }
                    if (set.contains(number)) {
                        return false;
                    }
                    set.add(number);
                }
            }
        }
    }
    return true;
    }
}
