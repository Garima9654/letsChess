import "./Board.css";
import Cell from "./Cell";
function Board() {
    const grid = [
        ["R", "N", "B", "Q", "K", "B", "N", "R"], // Black back rank
        ["P", "P", "P", "P", "P", "P", "P", "P"], // Black pawns
        ["", "", "", "", "", "", "", ""],
        ["", "", "", "", "", "", "", ""],
        ["", "", "", "", "", "", "", ""],
        ["", "", "", "", "", "", "", ""],
        ["p", "p", "p", "p", "p", "p", "p", "p"], // White pawns
        ["r", "n", "b", "q", "k", "b", "n", "r"]  // White back rank
    ];
    return (
        <div className="board">
            {
                grid.map((row, rowIndex) => (
                    row.map((piece, colIndex) => (
                        <Cell
                            key={`${rowIndex}-${colIndex}`}
                            piece={piece}
                            isGrey = {(rowIndex%2) == (colIndex%2)} 
                            />
                    ))
                ))
            }
        </div>
    );
}

export default Board;