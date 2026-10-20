import "./Board.css";

function Cell({piece, isGrey}) {
  const handleClick = () => {
    console.log("Box clicked!");
  };

  return (
    <div onClick={handleClick}>
        <div className={`cell ${isGrey ? "grey": "white"}`}>
            {piece}
        </div>
    </div>
  );
}

export default Cell;