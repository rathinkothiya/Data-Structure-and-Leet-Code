/***
 * 463. Island Perimeter

You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.

Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

 

Example 1:


Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
Output: 16
Explanation: The perimeter is the 16 yellow stripes in the image above.
Example 2:

Input: grid = [[1]]
Output: 4
Example 3:

Input: grid = [[1,0]]
Output: 4
 

Constraints:

row == grid.length
col == grid[i].length
1 <= row, col <= 100
grid[i][j] is 0 or 1.
 * */
//There is no main method in this class.
//You can create a class and give a function call
//or you can directly add this to the leetcode.

class IslandPerimeterSolution {
	
    public int islandPerimeter(int[][] grid) {
		//calculate the length of matrix row and column
    	int row = grid.length;
		int col = grid[0].length;
		
		int per = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				//Add perimeter only if the there is any land
				if (grid[i][j] == 1) {
					//check for the left-most side. if first block is land or the rest of the row has left perimeter is water.
					if (i == 0 || grid[i - 1][j] == 0) {
						per++;
					}
					//check for the top-most side. if first block is land or the rest of the column has top perimeter is water.
					if (j == 0 || grid[i][j - 1] == 0) {
						per++;
					}
					//check for the bottom-most side. if last block is land or the rest of the column has bottom perimeter is water.
                    if(j==col-1 || grid[i][j+1]==0){
                        per++;
                    }
                    //check for the right-most side. if last block is land or the rest of the row has right perimeter is water.
                    if(i==row-1 || grid[i+1][j]==0)
                    {
                        per++;
                    }
				}

			}

		}
    return per;
    }
}