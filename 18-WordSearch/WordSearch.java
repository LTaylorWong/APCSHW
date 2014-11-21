/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{

    private char[][] board;
    
    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
				
    }
    public WordSearch(){
	this(20,30);
    }
    
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public void addWordH(String w,int row, int col){
	int r = row, c = col;
	while (board[r][c] == "."){
	    if (r<=board[r].length- w.length()){
		if(c<board[r][c]){
		    for (int i=0;i<w.length();i++){
			board[r][c] = w.charAt(i);
			c++;
		    }
	
		}
	    }
	}
    }
    
    public  boolean yesVert(String w, int row, col){
	int r= row, c= col;
	boolean yes = true;
	if (row>board.length){
	    return false;
	}if (col> board[0].length){
	    return false;
	}for (int i=0;i<w.length();i++){
	    if (board[r][c]=="."){
		if(board[r][c] != w.charAt(i)){
		   return false;
		}
	    }
	    r=r+1;
	}
	return true;
    }
    public void addWordV(String w, int row, int col){
	int r = row, c = col;
	while (yesVert(w,r,c)==true){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r++;
	    }
	}
    }

    public boolean checkDownRight(String w, int row, int col){
	int r = row, c =col;
	if (row+w.length()>board.length){
	    return false;
	}if (col+w.length()>board[0].length){
	    return false;
	}for (int i=0;i<w.length();i++){
	    if (board[r][c]=="."){
		if(board[r][c] != w.charAt(i)){
		    return false;
		}
	    }
	    r++;
	    c++;
	}
	return true;
    }



    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello",3,5);
	w.addWordH("look",3,8);
	//w.addWordH("look",3,5);
	//w.addWordH("hello",100,5);
	//w.addWordH("hello",30,555);
	w.addWordV("hi",2,3);
	System.out.println(w);
    }
}
