import PointMeta from "./PointMeta.js";

const width = parseInt(prompt("输入地图宽"));
const height = parseInt(prompt("输入地图高"));

const canvas = document.getElementById("map-editor");
const ctx = canvas.getContext("2d");
canvas.width = width;
canvas.height = height;


let pointArray = []
for (let y = 0; y < height; y++) {
    let row = [];
    for (let x = 0; x < width; x++) {
        row.push(new PointMeta(x, y))
    }
    pointArray.push(row)
}

const gridLineColor = "lightgray"
const lineWidth = 1;
const gridSize = 50;

function drawGridLines() {
    ctx.lineWidth = lineWidth
    ctx.strokeStyle = gridLineColor
    // 绘制垂直线
    for (let x = 0; x < width; x += gridSize) {
        ctx.beginPath()
        ctx.moveTo(x, 0)
        ctx.lineTo(x, height)
        ctx.stroke()
    }

    // 绘制水平线
    for (let y = 0; y < height; y += gridSize) {
        ctx.beginPath();
        ctx.moveTo(0, y)
        ctx.lineTo(width, y)
        ctx.stroke()
    }
}

drawGridLines();