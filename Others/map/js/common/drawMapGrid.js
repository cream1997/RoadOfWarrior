import PointMeta from "./PointMeta.js";

export default function drawMapGrid(ctxOf2D, width, height) {
    // todo pointArray用来初始化地图格子对象，后续应该有用
    let pointArray = []
    for (let y = 0; y < height; y++) {
        let row = [];
        for (let x = 0; x < width; x++) {
            row.push(new PointMeta(x, y))
        }
        pointArray.push(row)
    }
    function drawGridLines() {
        const gridLineColor = "lightgray"
        const lineWidth = 1;
        const gridSize = 50;

        ctxOf2D.lineWidth = lineWidth
        ctxOf2D.strokeStyle = gridLineColor
        // 绘制垂直线
        for (let x = 0; x < width; x += gridSize) {
            ctxOf2D.beginPath()
            ctxOf2D.moveTo(x, 0)
            ctxOf2D.lineTo(x, height)
            ctxOf2D.stroke()
        }

        // 绘制水平线
        for (let y = 0; y < height; y += gridSize) {
            ctxOf2D.beginPath();
            ctxOf2D.moveTo(0, y)
            ctxOf2D.lineTo(width, y)
            ctxOf2D.stroke()
        }
    }

    drawGridLines();
}