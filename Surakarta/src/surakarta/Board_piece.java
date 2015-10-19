
public class Board_piece {
	private char icon;
	private int id;

	public enum Side {
		shell, pebble
	};

	private Side side;
	private int board_piece_location_x;
	private int board_piece_location_y;

	public char getIcon() {
		return icon;
	}

	public int getId() {
		return id;
	}

	public Side getSide() {
		return side;
	}

	public int getBoard_piece_location_x() {
		return board_piece_location_x;
	}

	public int getBoard_piece_location_y() {
		return board_piece_location_y;
	}

	public void setIcon(char icon) {
		this.icon = icon;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public void setBoard_piece_location_x(int board_piece_location_x) {
		this.board_piece_location_x = board_piece_location_x;
	}

	public void setBoard_piece_location_y(int board_piece_location_y) {
		this.board_piece_location_y = board_piece_location_y;
	}

}
