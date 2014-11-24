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
    //-------------horizontal--------------
    public boolean checkHorizontal(String w, int row, int col) {
	boolean possible = true;
	int r = row, c = col;
	if (col + w.length() > board[0].length) {
	    return false;
	}
	if (row > board.length) {
	    return false;
	}
	for (int i = 0; i < w.length(); i++) {
	    if (board[r][c] != '.') {
		if (board[r][c] != w.charAt(i)) {
		    return false;
		}
	    }
	    c++;
	}
	return true;
    }

    public void addWordHForward(String w,int row, int col){
	int r = row, c = col;
	if (checkHorizontal(w, r, c) == true) {
	    for (int i = 0; i < w.length() ; i++) {
		board[r][c] = w.charAt(i);
		c++;
	    }
	}
    }

    public void addWordHBackward(String w, int row, int col){
	String newWord = new StringBuilder(w).reverse().toString();
	addWordHForward(newWord, row, col);
    }

    //-------------vertical---------------  
    public  boolean yesVert(String w, int row, int col){
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
    //----------Diagonal Down Right-------------
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

   
    public void addWordDright(String w, int row, int col){
	int r = row, c = col;
	while (checkDownRight(w,r,c)==true){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r++;
		c++;
	    }
	}
    }
    //-----------Diagonal Down Left------------
    public boolean checkDownLeft(String w, int row, int col){
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
	    c--;
	}
	return true;
    }

    public void addWordDleft(String w, int row, int col){
	int r = row, c = col;
	while (checkDownLeft(w,r,c)==true){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r++;
		c--;
	    }
	}
    }


    //-------------Diagonal up right-----------
    public boolean checkUpRight(String w, int row, int col){
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
	    r--;
	    c++;
	}
	return true;
    }
    public void addWordUright(String w, int row, int col){
	int r = row, c = col;
	while (checkUpRight(w,r,c)==true){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r--;
		c++;
	    }
	}
    }



    //---------Diagonal up Left------------

    public boolean checkUpLeft(String w, int row, int col){
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
	    r--;
	    c--;
	}
	return true;
    }

    public void addWordUleft(String w, int row, int col){
	int r = row, c = col;
	while (checkDownLeft(w,r,c)==true){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r--;
		c--;
	    }
	}
    }


    //------------adding words---------
    public boolean addWord(String w){
	Random r=new random();

	char[][] t_board=new board();
	int Row = r.nextInt(board.length);
	int Col = r.nextInt(board[0].length);
	int  style= r.nextInt(7);

	if (style == 0){
	    addWordHForward(w, Row, Col);
	} if (style == 1) {
	    addWordHBackward(w, Row, Col);
	} if (style == 2) {
	    addWordV(w, Row, Col);
	} if (style == 3){
	    addWordDright(w, Row, Col);
	} if (style == 4) {
	    addWordDleft(w, Row, Col);
	} if (style == 5) {
	    addWordUright(w, Row, Col);
	} if (style == 6) {
	    addWordUleft(w, Row, Col);
	}
	if (t_board.equals(board)) {
	    return true;
	} else {
	    return false;
	}
    }


    //------------main---------------

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
      	w.addWordH("hello",3,5);
	w.addWordH("look",3,8);
	w.addWordV("hi",2,3);
	System.out.println(w);
    }
}
