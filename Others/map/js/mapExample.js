const canvas = document.getElementById("gameCanvas");
const ctx = canvas.getContext("2d");

const mapData = [
    [0, 1, 0],
    [2, 3, 3],
    [0, 1, 0]
]

const colors = {
    0: "#c15a5a",
    1: "#46ac46",
    2: "rgba(112,112,193,0.55)",
    3: "#a3a348"
}

const tileSize = 32;

function drawColorMap() {
    for (let y = 0; y < mapData.length; y++) {
        for (let x = 0; x < mapData[y].length; x++) {
            const colorIdx = mapData[y][x]
            const color = colors[colorIdx]
            ctx.fillStyle = color
            ctx.fillRect(x * tileSize, y * tileSize, tileSize, tileSize)
        }
    }
}

drawColorMap()