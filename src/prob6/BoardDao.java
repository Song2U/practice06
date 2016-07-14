package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		// Database 에서 데이터를 가져와서 Board 객체를 만들고 List에 저장

		Board board = new Board();
		board.setTitle("제목 1");
		board.setContent("내용1");

		return null;
	}
}